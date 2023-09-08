package k11;

import android.content.Intent;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.HashMap;
import wy0.C102506a;

public final /* synthetic */ class v$$x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290529d;

    /* renamed from: e */
    public final /* synthetic */ Intent f290530e;

    public /* synthetic */ v$$x(CleanChattingUI cleanChattingUI, Intent intent) {
        this.f290529d = cleanChattingUI;
        this.f290530e = intent;
    }

    public final void run() {
        long j;
        CleanChattingUI cleanChattingUI = this.f290529d;
        Intent intent = this.f290530e;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        String stringExtra = intent.getStringExtra("key_username");
        if (stringExtra != null) {
            C99086u uVar = (C99086u) ((HashMap) cleanChattingUI.f267909u).get(stringExtra);
            if (uVar != null) {
                long longExtra = intent.getLongExtra("key_delete_image_size", 0);
                long j2 = longExtra + 0;
                long[] jArr2 = uVar.f290497b;
                jArr2[0] = jArr2[0] - longExtra;
                jArr2[1] = jArr2[1] - longExtra;
                jArr2[2] = jArr2[2] - longExtra;
                long longExtra2 = intent.getLongExtra("key_delete_video_size", 0);
                long j3 = j2 + longExtra2;
                long[] jArr3 = uVar.f290497b;
                jArr3[0] = jArr3[0] - longExtra2;
                jArr3[1] = jArr3[1] - longExtra2;
                jArr3[3] = jArr3[3] - longExtra2;
                long longExtra3 = intent.getLongExtra("key_delete_file_size", 0);
                long j4 = j3 + longExtra3;
                long[] jArr4 = uVar.f290497b;
                jArr4[0] = jArr4[0] - longExtra3;
                jArr4[1] = jArr4[1] - longExtra3;
                jArr4[4] = jArr4[4] - longExtra3;
                long longExtra4 = intent.getLongExtra("key_delete_misc_size", 0);
                j = j4 + longExtra4;
                long[] jArr5 = uVar.f290497b;
                jArr5[0] = jArr5[0] - longExtra4;
                jArr5[1] = jArr5[1] - longExtra4;
            } else {
                j = 0;
            }
            C102506a.m135309i(9, intent.getLongExtra("key_delete_time", 0), Long.valueOf(j));
            cleanChattingUI.mo127435K7();
        }
    }
}
