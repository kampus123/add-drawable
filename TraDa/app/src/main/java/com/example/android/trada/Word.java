package com.example.android.trada;

//Lớp Word {@link Word} đại diện cho từ vựng mà người dùng muốn học.
//Nó chứa một bản dịch tiếng Việt và bản dịch tiếng Anh cho từ đó.
public class Word {

    //Từ tiếng Việt
    private String mViTranslation;

    //Từ tiếng Anh
    private String mEnTranslation;

    /* Tạo mới một đối tượng của lớp Word
     * @thông số viTranslation là từ tiếng Việt
     * @thông số enTranslation là từ tiếng Anh
     */
    public Word(String viTranslation, String enTranslation){
        mViTranslation = viTranslation;
        mEnTranslation = enTranslation;
    }

    //Lấy từ tiếng Việt
    public String getViTranslation(){
        return mViTranslation;
    }

    //Lấy từ tiếng Anh
    public String getEnTranslation(){
        return mEnTranslation;
    }

}
