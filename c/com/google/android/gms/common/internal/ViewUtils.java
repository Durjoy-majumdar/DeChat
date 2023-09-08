package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;

public class ViewUtils {
    private ViewUtils() {
    }

    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
                sb.append(packageName);
                sb.append(":string/");
                sb.append(substring);
                resources.getValue(sb.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(typedValue).length());
            }
        }
        if (z2 && attributeValue == null) {
            new StringBuilder(String.valueOf(str2).length() + 33);
        }
        return attributeValue;
    }
}
