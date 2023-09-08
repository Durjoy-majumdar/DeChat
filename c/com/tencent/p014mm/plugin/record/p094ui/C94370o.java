package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TranslateMessageResultEvent;
import com.tencent.p014mm.plugin.record.p094ui.TranslateHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import pe3.C89349b;
import qg2.C62617u0;

/* renamed from: com.tencent.mm.plugin.record.ui.o */
public class C94370o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f272752d;

    /* renamed from: e */
    public final /* synthetic */ int f272753e;

    /* renamed from: f */
    public final /* synthetic */ TranslateMessageResultEvent f272754f;

    /* renamed from: g */
    public final /* synthetic */ TranslateHelper.C943452 f272755g;

    /* renamed from: com.tencent.mm.plugin.record.ui.o$a */
    public class C94371a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f272756d;

        public C94371a(int i) {
            this.f272756d = i;
        }

        public void run() {
            TranslateHelper.this.mo129734c(this.f272756d, false);
        }
    }

    public C94370o(TranslateHelper.C943452 r1, String str, int i, TranslateMessageResultEvent translateMessageResultEvent) {
        this.f272755g = r1;
        this.f272752d = str;
        this.f272753e = i;
        this.f272754f = translateMessageResultEvent;
    }

    public void run() {
        int i;
        boolean z;
        try {
            C62617u0 a = TranslateHelper.this.mo129732a(new Integer(this.f272752d).intValue());
            int i2 = this.f272753e;
            if (i2 == 0) {
                a.f177824f = Util.escapeSqlValue(this.f272754f.f265243d.f265246c);
                a.f177825g = Util.escapeSqlValue(Util.nullAsNil(this.f272754f.f265243d.f265250g));
                byte[] bArr = this.f272754f.f265243d.f265251h;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                a.f177826h = new C89349b(bArr);
                a.f177827i = this.f272754f.f265243d.f265252i;
                a.f177823e = 2;
                TranslateHelper.this.f272691b.notifyDataSetChanged();
                TranslateHelper translateHelper = TranslateHelper.this;
                if (translateHelper.f272693d && (i = a.f177822d + 1) < translateHelper.f272692c.f272698a.size()) {
                    TranslateHelper translateHelper2 = TranslateHelper.this;
                    String str = translateHelper2.f272692c.f272698a.get(i).f299301f;
                    translateHelper2.getClass();
                    if (Util.isNullOrNil(str)) {
                        z = false;
                    } else {
                        int indexOf = str.indexOf(58);
                        if (indexOf != -1) {
                            str = str.substring(indexOf + 1);
                        }
                        z = LocaleUtil.isChineseAppLang() ? translateHelper2.f272695f.matcher(str).find() : translateHelper2.f272696g.matcher(str).find();
                    }
                    if (z) {
                        MMHandlerThread.postToMainThread(new C94371a(i));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 == 3) {
                Context context = TranslateHelper.this.f272690a;
                C76879j.m92726T(context, context.getResources().getString(C0966R.string.bch));
            } else if (i2 != 5) {
                Context context2 = TranslateHelper.this.f272690a;
                C76879j.m92726T(context2, context2.getResources().getString(C0966R.string.bc7));
            }
            TranslateHelper.this.f272691b.notifyDataSetChanged();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TranslateHelper", "translateListener id:%s Exception:%s %s", Util.nullAs(this.f272752d, ""), e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
