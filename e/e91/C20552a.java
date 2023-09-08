package e91;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20452d;
import f91.C116848a;
import f91.C116850b;
import h81.C20928j;
import i91.C21062c;
import j91.C21200b;
import java.lang.ref.WeakReference;
import k91.C21316c;
import l91.C117466c;
import l91.C21406g;
import m91.C21487b;
import te3.C118454oq1;
import te3.C118457pq1;
import te3.fh4;
import z91.C23462b;

/* renamed from: e91.a */
public class C20552a {

    /* renamed from: d */
    public static volatile C20552a f57842d;

    /* renamed from: a */
    public final C20553c f57843a = new C21200b();

    /* renamed from: b */
    public final C20555e f57844b = new C21406g();

    /* renamed from: c */
    public WeakReference<Object> f57845c = null;

    public C20552a() {
        C116848a.C116849a aVar = C116848a.f350239a;
        if (C116711b.m164589n()) {
            aVar.mo180847a(0, -1);
            aVar.mo180847a(1, -1);
        }
        C21062c.m23249d();
        C21316c.m23893a();
        C23462b.m28021f();
        Log.m105924i("HABBYGE-MALI.ActivityBundleDao", "ActivityBundleDao reset");
        if (C116711b.m164589n()) {
            C116850b.m164834d("hell_ac_ble_mmkv_key", new byte[0]);
        }
        try {
            C116850b.m164834d("mmkv_key_page_se_dao", new byte[0]);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e, "PageStateDao writeBack", new Object[0]);
        }
    }

    /* renamed from: a */
    public static C20552a m22323a() {
        if (f57842d == null) {
            synchronized (C20552a.class) {
                if (f57842d == null) {
                    f57842d = new C20552a();
                }
            }
        }
        return f57842d;
    }

    /* renamed from: b */
    public void mo32133b(C118454oq1 oq12) {
        C21406g gVar = (C21406g) this.f57844b;
        gVar.getClass();
        fh4 fh4 = oq12.f354210d;
        String str = oq12.f354211e;
        int i = oq12.f354213g;
        long j = oq12.f354212f;
        if (fh4 == null || TextUtils.isEmpty(fh4.f354001d)) {
            Log.m105924i("HABBYGE-MALI.FragmentMonitor", "_onFragmentPause, Biz");
            C20928j.C20930b bVar = gVar.f60561b;
            if (bVar != null) {
                ((C20452d) bVar).mo31995a("Biz", str, i, j);
                return;
            }
            return;
        }
        Log.m105925i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", fh4.f354001d, str);
        C21062c.m23249d().mo32778i(fh4.f354001d, str, i);
        if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
            Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-1");
            C21487b c = C21487b.m24299c();
            int i2 = c.f60814b;
            if (i2 == 1 || i2 == -1) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
            } else if (i2 == 0) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                c.f60814b = -1;
                C20928j.C20930b bVar2 = gVar.f60561b;
                if (bVar2 != null) {
                    ((C20452d) bVar2).mo31997c(3, j);
                    return;
                }
                return;
            }
        }
        C20928j.C20930b bVar3 = gVar.f60561b;
        if (bVar3 != null) {
            ((C20452d) bVar3).mo31995a(fh4.f354001d, str, i, j);
        }
    }

    /* renamed from: c */
    public void mo32134c(C118457pq1 pq12) {
        C20928j.C20930b bVar;
        C21406g gVar = (C21406g) this.f57844b;
        gVar.getClass();
        String str = pq12.f354240e;
        if (!TextUtils.isEmpty(str)) {
            C117466c.m165685b("Chat_User", str);
        }
        fh4 fh4 = pq12.f354239d;
        String str2 = pq12.f354242g;
        int i = pq12.f354245j;
        boolean z = pq12.f354243h;
        long j = pq12.f354244i;
        if (fh4 == null) {
            C20928j.C20930b bVar2 = gVar.f60561b;
            if (bVar2 != null) {
                ((C20452d) bVar2).mo31996b("Biz", str2, i, j);
            }
        } else if (!TextUtils.isEmpty(fh4.f354001d)) {
            Log.m105925i("HABBYGE-MALI.FragmentMonitor", "_onResume: %s, %s", fh4.f354001d, str2);
            C21062c.m23249d().mo32779j(fh4.f354001d, str2, i);
            if ("com.tencent.mm.ui.MoreTabUI".equals(str2)) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
                int i2 = C21487b.m24299c().f60814b;
                if (i2 == 1 || i2 == -1) {
                    Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
                } else if (i2 == 0) {
                    Log.m105925i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", Boolean.valueOf(z));
                    if (z && (bVar = gVar.f60561b) != null) {
                        ((C20452d) bVar).mo31998d(2, j);
                        return;
                    }
                    return;
                }
            }
            C20928j.C20930b bVar3 = gVar.f60561b;
            if (bVar3 != null) {
                ((C20452d) bVar3).mo31996b(fh4.f354001d, str2, i, j);
            }
        }
    }

    /* renamed from: d */
    public void mo32135d(Object obj) {
        Log.m105929w("HABBYGE-MALI.HellhoundMonitor", "HellhoundMonitor-setPageObj: %s", obj.getClass().getSimpleName());
        this.f57845c = new WeakReference<>(obj);
    }
}
