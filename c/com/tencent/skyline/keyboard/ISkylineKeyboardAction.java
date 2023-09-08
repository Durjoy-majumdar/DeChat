package com.tencent.skyline.keyboard;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/skyline/keyboard/ISkylineKeyboardAction;", "", "", "type", "params", "Lrx3/b0;", "showKeyboard", "hideKeyboard", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public interface ISkylineKeyboardAction {
    void hideKeyboard();

    void showKeyboard(String str, String str2);
}
