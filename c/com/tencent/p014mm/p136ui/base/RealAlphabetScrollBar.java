package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.RealAlphabetScrollBar */
public class RealAlphabetScrollBar extends VerticalScrollBar {
    public RealAlphabetScrollBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo174288c() {
        this.f348303f = new String[]{ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
        this.f348301d = 1.3f;
        this.f348302e = 79;
    }

    public int getToastLayoutId() {
        return C0966R.C0971layout.bz8;
    }
}
