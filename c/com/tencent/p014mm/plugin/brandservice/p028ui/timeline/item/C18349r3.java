package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import fx0.C45821d;
import fy0.C20734b;
import fy0.C20739g;
import fy0.C8219i;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C36570n;
import s90.C77629i;
import s90.C77630j;
import yr3.C79150a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r3 */
public class C18349r3 extends C18353s3 {

    /* renamed from: A */
    public int f50804A = 0;

    /* renamed from: m */
    public ImageView f50805m;

    /* renamed from: n */
    public ImageView f50806n;

    /* renamed from: o */
    public View f50807o;

    /* renamed from: p */
    public TextView f50808p;

    /* renamed from: q */
    public View f50809q;

    /* renamed from: r */
    public TextView f50810r;

    /* renamed from: s */
    public MMNeat7extView f50811s;

    /* renamed from: t */
    public LinearLayout f50812t;

    /* renamed from: u */
    public MMNeat7extView f50813u;

    /* renamed from: v */
    public MMNeat7extView f50814v;

    /* renamed from: w */
    public LinearLayout f50815w;

    /* renamed from: x */
    public int f50816x = 0;

    /* renamed from: y */
    public boolean f50817y = false;

    /* renamed from: z */
    public int f50818z = 0;

    /* renamed from: c */
    public void mo22830c(C19623o0 o0Var, C77630j jVar, View view, TextView textView, int i) {
        this.f50818z = i;
        LinearLayout linearLayout = this.f50815w;
        if (linearLayout != null) {
            if (!this.f50817y) {
                linearLayout.setBackgroundResource(C0966R.C0969drawable.ags);
            } else if (i > 0 || !mo22917j(this.f50816x, jVar)) {
                this.f50815w.setBackgroundResource(mo22916i(jVar) ? C0966R.C0969drawable.f4607hn : C0966R.C0969drawable.f4608ho);
            } else {
                this.f50815w.setBackgroundResource(C0966R.C0969drawable.ags);
            }
        }
    }

    /* renamed from: d */
    public void mo22880d(int i, C77630j jVar, C19623o0 o0Var) {
        C77630j jVar2 = jVar;
        if (mo22917j(i, jVar)) {
            this.f50811s.setVisibility(8);
            this.f50811s.mo104279b("");
            this.f50812t.setVisibility(0);
            mo22914e(this.f50813u, jVar2, false, true);
            MMNeat7extView mMNeat7extView = this.f50814v;
            mMNeat7extView.setMaxLines(2);
            if (Util.isNullOrNil(jVar2.f226332n) || ((Boolean) ((C36570n) C8219i.f27145b).getValue()).booleanValue()) {
                mMNeat7extView.setVisibility(8);
            } else {
                String str = jVar2.f226332n;
                Map<Long, Integer> map = C20739g.f58625a;
                String replaceAll = str != null ? str.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "") : null;
                mMNeat7extView.setVisibility(0);
                mMNeat7extView.mo104279b(replaceAll);
            }
            View view = this.f50807o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot", "fillTitleLayout", "(ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot", "fillTitleLayout", "(ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo22920b(this.f50809q, this.f50810r, o0Var, jVar2);
            int A = C76577a.m92145A(this.f50824c) - C76577a.m92151b(this.f50824c, 48);
            this.f50813u.setMaxLines(2);
            C79150a i2 = this.f50813u.mo154990i(A, Integer.MAX_VALUE);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2 != null ? ((NeatLayout) i2).f319992L : -1);
            objArr[1] = Integer.valueOf(A);
            Log.m105927v("MicroMsg.BizTimeLineItem", "alvinluo fillTitleLayout title line: %d, width: %d", objArr);
            if (i2 == null || ((NeatLayout) i2).f319992L < 2) {
                this.f50814v.setMaxLines(2);
            } else {
                this.f50814v.setMaxLines(1);
            }
        } else {
            this.f50811s.setVisibility(0);
            this.f50812t.setVisibility(8);
            this.f50813u.mo104279b("");
            this.f50814v.mo104279b("");
            mo22914e(this.f50811s, jVar2, true, false);
        }
    }

    /* renamed from: e */
    public final void mo22914e(MMNeat7extView mMNeat7extView, C77630j jVar, boolean z, boolean z2) {
        mMNeat7extView.setMaxLines(2);
        int i = z2 ? 0 : 11;
        if (!Util.isNullOrNil(jVar.f226325d)) {
            C45821d.f123719a.mo71289g(jVar.f226325d, mMNeat7extView, jVar, i);
        } else {
            C45821d.f123719a.mo71289g(this.f50824c.getString(C0966R.string.aos), mMNeat7extView, jVar, i);
        }
        if (jVar.f226333o == 0 && jVar.f226317I == 1) {
            mMNeat7extView.setTag(C0966R.C0970id.aak, Boolean.TRUE);
        } else {
            mMNeat7extView.setTag(C0966R.C0970id.aak, Boolean.FALSE);
        }
        if (z) {
            C8219i.f27144a.mo9272c(mMNeat7extView);
        }
    }

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        this.f50816x = i;
        this.f50817y = false;
        this.f50818z = 0;
        this.f50804A = i3;
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        throw null;
    }

    /* renamed from: h */
    public void mo22915h() {
        View view = this.f50826e;
        if (view != null) {
            this.f50807o = view.findViewById(C0966R.C0970id.k0q);
            this.f50808p = (TextView) this.f50826e.findViewById(C0966R.C0970id.efu);
        }
    }

    /* renamed from: i */
    public boolean mo22916i(C77630j jVar) {
        int i = this.f50816x;
        return i <= 1 && i == 1 && !mo22917j(i, jVar);
    }

    /* renamed from: j */
    public boolean mo22917j(int i, C77630j jVar) {
        int i2 = jVar.f226333o;
        return (i2 == 0 || i2 == 1) ? i == 1 && C20734b.f58619d : i == 1;
    }
}
