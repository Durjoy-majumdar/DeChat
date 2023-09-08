package vf1;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C0143d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGalleryUI;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import er1.C58684b;
import f40.C86709a0;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import qo3.C77407n;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: vf1.g0 */
public final class C65697g0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderGalleryUI f189042d;

    /* renamed from: vf1.g0$a */
    public static final class C65698a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryUI f189043d;

        public C65698a(FinderGalleryUI finderGalleryUI) {
            this.f189043d = finderGalleryUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            Class cls = C58417y0.class;
            if (e0Var.mo107176v()) {
                e0Var.mo107125a(1001, C0966R.string.f7980y8);
                e0Var.mo107125a(1002, C0966R.string.f7989yh);
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = this.f189043d.getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            C49712hj1 hj12 = null;
            y0Var.Cx0(0, "post_acionsheet_camera", "", f != null ? f.mo12861q3() : null);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            AppCompatActivity context2 = this.f189043d.getContext();
            C87412m.m108593f(context2, "context");
            C13442s8 f2 = aVar.mo12873f(context2);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(0, "post_actionsheet_album", "", hj12);
        }
    }

    /* renamed from: vf1.g0$b */
    public static final class C65699b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryUI f189044d;

        /* renamed from: e */
        public final /* synthetic */ String f189045e;

        public C65699b(FinderGalleryUI finderGalleryUI, String str) {
            this.f189044d = finderGalleryUI;
            this.f189045e = str;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C58417y0.class;
            Intent intent = new Intent();
            C49712hj1 hj12 = null;
            if (menuItem.getItemId() == 1001) {
                intent.putExtra("key_finder_post_router", 2);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                AppCompatActivity context = this.f189044d.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar.mo12873f(context);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Cx0(1, "post_acionsheet_camera", "", hj12);
            } else if (menuItem.getItemId() == 1002) {
                intent.putExtra("key_finder_post_router", 3);
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                AppCompatActivity context2 = this.f189044d.getContext();
                C87412m.m108593f(context2, "context");
                C13442s8 f2 = aVar2.mo12873f(context2);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                y0Var2.Cx0(1, "post_actionsheet_album", "", hj12);
            }
            intent.putExtra("key_finder_post_from", 12);
            intent.putExtra("key_finder_post_id", this.f189045e);
            AppCompatActivity context3 = this.f189044d.getContext();
            C87412m.m108593f(context3, "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(context3, intent);
            C58408t0.f167336a.mo83266l(14, false);
        }
    }

    /* renamed from: vf1.g0$c */
    public static final class C65700c implements C77407n.C47880p {

        /* renamed from: a */
        public static final C65700c f189046a = new C65700c();

        public final void onDismiss() {
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.exitPageId = 6;
                FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                if (finderFeedReportObject2 != null) {
                    C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
                }
            }
        }
    }

    public C65697g0(FinderGalleryUI finderGalleryUI) {
        this.f189042d = finderGalleryUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        C87412m.m108594g(str, "postId");
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postId = str;
        }
        C0143d dVar = C0143d.f574a;
        AppCompatActivity context = this.f189042d.getContext();
        C87412m.m108593f(context, "context");
        C77407n a = dVar.mo134a(context);
        FinderGalleryUI finderGalleryUI = this.f189042d;
        a.f225771i = new C65698a(finderGalleryUI);
        a.f225782p = new C65699b(finderGalleryUI, str);
        a.f225761d = C65700c.f189046a;
        a.mo107573q();
        return true;
    }
}
