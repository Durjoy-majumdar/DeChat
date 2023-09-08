package com.tencent.p014mm.sdk.platformtools;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;

/* renamed from: com.tencent.mm.sdk.platformtools.ClipbroadHelperImpl30 */
class ClipbroadHelperImpl30 implements ClipboardHelper.IClipboard {
    public Intent getIntent(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getIntent();
    }

    public CharSequence getText(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getText();
    }

    public Uri getUri(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getUri();
    }

    public void setIntent(Context context, CharSequence charSequence, Intent intent) {
        ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newIntent(charSequence, intent));
    }

    public void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
        setText(context, charSequence, charSequence2, (String) null);
    }

    public void setUri(Context context, CharSequence charSequence, Uri uri) {
        ((ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newRawUri(charSequence, uri));
    }

    public void setText(Context context, CharSequence charSequence, CharSequence charSequence2, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard");
        if (!Util.isNullOrNil(str)) {
            clipboardManager.setPrimaryClip(ClipData.newHtmlText(charSequence, charSequence2, str));
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
        }
    }
}
