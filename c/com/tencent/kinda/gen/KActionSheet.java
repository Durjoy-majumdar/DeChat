package com.tencent.kinda.gen;

public interface KActionSheet {
    void addButtonImpl(String str, VoidCallback voidCallback);

    void setCancelButtonTitle(String str);

    void setDestructiveIndex(int i);

    void setTitle(String str);

    void show();
}
