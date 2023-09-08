package de3;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ce3.C39946a;
import com.tencent.p014mm.app.plugin.C40034i;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72829t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import i21.C98591h;
import java.util.LinkedList;
import p629ny.C35042d;
import wd3.C53155r0;

/* renamed from: de3.q */
public class C45336q {

    /* renamed from: e */
    public static final LinkedList<C45335p> f122803e = new LinkedList<>();

    /* renamed from: a */
    public int f122804a = 500;

    /* renamed from: b */
    public Context f122805b;

    /* renamed from: c */
    public String f122806c;

    /* renamed from: d */
    public long f122807d = 0;

    /* renamed from: a */
    public void mo23448a(View view, C53155r0 r0Var) {
        C45335p pVar;
        String str;
        C72963f4 f4Var;
        C72963f4 f4Var2;
        C72963f4 f4Var3;
        C72963f4 f4Var4;
        C72963f4 f4Var5;
        if (System.currentTimeMillis() - this.f122807d <= ((long) this.f122804a)) {
            Log.m105920e("MicroMsg.MMSpanClickListener", "process pass");
            return;
        }
        this.f122807d = System.currentTimeMillis();
        if (r0Var == null) {
            Log.m105920e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
            return;
        }
        int i = 1;
        Log.m105919d("MicroMsg.MMSpanClickListener", "MMSpanClickListener.onClick, hrefInfo type = %d", Integer.valueOf(r0Var.f148313d));
        if (this.f122805b == null) {
            Log.m105920e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
            return;
        }
        LinkedList<C45335p> linkedList = f122803e;
        if (linkedList == null || linkedList.size() <= 0) {
            pVar = null;
        } else {
            int size = linkedList.size();
            pVar = linkedList.getLast();
            Log.m105919d("MicroMsg.MMSpanClickListener", "spanCallbackList.size:%d, get the last callback", Integer.valueOf(size));
        }
        if (view == null || !(view.getTag() instanceof C72829t0) || (f4Var5 = ((C72829t0) view.getTag()).f212238a) == null) {
            str = (view == null || !(view.getTag() instanceof C39946a)) ? null : ((C39946a) view.getTag()).getUserName();
        } else {
            str = f4Var5.mo108768t();
            if (C72996z1.m85820U5(str)) {
                str = C75604z3.m90847s(f4Var5.getContent());
            }
        }
        r0Var.f148315f = str;
        r0Var.f148316g = (view == null || !(view.getTag() instanceof C72829t0) || (f4Var4 = ((C72829t0) view.getTag()).f212238a) == null || f4Var4.mo108769t2() != 1) ? null : C75592q0.m90789s();
        r0Var.f148317h = (view == null || !(view.getTag() instanceof C72829t0) || (f4Var3 = ((C72829t0) view.getTag()).f212238a) == null) ? null : f4Var3.getContent();
        r0Var.f148318i = (view == null || !(view.getTag() instanceof C72829t0) || (f4Var2 = ((C72829t0) view.getTag()).f212238a) == null) ? null : f4Var2.mo108768t();
        r0Var.f148319j = (view == null || !(view.getTag() instanceof C72829t0) || (f4Var = ((C72829t0) view.getTag()).f212238a) == null || f4Var.getType() != 10000) ? 0 : f4Var.f230740X;
        r0Var.f148324o = (view == null || !(view.getTag() instanceof C72829t0)) ? null : ((C72829t0) view.getTag()).f212238a;
        r0Var.f148325p = (view == null || !(view.getTag() instanceof C39946a)) ? 1 : ((C39946a) view.getTag()).mo62561a();
        r0Var.f148326q = (view == null || !(view.getTag() instanceof C39946a)) ? null : ((C39946a) view.getTag()).getMsgId();
        if (r0Var.f148323n == 0) {
            if (view == null || !(view.getTag() instanceof C72829t0)) {
                i = (view == null || !(view.getTag() instanceof C39946a)) ? 0 : 2;
            }
            if (i != 0) {
                r0Var.f148323n = i;
            }
        }
        if (!TextUtils.isEmpty(this.f122806c)) {
            r0Var.f148322m = this.f122806c;
        }
        ((C40034i) ((C35042d) C86312j.m106911c(C35042d.class)).ru0()).mo62724D(this.f122805b, view, r0Var, pVar);
        if (view != null && (view.getTag() instanceof C72829t0)) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(r0Var.f148315f);
        }
        r0Var.f148322m = null;
    }
}
