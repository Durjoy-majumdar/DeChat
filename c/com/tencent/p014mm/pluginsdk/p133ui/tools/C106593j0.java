package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.vfs.C86013q1;
import k92.C108976d;
import te3.C101828pe0;
import te3.C51173ry;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.j0 */
public class C106593j0 extends C108976d {

    /* renamed from: z */
    public static C106593j0 f318511z = new C106593j0();

    /* renamed from: u */
    public String f318512u = "";

    /* renamed from: v */
    public String f318513v = "";

    /* renamed from: w */
    public String f318514w = "";

    /* renamed from: x */
    public int f318515x = 0;

    /* renamed from: y */
    public boolean f318516y = false;

    /* renamed from: Z */
    public static String m143936Z(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            if (lastIndexOf < 0 || lastIndexOf == str.length()) {
                lastIndexOf = 0;
            }
            return str.substring(lastIndexOf, str.length());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "get file name error " + e.getMessage());
            return " ";
        }
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return false;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return false;
    }

    /* renamed from: H */
    public void mo124068H(boolean z, int i) {
        if (z) {
            Log.m105924i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            mo160090r((Bitmap) null, true);
            PlaySound.play(MMApplicationContext.getContext(), C0966R.string.lgu);
            Context context = MMApplicationContext.getContext();
            Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            intent.putExtra("key_reader_sdk_window_close", true);
            try {
                context.sendBroadcast(intent);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "closeQb() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        return super.mo67896U(i, this.f318516y);
    }

    /* renamed from: a0 */
    public void mo153319a0(String str, String str2, String str3, int i, C51173ry ryVar) {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s fileName:%s sence:%s", str, str2, str3, Integer.valueOf(i));
        mo35809D(4, C56887p.m65609c(str));
        this.f318512u = str;
        this.f318513v = str2;
        this.f318514w = str3;
        if (TextUtils.isEmpty(str3)) {
            this.f318514w = m143936Z(str);
        }
        this.f318516y = false;
        this.f318515x = i;
        mo160099Y(ryVar);
        C101828pe0 pe02 = new C101828pe0();
        pe02.f299160d = false;
        pe02.f299161e = str;
        pe02.f299162f = str2;
        pe02.f299167n = C86013q1.m106451l(str);
        pe02.f299165i = Integer.valueOf(i).intValue();
        try {
            this.f326418a.field_data = pe02.toByteArray();
            mo160075M();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", e, "", new Object[0]);
        }
        this.f326418a.mo80305m2().f183755h = this.f318513v;
        this.f326418a.mo80305m2().f183752e = this.f318514w;
        mo160075M();
    }

    /* renamed from: t */
    public long mo138110t() {
        return 1500;
    }
}
