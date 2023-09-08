package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C7994b0;
import java.util.List;
import nj3.C11184p0;
import qo3.C77407n;
import te3.C48768av3;
import te3.C52310zu3;

/* renamed from: com.tencent.mm.chatroom.ui.b1 */
public class C1207b1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C52310zu3 f10236d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f10237e;

    /* renamed from: f */
    public final /* synthetic */ ManageChatroomUI f10238f;

    /* renamed from: com.tencent.mm.chatroom.ui.b1$a */
    public class C1208a implements C7994b0.C7997c {
        public C1208a() {
        }

        /* renamed from: a */
        public void mo1114a(boolean z, String str, String str2) {
            C48768av3 av32;
            if (z && (av32 = C1207b1.this.f10238f.f108076j) != null && !Util.isNullOrNil((List) av32.f130782e)) {
                C48768av3 av33 = C1207b1.this.f10238f.f108076j;
                av33.f130781d--;
                try {
                    av33.f130782e.removeFirst();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.ManageChatroomUI", e.getMessage());
                }
                ManageChatroomUI.m43240H7(C1207b1.this.f10238f);
            }
        }
    }

    public C1207b1(ManageChatroomUI manageChatroomUI, C52310zu3 zu32, C77407n nVar) {
        this.f10238f = manageChatroomUI;
        this.f10236d = zu32;
        this.f10237e = nVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            C7994b0.C7996b bVar = new C7994b0.C7996b();
            bVar.f26678d = this.f10236d.f146229d;
            bVar.f26684j = this.f10238f.f108078o;
            bVar.f26686o = 1;
            ((C7994b0) C86312j.m106911c(C7994b0.class)).l60(this.f10238f.getContext(), bVar, new C1208a());
            this.f10237e.mo107572p();
        }
    }
}
