package androidx.appcompat.app;

import android.view.View;
import p849e3.C107173b0;
import p849e3.C107175c0;

/* renamed from: androidx.appcompat.app.j */
public class C103418j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppCompatDelegateImpl f305075d;

    /* renamed from: androidx.appcompat.app.j$a */
    public class C103419a extends C107175c0 {
        public C103419a() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            C103418j.this.f305075d.f305023s.setAlpha(1.0f);
            C103418j.this.f305075d.f305026v.mo157608d((C107173b0) null);
            C103418j.this.f305075d.f305026v = null;
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C103418j.this.f305075d.f305023s.setVisibility(0);
        }
    }

    public C103418j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f305075d = appCompatDelegateImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            android.widget.PopupWindow r1 = r0.f305024t
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f305023s
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            e3.a0 r0 = r0.f305026v
            if (r0 == 0) goto L_0x0015
            r0.mo157606b()
        L_0x0015:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            boolean r1 = r0.f305027w
            if (r1 == 0) goto L_0x0029
            android.view.ViewGroup r0 = r0.f305028x
            if (r0 == 0) goto L_0x0029
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            boolean r0 = p849e3.C107207u.C107211e.m145208c(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0050
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f305023s
            r2 = 0
            r0.setAlpha(r2)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f305023s
            e3.a0 r2 = p849e3.C107207u.m145160a(r2)
            r2.mo157605a(r1)
            r0.f305026v = r2
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            e3.a0 r0 = r0.f305026v
            androidx.appcompat.app.j$a r1 = new androidx.appcompat.app.j$a
            r1.<init>()
            r0.mo157608d(r1)
            goto L_0x005e
        L_0x0050:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f305023s
            r0.setAlpha(r1)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f305075d
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f305023s
            r0.setVisibility(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C103418j.run():void");
    }
}
