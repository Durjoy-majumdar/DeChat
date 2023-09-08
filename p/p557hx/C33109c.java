package p557hx;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.rubbishbin.RubbishBinServiceImpl;
import di3.C86301e;
import ei3.C86522b;
import p542gx.C32565b;

@C86522b
/* renamed from: hx.c */
public class C33109c extends C86301e implements C32565b {
    public void c50(Context context, int i, int i2, String str) {
        try {
            Intent intent = new Intent(context, RubbishBinServiceImpl.class);
            intent.putExtra("exec_time", i);
            intent.putExtra("interval", i2);
            intent.putExtra("exec_tag", str);
            context.startService(intent);
        } catch (Exception | IllegalStateException unused) {
        }
    }
}
