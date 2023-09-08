package ve1;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0757o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C51108rh0;

/* renamed from: ve1.h */
public final class C14533h extends C60896i<C0757o> {
    /* renamed from: j */
    public static final void m13852j(C14533h hVar, C60905o oVar, boolean z, long j) {
        C60905o oVar2 = oVar;
        boolean z2 = z;
        long j2 = j;
        hVar.getClass();
        Log.m105924i("Finder.FinderCollectionFilterConvert", "isNext: " + z2 + ", feedId:" + j2);
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", 16);
        C51108rh0 rh02 = ((C0757o) oVar2.f173503E).f1784d;
        String str = rh02.f140918e;
        if (str == null) {
            str = "";
        }
        long j3 = rh02.f140917d;
        long j4 = rh02.f140925o;
        intent.putExtra("key_topic_title", str);
        intent.putExtra("KEY_TOPIC_ID", j3);
        if (!z2) {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
            intent.putExtra("key_ref_object_id", j2);
        } else {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            intent.putExtra("key_ref_object_id", j4);
        }
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
        Context context2 = oVar2.f173499A;
        C87412m.m108593f(context2, "holder.context");
        bVar.ty0(context2, intent);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d2j;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            cm1.o r2 = (cm1.C0757o) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 2131302712(0x7f091938, float:1.8223518E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131302709(0x7f091935, float:1.8223512E38)
            android.view.View r4 = r1.mo85812D(r4)
            r6 = r4
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r5 = r1.f173499A
            te3.rh0 r7 = r2.f1784d
            java.lang.String r7 = r7.f140918e
            if (r7 != 0) goto L_0x0037
            java.lang.String r7 = ""
        L_0x0037:
            android.text.SpannableString r4 = r4.mo107057T1(r5, r7)
            r3.setText(r4)
            android.content.Context r4 = r1.f173499A
            boolean r5 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            r7 = 0
            if (r5 == 0) goto L_0x0048
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            goto L_0x0049
        L_0x0048:
            r4 = r7
        L_0x0049:
            r8 = 0
            if (r4 == 0) goto L_0x005d
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L_0x005d
            r10 = -1
            java.lang.String r5 = "finder_read_feed_id"
            long r4 = r4.getLongExtra(r5, r10)
            r13 = r4
            goto L_0x005e
        L_0x005d:
            r13 = r8
        L_0x005e:
            android.content.Context r4 = r1.f173499A
            boolean r5 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r5 == 0) goto L_0x0067
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            goto L_0x0068
        L_0x0067:
            r4 = r7
        L_0x0068:
            boolean r4 = vn3.C111562e.m152091a(r4)
            android.content.Context r5 = r1.f173499A
            boolean r10 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r10 == 0) goto L_0x0075
            r7 = r5
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
        L_0x0075:
            if (r7 == 0) goto L_0x0084
            android.content.Intent r5 = r7.getIntent()
            if (r5 == 0) goto L_0x0084
            java.lang.String r7 = "key_finder_collection_id"
            long r10 = r5.getLongExtra(r7, r8)
            goto L_0x0085
        L_0x0084:
            r10 = r8
        L_0x0085:
            r5 = 8
            if (r26 != 0) goto L_0x0136
            if (r4 == 0) goto L_0x0136
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0136
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r4 = wp1.C15585f.f42212b
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.Object r4 = r4.get(r7)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 != 0) goto L_0x009f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x009f:
            boolean r4 = r4.booleanValue()
            te3.rh0 r7 = r2.f1784d
            long r10 = r7.f140925o
            r7 = 1
            r27 = r13
            r12 = 500(0x1f4, double:2.47E-321)
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x00e6
            if (r4 == 0) goto L_0x00e6
            android.content.Context r4 = r1.f173499A
            r5 = 2131829408(0x7f1122a0, float:1.9291784E38)
            java.lang.String r4 = r4.getString(r5)
            r6.setText(r4)
            boolean r4 = r2.f1785e
            if (r4 != 0) goto L_0x00cd
            r2.f1785e = r7
            ve1.g r4 = new ve1.g
            r4.<init>(r6)
            r6.postDelayed(r4, r12)
            goto L_0x00d1
        L_0x00cd:
            r4 = 0
            r6.setVisibility(r4)
        L_0x00d1:
            ve1.d r4 = new ve1.d
            r10 = r27
            r4.<init>(r0, r1, r10)
            r6.setOnClickListener(r4)
            android.view.View r4 = r1.f44854d
            ve1.e r5 = new ve1.e
            r5.<init>(r0, r1, r3, r6)
            r4.setOnClickListener(r5)
            goto L_0x011a
        L_0x00e6:
            r10 = r27
            if (r14 == 0) goto L_0x00f1
            if (r4 != 0) goto L_0x00ed
            goto L_0x00f1
        L_0x00ed:
            r6.setVisibility(r5)
            goto L_0x011a
        L_0x00f1:
            android.content.Context r3 = r1.f173499A
            r4 = 2131829407(0x7f11229f, float:1.9291782E38)
            java.lang.String r3 = r3.getString(r4)
            r6.setText(r3)
            boolean r3 = r2.f1785e
            if (r3 != 0) goto L_0x010c
            r2.f1785e = r7
            ve1.g r3 = new ve1.g
            r3.<init>(r6)
            r6.postDelayed(r3, r12)
            goto L_0x0110
        L_0x010c:
            r3 = 0
            r6.setVisibility(r3)
        L_0x0110:
            android.view.View r3 = r1.f44854d
            ve1.f r4 = new ve1.f
            r4.<init>(r0, r1, r10)
            r3.setOnClickListener(r4)
        L_0x011a:
            dp1.m0 r5 = dp1.C7446m0.f25635a
            java.lang.String r3 = "collectionAction"
            gy3.C87412m.m108593f(r6, r3)
            r8 = 0
            r9 = 0
            te3.rh0 r3 = r2.f1784d
            java.util.Map r3 = r0.mo13790k(r3, r10)
            r4 = 12
            r12 = 0
            java.lang.String r7 = "watch_next_episode"
            r13 = r10
            r10 = r3
            r11 = r4
            dp1.C7446m0.m7572b(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0139
        L_0x0136:
            r6.setVisibility(r5)
        L_0x0139:
            dp1.m0 r15 = dp1.C7446m0.f25635a
            android.view.View r1 = r1.f44854d
            java.lang.String r3 = "holder.itemView"
            gy3.C87412m.m108593f(r1, r3)
            r18 = 0
            r19 = 0
            te3.rh0 r3 = r2.f1784d
            java.util.Map r20 = r0.mo13790k(r3, r13)
            r21 = 12
            r22 = 0
            java.lang.String r17 = "collection_tag"
            r16 = r1
            dp1.C7446m0.m7572b(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "item hash:"
            r1.append(r3)
            int r3 = r2.hashCode()
            r1.append(r3)
            java.lang.String r3 = ", topic:"
            r1.append(r3)
            te3.rh0 r2 = r2.f1784d
            java.lang.String r2 = r2.f140918e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderCollectionFilterConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14533h.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: k */
    public final Map<String, Object> mo13790k(C51108rh0 rh02, long j) {
        return C90364q0.m113147f(new C13604l("collection_id", C61926c.m72691p(rh02.f140917d)), new C13604l("feed_id", C61926c.m72691p(j)));
    }
}
