package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.ClipboardManager;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;

/* renamed from: com.tencent.mm.sdk.platformtools.ClipbroadHelperImplBelow30 */
class ClipbroadHelperImplBelow30 implements ClipboardHelper.IClipboard {
    public Intent getIntent(Context context) {
        return null;
    }

    public CharSequence getText(Context context) {
        return ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).getText();
    }

    public Uri getUri(Context context) {
        return null;
    }

    public void setIntent(Context context, CharSequence charSequence, Intent intent) {
    }

    public void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
        ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).setText(charSequence2);
    }

    public void setUri(Context context, CharSequence charSequence, Uri uri) {
    }

    public void setText(Context context, CharSequence charSequence, CharSequence charSequence2, String str) {
        setText(context, charSequence, charSequence2);
    }
}
