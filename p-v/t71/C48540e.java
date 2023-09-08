package t71;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C75592q0;
import f12.C7970a;
import gc0.C20828a;
import hc0.C20937c;
import java.util.ArrayList;
import junit.framework.Assert;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p1081gi.C98124g;
import p663qo.C101213l;
import qo3.C77407n;

/* renamed from: t71.e */
public class C48540e {

    /* renamed from: t71.e$a */
    public class C48541a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f129820d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f129821e;

        /* renamed from: f */
        public final /* synthetic */ String f129822f;

        /* renamed from: g */
        public final /* synthetic */ int f129823g;

        public C48541a(Context context, ImageView imageView, String str, int i) {
            this.f129820d = context;
            this.f129821e = imageView;
            this.f129822f = str;
            this.f129823g = i;
        }

        public void run() {
            C48540e.m53921c(this.f129820d, this.f129821e, this.f129822f, this.f129823g);
        }
    }

    /* renamed from: t71.e$b */
    public class C48542b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f129824d;

        public C48542b(MMActivity mMActivity) {
            this.f129824d = mMActivity;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, this.f129824d.getString(C0966R.string.ccq));
        }
    }

    /* renamed from: t71.e$c */
    public class C48543c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f129825d;

        public C48543c(MMActivity mMActivity) {
            this.f129825d = mMActivity;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                MMActivity mMActivity = this.f129825d;
                Intent intent = new Intent();
                intent.putExtra("query_source_type", 9);
                intent.putExtra("query_media_type", 1);
                intent.putExtra("max_select_count", 1);
                C88144b.m109795m(mMActivity, "gallery", ".ui.AlbumPreviewUI", intent, 1001);
            }
        }
    }

    /* renamed from: a */
    public static boolean m53919a(MMActivity mMActivity, int i, int i2, Intent intent, String str) {
        String str2;
        if (i == 1001 && i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (stringArrayListExtra != null && stringArrayListExtra.size() >= 1) {
                Intent intent2 = new Intent();
                intent2.setClassName(mMActivity, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
                intent2.putExtra("CropImageMode", 1);
                intent2.putExtra("CropImage_OutputPath", C112760b.m154249u() + "temp.cover");
                intent2.putExtra("CropImage_ImgPath", stringArrayListExtra.get(0));
                mMActivity.startActivityForResult(intent2, 1002);
                return true;
            }
        } else if (i == 1002 && i2 == -1) {
            String str3 = C112760b.m154249u() + "temp.cover";
            String str4 = C48539d.f129819a;
            if (Util.isNullOrNil(str3)) {
                str2 = "";
            } else {
                String str5 = MD5Util.getMD5String(str3) + "_t";
                C86009m1 m1Var = new C86009m1(C48539d.f129819a);
                if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                    m1Var.mo119987x();
                }
                str2 = new C86009m1(m1Var, str5).mo119971i();
            }
            BitmapUtil.createThumbNail(str3, 640, 640, Bitmap.CompressFormat.JPEG, 100, str2, true);
            System.currentTimeMillis();
            if (C41166r1.wx0().f110912s == null) {
                C41166r1.wx0().f110912s = new C48538c();
            }
            C48538c cVar = C41166r1.wx0().f110912s;
            cVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String b = C1297x.m1387b("uploadexdeivce", currentTimeMillis, C75592q0.m90777g().getUsername(), "" + currentTimeMillis);
            cVar.f129818d = b;
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_ExdevicePictureUploader";
            gVar.f287662f = cVar;
            gVar.field_mediaId = b;
            gVar.field_fullpath = str2;
            gVar.field_thumbpath = "";
            gVar.field_fileType = CdnLogic.kMediaTypeSmartHwPage;
            gVar.field_talker = "";
            gVar.field_priority = 1;
            gVar.field_needStorage = true;
            gVar.field_isStreamMedia = false;
            gVar.field_appType = 200;
            gVar.field_bzScene = 2;
            if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
                Log.m105921e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", b);
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m53920b(Context context, ImageView imageView, String str, int i) {
        Assert.assertTrue(imageView != null);
        if (MMHandlerThread.isMainThread()) {
            m53921c(context, imageView, str, i);
        } else {
            MMHandlerThread.postToMainThread(new C48541a(context, imageView, str, i));
        }
    }

    /* renamed from: c */
    public static void m53921c(Context context, ImageView imageView, String str, int i) {
        C20937c cVar;
        if (Util.isNullOrNil(str) || "#".equals(str)) {
            Log.m105918d("MicroMsg.ExdeviceRankUtil", "hy: url is null or nill. set to default picture resource");
            imageView.setImageResource(i);
            return;
        }
        Log.m105919d("MicroMsg.ExdeviceRankUtil", "hy: set url to %s", str);
        if (C41166r1.wx0().f110913t == null) {
            C41166r1.wx0().f110913t = C20828a.m22825b();
        }
        C20828a aVar = C41166r1.wx0().f110913t;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
            C41166r1 wx02 = C41166r1.wx0();
            if (wx02.f110914u == null) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59355k = 640;
                bVar.f59354j = 640;
                bVar.f59345a = false;
                bVar.f59346b = true;
                wx02.f110914u = bVar.mo32666a();
            }
            cVar = C41166r1.wx0().f110914u;
        } else {
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59355k = 640;
            bVar2.f59354j = 640;
            bVar2.f59345a = false;
            bVar2.f59347c = true;
            bVar2.f59351g = C7970a.m8127a();
            cVar = bVar2.mo32666a();
        }
        aVar.mo32519h(str, imageView, cVar);
    }

    /* renamed from: d */
    public static void m53922d(MMActivity mMActivity) {
        C77407n nVar = new C77407n((Context) mMActivity.getContext(), 1, false);
        nVar.f225771i = new C48542b(mMActivity);
        nVar.f225782p = new C48543c(mMActivity);
        nVar.mo107573q();
    }
}
