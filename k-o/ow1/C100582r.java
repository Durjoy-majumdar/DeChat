package ow1;

import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import java.util.ArrayList;
import qw1.C101316l;
import zt3.C119157j;

/* renamed from: ow1.r */
public class C100582r implements C93951d.C93956e {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f294712a;

    /* renamed from: b */
    public final /* synthetic */ String f294713b;

    /* renamed from: c */
    public final /* synthetic */ ImagePreviewUI f294714c;

    /* renamed from: ow1.r$a */
    public class C100583a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f294715d;

        public C100583a(String str) {
            this.f294715d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0066, code lost:
            r0 = r6.f294716e.f294714c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                com.tencent.mm.plugin.gallery.ui.h r1 = r0.f271409e
                java.util.ArrayList<java.lang.String> r0 = r0.f271413g
                r1.mo129065m(r0)
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                androidx.recyclerview.widget.RecyclerView r0 = r0.f271411f
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                com.tencent.mm.plugin.gallery.ui.m r0 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r0
                ow1.r r1 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = r1.f294714c
                java.util.ArrayList<java.lang.String> r1 = r1.f271413g
                java.util.ArrayList<java.lang.String> r2 = r0.f271612h
                r2.clear()
                java.util.ArrayList<java.lang.String> r2 = r0.f271612h
                r2.addAll(r1)
                r0.notifyDataSetChanged()
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                java.util.ArrayList<java.lang.String> r0 = r0.f271416i
                r0.clear()
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = r0.f294714c
                java.util.ArrayList<java.lang.String> r1 = r1.f271416i
                java.util.ArrayList r0 = r0.f294712a
                r1.addAll(r0)
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                java.lang.String r1 = r0.mo128989N7()
                r2 = 0
                r0.updateOptionMenuText(r2, r1)
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                android.widget.TextView r1 = r0.f271426u
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                r3 = 2131830617(0x7f112759, float:1.9294236E38)
                java.lang.String r0 = r0.getString(r3)
                r1.setText(r0)
                boolean r0 = hd0.C98429r0.m127830u()
                r1 = 8
                if (r0 == 0) goto L_0x00a2
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                int r3 = r0.f271378J
                r4 = 3
                if (r3 == r4) goto L_0x0073
                r4 = 16
                if (r3 != r4) goto L_0x00a2
            L_0x0073:
                boolean r3 = r0.f271420p
                if (r3 == 0) goto L_0x00a2
                java.lang.String r0 = r0.mo128987L7()
                ow1.r r3 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r3 = r3.f294714c
                android.widget.TextView r3 = r3.f271427v
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r4 == 0) goto L_0x0088
                goto L_0x0089
            L_0x0088:
                r1 = 0
            L_0x0089:
                r3.setVisibility(r1)
                ow1.r r1 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = r1.f294714c
                android.widget.TextView r3 = r1.f271427v
                r4 = 2131830576(0x7f112730, float:1.9294153E38)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r0
                java.lang.String r0 = r1.getString(r4, r5)
                r3.setText(r0)
                goto L_0x00ab
            L_0x00a2:
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                android.widget.TextView r0 = r0.f271427v
                r0.setVisibility(r1)
            L_0x00ab:
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                java.util.ArrayList<java.lang.String> r0 = r0.f271416i
                java.lang.String r1 = r6.f294715d
                java.lang.String r1 = qw1.C101316l.m132907f(r1)
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L_0x00c6
                ow1.r r0 = ow1.C100582r.this
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = r0.f294714c
                android.widget.ImageButton r0 = r0.f271370B
                r0.performClick()
            L_0x00c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ow1.C100582r.C100583a.run():void");
        }
    }

    public C100582r(ImagePreviewUI imagePreviewUI, ArrayList arrayList, String str) {
        this.f294714c = imagePreviewUI;
        this.f294712a = arrayList;
        this.f294713b = str;
    }

    /* renamed from: a */
    public String mo128887a() {
        return C101316l.m132905d(this.f294713b, (C93974o.C93980f) null, -1);
    }

    /* renamed from: b */
    public void mo128888b(String str) {
        ((C119157j) C119157j.f356862d).mo183895z(new C100583a(str));
        C93958f.m118747g().mo128878f(this);
    }

    public String toString() {
        return "fileKey:" + this.f294713b + " this: " + super.toString();
    }
}
