package vt0;

import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.plugin.appbrand.widget.picker.YANumberPicker;

/* renamed from: vt0.o */
public class C111615o extends Handler {

    /* renamed from: a */
    public final /* synthetic */ YANumberPicker f334110a;

    public C111615o(YANumberPicker yANumberPicker) {
        this.f334110a = yANumberPicker;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 2) {
            YANumberPicker.m140698a(this.f334110a, message.arg1, message.arg2, message.obj);
        } else if (i == 3) {
            this.f334110a.requestLayout();
        }
    }
}
