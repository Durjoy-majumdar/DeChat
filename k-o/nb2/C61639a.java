package nb2;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import hb2.C59811e;
import j20.C117292a;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: nb2.a */
public final class C61639a extends C60896i<C59811e> {

    /* renamed from: h */
    public static final C61640a f175284h = new C61640a((C8480h) null);

    /* renamed from: e */
    public final MusicMvMakerFixEditUIC.C57040a f175285e;

    /* renamed from: f */
    public final String f175286f = "MicroMsg.MusicMVVideoItemConverter";

    /* renamed from: g */
    public final int f175287g;

    /* renamed from: nb2.a$a */
    public static final class C61640a {
        public C61640a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo86585a(C60905o oVar, C59811e eVar) {
            C60905o oVar2 = oVar;
            C59811e eVar2 = eVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(eVar2, "item");
            oVar2.f44854d.setSelected(eVar2.f170728h);
            View D = oVar2.mo85812D(C0966R.C0970id.h7v);
            if (eVar2.f170728h) {
                if (eVar2.f170727g != 0) {
                    View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.h88);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view2 = D;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.h88);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = findViewById2;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view4 = D;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View D2 = oVar2.mo85812D(C0966R.C0970id.h87);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view5 = D2;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            ((ProgressBar) oVar2.f44854d.findViewById(C0966R.C0970id.hr_)).setProgress(0);
            View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.h88);
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view6 = findViewById3;
            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view7 = D;
            C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D3 = oVar2.mo85812D(C0966R.C0970id.h87);
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view8 = D3;
            C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$Companion", "handleSelection", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C61639a(MusicMvMakerFixEditUIC.C57041b bVar, MusicMvMakerFixEditUIC.C57040a aVar) {
        C87412m.m108594g(bVar, "sizeResolver");
        C87412m.m108594g(aVar, "actionCallback");
        this.f175285e = aVar;
        this.f175287g = bVar.mo80483a();
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bje;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r9, jq3.C9493c r10, int r11, int r12, boolean r13, java.util.List r14) {
        /*
            r8 = this;
            hb2.e r10 = (hb2.C59811e) r10
            java.lang.String r12 = "holder"
            gy3.C87412m.m108594g(r9, r12)
            java.lang.String r12 = "item"
            gy3.C87412m.m108594g(r10, r12)
            java.lang.String r12 = r8.f175286f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "onBindViewHolder: "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            r12 = 1
            r13 = 0
            if (r14 == 0) goto L_0x0036
            hb2.e$b r0 = hb2.C59811e.f170722p
            r0.getClass()
            java.lang.Object r0 = hb2.C59811e.f170723q
            boolean r14 = r14.contains(r0)
            if (r14 != r12) goto L_0x0036
            r14 = 1
            goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r14 == 0) goto L_0x0040
            nb2.a$a r11 = f175284h
            r11.mo86585a(r9, r10)
            goto L_0x0154
        L_0x0040:
            nb2.a$a r14 = f175284h
            r14.mo86585a(r9, r10)
            r14 = 2131309889(0x7f093541, float:1.8238075E38)
            android.view.View r14 = r9.mo85812D(r14)
            java.lang.String r0 = "holder.getView(R.id.mvItemThumb)"
            gy3.C87412m.m108593f(r14, r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 2131309885(0x7f09353d, float:1.8238066E38)
            android.view.View r0 = r9.mo85812D(r0)
            java.lang.String r1 = "holder.getView(R.id.mvItemLyricContent)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r10.f170727g
            if (r1 == 0) goto L_0x0083
            r1 = 2131309873(0x7f093531, float:1.8238042E38)
            android.view.View r1 = r9.mo85812D(r1)
            nb2.b r2 = new nb2.b
            r2.<init>(r8, r11, r10, r9)
            r1.setOnClickListener(r2)
            r1 = 2131309872(0x7f093530, float:1.823804E38)
            android.view.View r1 = r9.mo85812D(r1)
            nb2.c r2 = new nb2.c
            r2.<init>(r8, r11, r10, r9)
            r1.setOnClickListener(r2)
        L_0x0083:
            hb2.e$g r11 = r10.f170730j
            r1 = 0
            if (r11 == 0) goto L_0x008c
            r11.mo84764a(r14, r1)
            goto L_0x008f
        L_0x008c:
            r14.setImageDrawable(r1)
        L_0x008f:
            int r11 = r10.f170725e
            java.lang.String r11 = r10.mo84762d(r11)
            r0.setText(r11)
            int r11 = r10.f170727g
            r14 = 2131309875(0x7f093533, float:1.8238046E38)
            if (r11 != 0) goto L_0x010c
            android.view.View r11 = r9.mo85812D(r14)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter"
            java.lang.String r3 = "onBindViewHolder"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;IIZLjava/util/List;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r11
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r14 = r14.mo10231a(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r11.setVisibility(r14)
            java.lang.String r1 = "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter"
            java.lang.String r2 = "onBindViewHolder"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;IIZLjava/util/List;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r11 = 2131309876(0x7f093534, float:1.8238048E38)
            android.view.View r11 = r9.mo85812D(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r9 = r9.f173499A
            r14 = 2131833328(0x7f1131f0, float:1.9299735E38)
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r0 = r10.f170726f
            int r10 = r10.f170725e
            int r0 = r0 - r10
            int r10 = nb2.C61645c0.m72363c(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r13] = r10
            java.lang.String r9 = r9.getString(r14, r12)
            r11.setText(r9)
            goto L_0x0154
        L_0x010c:
            android.view.View r9 = r9.mo85812D(r14)
            r10 = 8
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r10)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter"
            java.lang.String r3 = "onBindViewHolder"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;IIZLjava/util/List;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r9
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = r11.mo10231a(r13)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r1 = "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter"
            java.lang.String r2 = "onBindViewHolder"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;IIZLjava/util/List;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb2.C61639a.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        LinearLayout linearLayout = (LinearLayout) oVar.mo85812D(C0966R.C0970id.h89);
        String str = this.f175286f;
        Log.m105918d(str, "onCreateViewHolder, itemWidth:" + this.f175287g);
        linearLayout.getLayoutParams().width = this.f175287g;
        linearLayout.getLayoutParams().height = -1;
    }
}
