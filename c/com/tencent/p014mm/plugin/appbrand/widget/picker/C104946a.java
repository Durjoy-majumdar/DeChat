package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.a */
public class C104946a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ YANumberPicker f311674a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104946a(YANumberPicker yANumberPicker, String str) {
        super(str);
        this.f311674a = yANumberPicker;
    }

    public void handleMessage(Message message) {
        int i;
        int i2 = message.what;
        if (i2 == 1) {
            int i3 = 0;
            if (!this.f311674a.f311672y0.mo145037c()) {
                YANumberPicker yANumberPicker = this.f311674a;
                if (yANumberPicker.f311631a1 == 0) {
                    yANumberPicker.mo148999n(1);
                }
                YANumberPicker yANumberPicker2 = this.f311674a;
                yANumberPicker2.f311628X0.sendMessageDelayed(yANumberPicker2.mo148982g(1, 0, 0, message.obj), 32);
                return;
            }
            YANumberPicker yANumberPicker3 = this.f311674a;
            if (yANumberPicker3.f311659q1 != 0) {
                if (yANumberPicker3.f311631a1 == 0) {
                    yANumberPicker3.mo148999n(1);
                }
                YANumberPicker yANumberPicker4 = this.f311674a;
                int i4 = yANumberPicker4.f311659q1;
                int i5 = yANumberPicker4.f311649l1;
                if (i4 < (-i5) / 2) {
                    i3 = (int) ((((float) (i5 + i4)) * 300.0f) / ((float) i5));
                    yANumberPicker4.f311672y0.mo145038d(0, yANumberPicker4.f311661r1, 0, i5 + i4, i3 * 3);
                    YANumberPicker yANumberPicker5 = this.f311674a;
                    i = yANumberPicker5.mo148995j(yANumberPicker5.f311661r1 + yANumberPicker5.f311649l1 + yANumberPicker5.f311659q1);
                } else {
                    int i6 = (int) ((((float) (-i4)) * 300.0f) / ((float) i5));
                    yANumberPicker4.f311672y0.mo145038d(0, yANumberPicker4.f311661r1, 0, i4, i6 * 3);
                    YANumberPicker yANumberPicker6 = this.f311674a;
                    i = yANumberPicker6.mo148995j(yANumberPicker6.f311661r1 + yANumberPicker6.f311659q1);
                    i3 = i6;
                }
                this.f311674a.postInvalidate();
            } else {
                yANumberPicker3.mo148999n(0);
                YANumberPicker yANumberPicker7 = this.f311674a;
                i = yANumberPicker7.mo148995j(yANumberPicker7.f311661r1);
            }
            YANumberPicker yANumberPicker8 = this.f311674a;
            Message g = yANumberPicker8.mo148982g(2, yANumberPicker8.f311604F, i, message.obj);
            YANumberPicker yANumberPicker9 = this.f311674a;
            if (yANumberPicker9.f311670x0) {
                yANumberPicker9.f311629Y0.sendMessageDelayed(g, (long) (i3 * 2));
            } else {
                yANumberPicker9.f311628X0.sendMessageDelayed(g, (long) (i3 * 2));
            }
        } else if (i2 == 2) {
            YANumberPicker.m140698a(this.f311674a, message.arg1, message.arg2, message.obj);
        }
    }
}
