package ed1;

import jq3.C60898l;
import jq3.C60905o;

/* renamed from: ed1.c */
public final class C58548c implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C58551f f167587d;

    public C58548c(C58551f fVar) {
        this.f167587d = fVar;
    }

    /* JADX WARNING: type inference failed for: r12v20, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r9, android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C16631z r12) {
        /*
            r8 = this;
            jq3.o r12 = (jq3.C60905o) r12
            java.lang.String r11 = "adapter"
            gy3.C87412m.m108594g(r9, r11)
            java.lang.String r11 = "view"
            gy3.C87412m.m108594g(r10, r11)
            java.lang.String r10 = "holder"
            gy3.C87412m.m108594g(r12, r10)
            java.lang.Object r10 = r12.f173503E
            gd1.a r10 = (gd1.C45905a) r10
            ed1.f r11 = r8.f167587d
            ed1.b r12 = r11.f167596j
            android.app.Activity r11 = r11.getContext()
            r12.getClass()
            java.lang.Class<ir.n> r12 = p565ir.C60606n.class
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r11, r0)
            di3.d r0 = di3.C86312j.m106911c(r12)
            ir.n r0 = (p565ir.C60606n) r0
            boolean r0 = r0.mo85002F()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0045
            di3.d r12 = di3.C86312j.m106911c(r12)
            ir.n r12 = (p565ir.C60606n) r12
            boolean r12 = r12.mo85017L5()
            if (r12 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r11 = 0
            goto L_0x0054
        L_0x0045:
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131829955(0x7f1124c3, float:1.9292894E38)
            java.lang.String r12 = r12.getString(r0)
            nj3.C76912y0.m92773l(r11, r12)
            r11 = 1
        L_0x0054:
            if (r11 == 0) goto L_0x0058
            goto L_0x016e
        L_0x0058:
            boolean r11 = r10.f123875e
            if (r11 != 0) goto L_0x016e
            bd1.b r11 = r10.f123874d
            java.lang.String r11 = r11.field_nickname
            if (r11 == 0) goto L_0x006b
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r11 = 0
            goto L_0x006c
        L_0x006b:
            r11 = 1
        L_0x006c:
            r12 = 0
            if (r11 == 0) goto L_0x0102
            boolean r9 = r10.f123877g
            if (r9 == 0) goto L_0x00df
            ed1.f r9 = r8.f167587d
            r9.getClass()
            te3.rq3 r10 = r10.f123876f
            if (r10 == 0) goto L_0x00c3
            java.util.LinkedList<te3.qq3> r10 = r10.f141080d
            if (r10 == 0) goto L_0x008c
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            te3.qq3 r10 = (te3.C50998qq3) r10
            if (r10 == 0) goto L_0x008c
            java.lang.String r10 = r10.f140483d
            if (r10 != 0) goto L_0x008e
        L_0x008c:
            java.lang.String r10 = ""
        L_0x008e:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            r12 = 2
            java.lang.String r0 = "key_create_scene"
            r11.putExtra(r0, r12)
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r12 = r12.mo90658I1()
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x00a6
            r1 = 1
        L_0x00a6:
            java.lang.String r12 = "KEY_OTHER_USER"
            r11.putExtra(r12, r1)
            java.lang.String r12 = "KEY_WX_USERNAME"
            r11.putExtra(r12, r10)
            java.lang.Class<tf0.o1> r10 = tf0.C13883o1.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            tf0.o1 r10 = (tf0.C13883o1) r10
            androidx.appcompat.app.AppCompatActivity r12 = r9.getActivity()
            r0 = 11104(0x2b60, float:1.556E-41)
            r10.b30(r12, r11, r0)
            rx3.b0 r12 = rx3.C13598b0.f38549a
        L_0x00c3:
            if (r12 != 0) goto L_0x00d6
            java.lang.Class<mg0.b> r10 = mg0.C76754b.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            mg0.b r10 = (mg0.C76754b) r10
            androidx.appcompat.app.AppCompatActivity r11 = r9.getActivity()
            r12 = 702(0x2be, float:9.84E-43)
            r10.mo105748ml(r11, r12)
        L_0x00d6:
            com.google.android.material.bottomsheet.a r9 = r9.f167591e
            if (r9 == 0) goto L_0x016e
            r9.dismiss()
            goto L_0x016e
        L_0x00df:
            ed1.f r9 = r8.f167587d
            android.app.Activity r9 = r9.getContext()
            ed1.f r10 = r8.f167587d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131826042(0x7f11157a, float:1.9284957E38)
            java.lang.Object[] r12 = new java.lang.Object[r2]
            ed1.f r0 = r8.f167587d
            int r0 = r0.f167599p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r1] = r0
            java.lang.String r10 = r10.getString(r11, r12)
            nj3.C76912y0.m92773l(r9, r10)
            goto L_0x016e
        L_0x0102:
            ed1.f r11 = r8.f167587d
            java.util.ArrayList<gd1.a> r11 = r11.f167594h
            if (r11 == 0) goto L_0x011e
            java.util.Iterator r11 = r11.iterator()
        L_0x010c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r11.next()
            gd1.a r0 = (gd1.C45905a) r0
            boolean r3 = r0.f123875e
            if (r3 == 0) goto L_0x010c
            r12 = r0
            goto L_0x010c
        L_0x011e:
            if (r12 != 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r12.f123875e = r1
        L_0x0123:
            r10.f123875e = r2
            r9.notifyDataSetChanged()
            ed1.f r9 = r8.f167587d
            bd1.b r10 = r10.f123874d
            java.lang.String r10 = r10.field_username
            java.lang.String r11 = "data.account.field_username"
            gy3.C87412m.m108593f(r10, r11)
            com.google.android.material.bottomsheet.a r11 = r9.f167591e
            if (r11 == 0) goto L_0x013a
            r11.dismiss()
        L_0x013a:
            it1.b r11 = r9.f167592f
            if (r11 == 0) goto L_0x0141
            r11.mo8913b()
        L_0x0141:
            it1.b$a r0 = it1.C9247b.f28989d
            android.app.Activity r1 = r9.getContext()
            android.app.Activity r11 = r9.getContext()
            r12 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r2 = r11.getString(r12)
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 0
            r6 = 8
            r7 = 0
            it1.b r11 = it1.C9247b.C9248a.m8889a(r0, r1, r2, r3, r5, r6, r7)
            r9.f167592f = r11
            r11.begin()
            java.lang.Class<ht1.t4> r11 = ht1.C46116t4.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ht1.t4 r11 = (ht1.C46116t4) r11
            ed1.f$a r9 = r9.f167601r
            r11.mo71564EG(r10, r9)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.C58548c.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
