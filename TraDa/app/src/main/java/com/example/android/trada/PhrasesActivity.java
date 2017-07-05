package com.example.android.trada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Tạo mảng chứa các từ
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Xin chào!", "Hello!"));
        words.add(new Word("Bạn tên là gì?", "What is your name?"));
        words.add(new Word("Tôi tên là...", "My name is..."));
        words.add(new Word("Bạn cảm thấy thế nào?", "How are you feeling?"));
        words.add(new Word("Rất tốt.", "Very good."));
        words.add(new Word("Anh ta là...", "He is..."));
        words.add(new Word("Cô ấy là...", "Her name is..."));
        words.add(new Word("Tôi thích nghe nhạc.", "I like listening to music."));
        words.add(new Word("Bạn có rảnh không?", "Are you free?"));
        words.add(new Word("Chào mừng bạn đến Việt Nam!", "Welcome to Viet Nam!"));

        // Tạo {@link ArrayAdapter}, có nguồn dữ liệu là một danh sách các chuỗi. Các
        // adapter biết cách tạo bố cục cho mỗi mục trong danh sách, sử dụng
        // simple_list_item_1.xml được định nghĩa trong Android Framework.
        // Danh sách item layout này chứa một {@link TextView} duy nhất, mà adapter sẽ đặt thành
        // hiển thị một từ.
        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        // Tìm đối tượng {@link ListView} trong view hierarchy của {@link Activity}.
        // Cần có một {@link ListView} với ID là list, được khai báo trong
        // tệp bố cục word_list
        ListView listView = (ListView) findViewById(R.id.list);

        // Thực hiện {@link ListView} sử dụng {@link ArrayAdapter} đã tạo ra ở trên để
        // {@link ListView} sẽ hiển thị danh sách item cho mỗi từ trong danh sách.
        // Thực hiện việc này bằng cách gọi phương thức setAdapter trên đối tượng {@link ListView} và chuyển qua
        // 1 đối số, đó là {@link ArrayAdapter} với tên biến là itemAdapter.
        listView.setAdapter(adapter);
    }
}
