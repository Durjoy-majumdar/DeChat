package mo1;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import er1.C58679a1;
import er1.C58684b;
import er1.C7853p2;
import nj3.C11184p0;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: mo1.e */
public final class C10990e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f32697d;

    /* renamed from: e */
    public final /* synthetic */ C10943a f32698e;

    /* renamed from: f */
    public final /* synthetic */ String f32699f;

    public C10990e(AppCompatActivity appCompatActivity, C10943a aVar, String str) {
        this.f32697d = appCompatActivity;
        this.f32698e = aVar;
        this.f32699f = str;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C58417y0.class;
        Intent intent = new Intent();
        C49712hj1 hj12 = null;
        if (menuItem.getItemId() == 1) {
            intent.putExtra("key_finder_post_router", 2);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32697d);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            y0Var.Cx0(1, "post_acionsheet_camera", "", hj12);
        } else if (menuItem.getItemId() == 2) {
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f32697d);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(1, "post_actionsheet_album", "", hj12);
        } else if (menuItem.getItemId() == 4) {
            intent.putExtra("key_finder_post_router", 16);
        } else if (this.f32698e.f32621M.containsKey(Integer.valueOf(menuItem.getItemId()))) {
            C7853p2.f26439a.mo8960c(this.f32698e.getActivity(), this.f32698e.f32621M.get(Integer.valueOf(menuItem.getItemId())));
            C58408t0.f167336a.mo83266l(2, false);
        }
        intent.putExtra("key_finder_post_from", 1);
        intent.putExtra("key_finder_post_id", this.f32699f);
        C58679a1.f167972a.mo83554a(this.f32697d, intent, 132, 10);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(this.f32697d, intent);
    }
}
