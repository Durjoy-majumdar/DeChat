package mp0;

import android.content.Context;
import android.os.Looper;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.WxaNativeCrashTest;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.task.C1971b;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import junit.framework.Assert;
import nj3.C11184p0;
import org.json.JSONObject;
import p757xv.C91353u;
import p910lj.C76701a;
import xm0.C91284a;

/* renamed from: mp0.b */
public class C88793b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f256201d;

    /* renamed from: e */
    public final /* synthetic */ Context f256202e;

    /* renamed from: mp0.b$a */
    public class C88794a implements Runnable {
        public C88794a(C88793b bVar) {
        }

        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException unused) {
            }
        }
    }

    public C88793b(C88795c cVar, C83928t1 t1Var, Context context) {
        this.f256201d = t1Var;
        this.f256202e = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        switch (menuItem.getItemId()) {
            case 1:
                new C91284a().mo1505u(this.f256201d.mo116160O0(), new JSONObject(), 10000);
                return;
            case 2:
            case 7:
            case 9:
                int itemId = menuItem.getItemId();
                String i2 = this.f256201d.getFileSystem().getAbsoluteFile(itemId != 2 ? itemId != 7 ? itemId != 9 ? "wxfile://" : "wxfile://clientdata" : "wxfile://opendata" : "wxfile://usr", true).mo119971i();
                Context context = this.f256202e;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f7595kq, new Object[]{i2}), 0).show();
                ClipboardHelper.setText(MMApplicationContext.getContext(), MimeTypes.BASE_TYPE_TEXT, i2);
                return;
            case 3:
                ClipboardHelper.setText(MMApplicationContext.getContext(), MimeTypes.BASE_TYPE_TEXT, this.f256201d.getAppId());
                Context context2 = this.f256202e;
                C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.f7591kl, new Object[]{this.f256201d.getAppId()}), 1).show();
                return;
            case 6:
                if (C1971b.m1957c()) {
                    C1971b.m1955a();
                } else {
                    C1971b.m1956b();
                }
                menuItem.setTitle(this.f256202e.getString(C0966R.string.f7593kn) + String.format("(cur:%b)", new Object[]{Boolean.valueOf(C1971b.m1957c())}));
                C76701a.makeText(this.f256202e, (CharSequence) "Restart Wechat!!", 1).show();
                return;
            case 8:
                String str = this.f256201d.getRuntime().mo113210l1().f234839s;
                ClipboardHelper.setText(MMApplicationContext.getContext(), MimeTypes.BASE_TYPE_TEXT, str);
                Context context3 = this.f256202e;
                C76701a.makeText(context3, (CharSequence) context3.getString(C0966R.string.f7598kt, new Object[]{str}), 1).show();
                return;
            case 10:
                Assert.fail("test errlog " + new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS, Locale.ENGLISH).format(new Date()));
                return;
            case 11:
                WxaNativeCrashTest.crashForTest();
                return;
            case 12:
                ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118578d(true);
                return;
            case 13:
                new MMHandler(Looper.getMainLooper()).post(new C88794a(this));
                return;
            default:
                return;
        }
    }
}
