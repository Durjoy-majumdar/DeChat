package vf1;

import al1.C0081n;
import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C7853p2;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C11184p0;
import rs1.C13442s8;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C64273c21;
import te3.C64848y91;
import tf0.C13883o1;

/* renamed from: vf1.k5 */
public final class C14787k5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineUI f40770d;

    public C14787k5(FinderTimelineUI finderTimelineUI) {
        this.f40770d = finderTimelineUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C58417y0.class;
        Class cls2 = C58684b.class;
        Intent intent = new Intent();
        C49712hj1 hj12 = null;
        if (menuItem.getItemId() == 1001) {
            intent.putExtra("key_finder_post_router", 2);
            intent.putExtra("key_finder_post_from", 5);
            AppCompatActivity context = this.f40770d.getContext();
            C87412m.m108593f(context, "context");
            ((C58684b) C86312j.m106911c(cls2)).mo83582c0(context, intent);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context2 = this.f40770d.getContext();
            C87412m.m108593f(context2, "context");
            C13442s8 f = aVar.mo12873f(context2);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            y0Var.Cx0(1, "post_acionsheet_camera", "", hj12);
        } else if (menuItem.getItemId() == 1002) {
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_finder_post_from", 5);
            AppCompatActivity context3 = this.f40770d.getContext();
            C87412m.m108593f(context3, "context");
            ((C58684b) C86312j.m106911c(cls2)).mo83582c0(context3, intent);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            AppCompatActivity context4 = this.f40770d.getContext();
            C87412m.m108593f(context4, "context");
            C13442s8 f2 = aVar2.mo12873f(context4);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(1, "post_actionsheet_album", "", hj12);
        } else if (menuItem.getItemId() == 1004) {
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            AppCompatActivity context5 = this.f40770d.getContext();
            C87412m.m108593f(context5, "context");
            C13883o1.C13884a.m13249a((C13883o1) c, context5, 0, "", (C64273c21) null, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, (String) null, (LinkedList) null, (Intent) null, 8184, (Object) null);
        } else if (this.f40770d.f14874w.containsKey(Integer.valueOf(menuItem.getItemId()))) {
            C7853p2 p2Var = C7853p2.f26439a;
            FinderTimelineUI finderTimelineUI = this.f40770d;
            p2Var.mo8960c(finderTimelineUI, finderTimelineUI.f14874w.get(Integer.valueOf(menuItem.getItemId())));
            C58408t0.f167336a.mo83266l(1, false);
        }
    }
}
