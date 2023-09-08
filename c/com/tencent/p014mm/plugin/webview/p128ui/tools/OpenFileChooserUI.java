package com.tencent.p014mm.plugin.webview.p128ui.tools;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.C85457c;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import f40.C86709a0;
import j83.C9286a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ol0.C117812i0;
import p140cw.C7138g;
import p447aw.C103918d;
import p500dy.C97560f;
import p682rz.C101480j;
import p910lj.C76701a;
import p914oj.C100361a;
import p914oj.C89231c;
import uf0.C102016c;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI */
public class OpenFileChooserUI extends MMActivity {

    /* renamed from: u */
    public static final /* synthetic */ int f22500u = 0;

    /* renamed from: d */
    public int f22501d;

    /* renamed from: e */
    public int f22502e;

    /* renamed from: f */
    public int f22503f;

    /* renamed from: g */
    public boolean f22504g;

    /* renamed from: h */
    public int f22505h;

    /* renamed from: i */
    public int f22506i;

    /* renamed from: j */
    public int f22507j;

    /* renamed from: n */
    public String f22508n;

    /* renamed from: o */
    public String f22509o;

    /* renamed from: p */
    public String f22510p;

    /* renamed from: q */
    public boolean f22511q;

    /* renamed from: r */
    public ProgressDialog f22512r = null;

    /* renamed from: s */
    public boolean f22513s = false;

    /* renamed from: t */
    public DialogInterface.OnCancelListener f22514t = null;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$a */
    public class C6119a implements DialogInterface.OnCancelListener {
        public C6119a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            OpenFileChooserUI.this.setResult(0);
            OpenFileChooserUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b */
    public class C6120b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f22516d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$a */
        public class C6121a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$a$a */
            public class C6122a implements DialogInterface.OnClickListener {
                public C6122a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    OpenFileChooserUI.this.setResult(1);
                    OpenFileChooserUI.this.finish();
                }
            }

            public C6121a() {
            }

            public void run() {
                OpenFileChooserUI openFileChooserUI = OpenFileChooserUI.this;
                if (openFileChooserUI.f22502e == 7 && openFileChooserUI.f22503f == 2) {
                    C76879j.m92711E(openFileChooserUI, openFileChooserUI.getString(C0966R.string.lfx), OpenFileChooserUI.this.getString(C0966R.string.a3h), OpenFileChooserUI.this.getString(C0966R.string.f8029zr), false, new C6122a());
                    return;
                }
                C76701a.makeText((Context) openFileChooserUI, (CharSequence) openFileChooserUI.getString(C0966R.string.ka_), 0).show();
                OpenFileChooserUI.this.setResult(1);
                OpenFileChooserUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$b */
        public class C6123b implements Runnable {

            /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$b$a */
            public class C6124a implements DialogInterface.OnClickListener {
                public C6124a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    OpenFileChooserUI.this.setResult(1);
                    OpenFileChooserUI.this.finish();
                }
            }

            public C6123b() {
            }

            public void run() {
                OpenFileChooserUI openFileChooserUI = OpenFileChooserUI.this;
                C76879j.m92711E(openFileChooserUI, openFileChooserUI.getString(C0966R.string.lfy), OpenFileChooserUI.this.getString(C0966R.string.a3h), OpenFileChooserUI.this.getString(C0966R.string.f8029zr), false, new C6124a());
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$c */
        public class C6125c implements Runnable {
            public C6125c() {
            }

            public void run() {
                OpenFileChooserUI.this.setResult(1);
                OpenFileChooserUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$d */
        public class C6126d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f22523d;

            /* renamed from: e */
            public final /* synthetic */ String f22524e;

            public C6126d(String str, String str2) {
                this.f22523d = str;
                this.f22524e = str2;
            }

            public void run() {
                Intent intent = new Intent();
                intent.putExtra("key_pick_local_media_callback_type", 1);
                intent.putExtra("key_pick_local_media_local_id", this.f22523d);
                intent.putExtra("key_pick_local_media_thumb_local_id", this.f22524e);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "thumbLocalId:%s", this.f22524e);
                OpenFileChooserUI.this.setResult(-1, intent);
                OpenFileChooserUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$b$e */
        public class C6127e implements Runnable {
            public C6127e() {
            }

            public void run() {
                OpenFileChooserUI.this.setResult(1);
                OpenFileChooserUI.this.finish();
            }
        }

        public C6120b(String str) {
            this.f22516d = str;
        }

        public void run() {
            C100361a.C77012a aVar;
            int i;
            String str;
            String str2;
            C89231c cVar;
            String str3;
            int i2;
            boolean z;
            Class cls = ISightJNIService.class;
            ArrayList arrayList = new ArrayList();
            OpenFileChooserUI openFileChooserUI = OpenFileChooserUI.this;
            String str4 = this.f22516d;
            int i3 = OpenFileChooserUI.f22500u;
            openFileChooserUI.getClass();
            Intent intent = new Intent();
            intent.setData(Uri.parse("file://" + str4));
            int i4 = -1;
            String str5 = null;
            try {
                aVar = C100361a.m131253b(openFileChooserUI, intent, -1);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.OpenFileChooserUI", e, "", new Object[0]);
                aVar = null;
            }
            if (aVar == null) {
                Log.m105920e("MicroMsg.OpenFileChooserUI", "compressVideo filed.");
                i = -50005;
            } else {
                String str6 = aVar.f224997a;
                boolean a = C102016c.m134339a(str6);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "isMp4 = %b", Boolean.valueOf(a));
                int i5 = -10000;
                if (a) {
                    str3 = str6;
                    i5 = ((ISightJNIService) C86312j.m106911c(cls)).shouldRemuxingVFS(str6, JsApiResumeDownloadTaskForNative.CTRL_INDEX, 500, 26214400, 300000.0d, 1000000);
                    Log.m105925i("MicroMsg.OpenFileChooserUI", "check remuxing, ret %d", Integer.valueOf(i5));
                } else {
                    str3 = str6;
                }
                if (i5 == -1 || !a) {
                    int l = (int) C86013q1.m106451l(str3);
                    Log.m105925i("MicroMsg.OpenFileChooserUI", "fileLenght = %d", Integer.valueOf(l));
                    if (l <= 26214400) {
                        i4 = 1;
                    }
                } else {
                    i4 = i5;
                }
                switch (i4) {
                    case -6:
                    case -5:
                    case -4:
                    case -3:
                    case -2:
                    case -1:
                        i = -50002;
                        break;
                    case 0:
                        z = true;
                        i2 = 0;
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        z = false;
                        i2 = 1;
                        break;
                    default:
                        Log.m105920e("MicroMsg.OpenFileChooserUI", "unknown check type");
                        i = -50001;
                        break;
                }
                if (z) {
                    i2 = -50006;
                }
                Log.m105925i("MicroMsg.OpenFileChooserUI", "finish to import %s  ret %d | duration %d", str3, Integer.valueOf(i2), Integer.valueOf(aVar.f224999c / 1000));
                i = i2;
            }
            if (i == -50002) {
                MMHandlerThread.postToMainThread(new C6121a());
                return;
            }
            if (i == -50006) {
                OpenFileChooserUI openFileChooserUI2 = OpenFileChooserUI.this;
                String str7 = this.f22516d;
                openFileChooserUI2.getClass();
                int[] iArr = new int[2];
                ((C101480j) C86312j.m106911c(C101480j.class)).mo140782Vx(str7, iArr);
                int i6 = iArr[0];
                int i7 = iArr[1];
                PInt pInt = new PInt();
                PInt pInt2 = new PInt();
                PInt pInt3 = new PInt();
                PInt pInt4 = new PInt();
                ((C97560f) C86312j.m106911c(C97560f.class)).mo136826xX(str7, pInt, pInt2, pInt3, pInt4, new PInt());
                String str8 = openFileChooserUI2.mo7081K7() + "microMsg." + System.currentTimeMillis() + ".mp4";
                int remuxingVFS = ((ISightJNIService) C86312j.m106911c(cls)).remuxingVFS(str7, str8, i6, i7, C85457c.f249058c, C85457c.f249057b, 8, 2, 25.0f, (float) pInt4.value, (byte[]) null, 0, false, 0, 51);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", str7, str8, Integer.valueOf(remuxingVFS), Integer.valueOf(i6), Integer.valueOf(i7));
                WebViewJSSDKVideoItem a2 = C6049n1.m5932a(str8);
                a2.f283030p = i6;
                a2.f283031q = i7;
                a2.f22269w = remuxingVFS;
                a2.f283029o = (int) C86013q1.m106451l(str8);
                arrayList.add(a2.f283022e);
                C6080m.Ax0().mo7009a(a2);
                str2 = a2.f283022e;
                OpenFileChooserUI.m6011H7(OpenFileChooserUI.this, this.f22516d);
                str = OpenFileChooserUI.m6012I7(OpenFileChooserUI.this);
            } else if (i == 1) {
                OpenFileChooserUI openFileChooserUI3 = OpenFileChooserUI.this;
                String str9 = this.f22516d;
                openFileChooserUI3.getClass();
                try {
                    cVar = new C89231c();
                    cVar.setDataSource(str9);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.OpenFileChooserUI", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e2);
                    cVar = null;
                }
                if (cVar != null) {
                    int i8 = Util.getInt(cVar.extractMetadata(18), 0);
                    int i9 = Util.getInt(cVar.extractMetadata(19), 0);
                    int i15 = Util.getInt(cVar.extractMetadata(9), 0);
                    cVar.release();
                    cVar.release();
                    WebViewJSSDKVideoItem a3 = C6049n1.m5932a(str9);
                    a3.f22269w = (i15 + 500) / 1000;
                    a3.f283030p = i8;
                    a3.f283031q = i9;
                    a3.f283029o = (int) C86013q1.m106451l(str9);
                    if (openFileChooserUI3.f22507j == 1) {
                        a3.f283023f = openFileChooserUI3.f22509o;
                    }
                    C6080m.Ax0().mo7009a(a3);
                    str5 = a3.f283022e;
                }
                OpenFileChooserUI.m6011H7(OpenFileChooserUI.this, this.f22516d);
                str = OpenFileChooserUI.m6012I7(OpenFileChooserUI.this);
                if (Util.isNullOrNil(str5)) {
                    OpenFileChooserUI openFileChooserUI4 = OpenFileChooserUI.this;
                    if (openFileChooserUI4.f22502e == 7 && openFileChooserUI4.f22503f == 2) {
                        MMHandlerThread.postToMainThread(new C6123b());
                        return;
                    }
                }
                str2 = str5;
            } else {
                MMHandlerThread.postToMainThread(new C6125c());
                return;
            }
            if (!Util.isNullOrNil(str2)) {
                MMHandlerThread.postToMainThread(new C6126d(str2, str));
            } else {
                MMHandlerThread.postToMainThread(new C6127e());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$c */
    public class C6128c implements DialogInterface.OnClickListener {
        public C6128c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(OpenFileChooserUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$d */
    public class C6129d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f22528d;

        /* renamed from: e */
        public final /* synthetic */ int f22529e;

        public C6129d(Intent intent, int i) {
            this.f22528d = intent;
            this.f22529e = i;
        }

        public void run() {
            ArrayList<String> stringArrayListExtra = this.f22528d.getStringArrayListExtra("CropImage_OutputPath_List");
            boolean booleanExtra = this.f22528d.getBooleanExtra("isTakePhoto", false);
            boolean booleanExtra2 = this.f22528d.getBooleanExtra("CropImage_Compress_Img", true);
            ArrayList arrayList = new ArrayList();
            for (String next : stringArrayListExtra) {
                WebViewJSSDKFileItem b = C6049n1.m5933b(next);
                String str = b.f283022e;
                b.f283034t = booleanExtra2;
                C6080m.Ax0().mo7009a(b);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", next, str);
                arrayList.add(str);
            }
            String g = C43702g2.m47534g(arrayList);
            Log.m105925i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g);
            Intent intent = new Intent();
            intent.putExtra("key_pick_local_pic_callback_local_ids", g);
            intent.putExtra("key_pick_local_pic_source_type", booleanExtra ? "camera" : FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
            intent.putExtra("key_pick_local_media_show_memory_warning", OpenFileChooserUI.this.f22513s);
            OpenFileChooserUI.this.setResult(this.f22529e, intent);
            OpenFileChooserUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$e */
    public class C6130e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f22531d;

        /* renamed from: e */
        public final /* synthetic */ Intent f22532e;

        /* renamed from: f */
        public final /* synthetic */ int f22533f;

        public C6130e(String str, Intent intent, int i) {
            this.f22531d = str;
            this.f22532e = intent;
            this.f22533f = i;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            WebViewJSSDKFileItem b = C6049n1.m5933b(this.f22531d);
            b.f283034t = true;
            b.f283028n = 1;
            C6080m.Ax0().mo7009a(b);
            arrayList.add(b.f283022e);
            Log.m105925i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", this.f22531d, b.f283022e);
            String g = Util.isEqual(OpenFileChooserUI.this.f22510p, JsApiChooseImage.NAME) ? C43702g2.m47534g(arrayList) : C43702g2.m47535h(arrayList);
            Log.m105925i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g);
            this.f22532e.putExtra("key_pick_local_media_local_ids", g);
            this.f22532e.putExtra("key_pick_local_media_callback_type", 2);
            this.f22532e.putExtra("key_pick_local_media_show_memory_warning", OpenFileChooserUI.this.f22513s);
            this.f22532e.putExtra("key_pick_local_pic_source_type", OpenFileChooserUI.this.f22511q ? "camera" : FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
            OpenFileChooserUI.this.setResult(this.f22533f, this.f22532e);
            OpenFileChooserUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI$f */
    public class C6131f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f22535d;

        /* renamed from: e */
        public final /* synthetic */ boolean f22536e;

        /* renamed from: f */
        public final /* synthetic */ int f22537f;

        public C6131f(List list, boolean z, int i) {
            this.f22535d = list;
            this.f22536e = z;
            this.f22537f = i;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f22535d) {
                WebViewJSSDKFileItem b = C6049n1.m5933b(str);
                String str2 = b.f283022e;
                b.f283034t = this.f22536e;
                C6080m.Ax0().mo7009a(b);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", str, str2);
                arrayList.add(str2);
            }
            String g = Util.isEqual(OpenFileChooserUI.this.f22510p, JsApiChooseImage.NAME) ? C43702g2.m47534g(arrayList) : C43702g2.m47535h(arrayList);
            Log.m105925i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g);
            Intent intent = new Intent();
            intent.putExtra("key_pick_local_media_local_ids", g);
            intent.putExtra("key_pick_local_media_show_memory_warning", OpenFileChooserUI.this.f22513s);
            intent.putExtra("key_pick_local_media_callback_type", 2);
            intent.putExtra("key_pick_local_pic_source_type", OpenFileChooserUI.this.f22511q ? "camera" : FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
            OpenFileChooserUI.this.setResult(this.f22537f, intent);
            OpenFileChooserUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public static void m6011H7(OpenFileChooserUI openFileChooserUI, String str) {
        C86009m1 m1Var;
        if (openFileChooserUI.f22507j == 0) {
            Log.m105920e("MicroMsg.OpenFileChooserUI", "don't need thumb image");
            return;
        }
        if (!TextUtils.isEmpty(openFileChooserUI.f22509o)) {
            m1Var = new C86009m1(openFileChooserUI.f22509o);
        } else {
            Log.m105920e("MicroMsg.OpenFileChooserUI", "thumbFilePath is empty!");
            m1Var = null;
        }
        if (m1Var == null || !m1Var.mo119967g()) {
            Log.m105921e("MicroMsg.OpenFileChooserUI", "file == null or file not exist for path:%s!", openFileChooserUI.f22509o);
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            String substring = (TextUtils.isEmpty(path2) || !path2.contains(".")) ? null : path2.substring(0, path2.lastIndexOf("."));
            if (TextUtils.isEmpty(substring)) {
                openFileChooserUI.f22509o = openFileChooserUI.mo7081K7() + ("microMsg_" + System.currentTimeMillis()) + ".jpeg";
            } else if (openFileChooserUI.mo7081K7() == null || !openFileChooserUI.mo7081K7().endsWith("/")) {
                openFileChooserUI.f22509o = openFileChooserUI.mo7081K7() + "/" + substring + ".jpeg";
            } else {
                openFileChooserUI.f22509o = openFileChooserUI.mo7081K7() + substring + ".jpeg";
            }
            Uri n2 = C116299g2.m163858n(openFileChooserUI.f22509o);
            String path3 = n2.getPath();
            if (path3 != null) {
                String k2 = C116299g2.m163855k(path3, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105925i("MicroMsg.OpenFileChooserUI", "file not exist for path:%s!", openFileChooserUI.f22509o);
                Log.m105925i("MicroMsg.OpenFileChooserUI", "create new thumb path:%s!", openFileChooserUI.f22509o);
                Bitmap createVideoThumbnail = BitmapUtil.createVideoThumbnail(str, 1);
                if (createVideoThumbnail == null) {
                    Log.m105921e("MicroMsg.OpenFileChooserUI", "createVideoThumbnail bitmap fail for path:%s!", openFileChooserUI.f22509o);
                    return;
                }
                try {
                    BitmapUtil.saveBitmapToImage(ThumbnailUtils.extractThumbnail(createVideoThumbnail, C117812i0.CTRL_INDEX, 400, 2), 30, Bitmap.CompressFormat.JPEG, openFileChooserUI.f22509o, true);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.OpenFileChooserUI", "saveBitmapToImage exist IOException:" + e.getMessage());
                }
            } else {
                Log.m105925i("MicroMsg.OpenFileChooserUI", "file is exist for path:%s!", openFileChooserUI.f22509o);
            }
        } else {
            Log.m105925i("MicroMsg.OpenFileChooserUI", "file is exist!, path:%s", openFileChooserUI.f22509o);
        }
    }

    /* renamed from: I7 */
    public static String m6012I7(OpenFileChooserUI openFileChooserUI) {
        if (TextUtils.isEmpty(openFileChooserUI.f22509o)) {
            return "";
        }
        WebViewJSSDKFileItem b = C6049n1.m5933b(openFileChooserUI.f22509o);
        b.f283023f = openFileChooserUI.f22509o;
        b.f283034t = true;
        b.f283028n = 1;
        C6080m.Ax0().mo7009a(b);
        return b.f283022e;
    }

    /* renamed from: J7 */
    public final void mo7080J7(String str) {
        this.f22514t = new C6119a();
        this.f22512r = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.lfw), true, true, this.f22514t);
        C86709a0.m107525e().postToWorker(new C6120b(str));
    }

    /* renamed from: K7 */
    public final String mo7081K7() {
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        C86009m1 i0 = C112760b.m154236i0("OpenFileChooserUI");
        if (!i0.mo119967g()) {
            i0.mo119987x();
        }
        String i = i0.mo119971i();
        if (i.endsWith("/")) {
            return i;
        }
        return i + "/";
    }

    /* renamed from: L7 */
    public final SightParams mo7082L7(int i) {
        String str = "microMsg_" + System.currentTimeMillis();
        this.f22508n = mo7081K7() + str + ".mp4";
        this.f22509o = mo7081K7() + str + ".jpeg";
        int intExtra = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        SightParams sightParams = new SightParams(3, 1);
        sightParams.f248451e = this.f22505h == 16 ? 1 : 2;
        sightParams.f248450d = i;
        if (sightParams.f248452f == null) {
            sightParams.f248452f = new VideoTransPara();
        }
        sightParams.f248452f.f267170h = intExtra;
        sightParams.mo118479a(str, this.f22508n, this.f22509o, mo7081K7() + String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"}));
        return sightParams;
    }

    /* renamed from: M7 */
    public final boolean mo7083M7() {
        Log.m105925i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", Long.valueOf(Util.getAvailableMemoryMB(this)));
        return Util.getAvailableMemoryMB(this) > 200;
    }

    /* renamed from: N7 */
    public final boolean mo7084N7(String str) {
        if (!TextUtils.isEmpty(str)) {
            C86009m1 m1Var = new C86009m1(str);
            Log.m105925i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", str);
            if (m1Var.mo119967g()) {
                Log.m105924i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
                return true;
            }
            Log.m105920e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
            return false;
        }
        Log.m105920e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
        return false;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_pick_local_media_show_memory_warning", this.f22513s);
            setResult(i2, intent2);
            finish();
            return;
        }
        C86009m1 m1Var = null;
        switch (i) {
            case 1:
            case 3:
                C9286a.m8929a(new C6129d(intent, i2));
                return;
            case 2:
                String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(getContext().getApplicationContext(), intent, mo7081K7());
                if (Util.isNullOrNil(g6)) {
                    Log.m105928w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
                    setResult(-2, intent);
                    finish();
                    return;
                }
                Log.m105925i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", g6);
                Intent intent3 = new Intent();
                intent3.putExtra("key_send_raw_image", this.f22504g);
                intent3.putExtra("max_select_count", this.f22501d);
                intent3.putExtra("query_source_type", this.f22502e);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(g6);
                intent3.putStringArrayListExtra("preview_image_list", arrayList);
                intent3.putExtra("preview_image", true);
                intent3.addFlags(67108864);
                C88144b.m109795m(this, "gallery", ".ui.GalleryEntryUI", intent3, 3);
                return;
            case 4:
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    Log.m105920e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
                    setResult(1);
                    finish();
                    return;
                }
                Log.m105924i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
                Log.m105925i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", stringArrayListExtra.get(0));
                if (this.f22507j == 1 && !mo7084N7(this.f22509o)) {
                    Log.m105924i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
                }
                mo7080J7(stringArrayListExtra.get(0));
                return;
            case 5:
                Uri n = C116299g2.m163858n(this.f22508n);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    mo7080J7(this.f22508n);
                    return;
                }
                Log.m105921e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", this.f22508n);
                setResult(1);
                finish();
                return;
            case 6:
                Log.m105924i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
                if (intent != null) {
                    Log.m105924i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                    if (sightCaptureResult == null) {
                        Log.m105920e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    }
                    String str = sightCaptureResult.f201517g;
                    this.f22508n = str;
                    Log.m105925i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str);
                    if (!mo7084N7(this.f22509o) && mo7084N7(sightCaptureResult.f201518h)) {
                        this.f22509o = sightCaptureResult.f201518h;
                    }
                    if (!TextUtils.isEmpty(this.f22508n)) {
                        m1Var = new C86009m1(this.f22508n);
                    }
                    if (m1Var == null || !m1Var.mo119967g()) {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f22508n);
                    } else {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f22508n);
                        mo7080J7(this.f22508n);
                        return;
                    }
                }
                Log.m105920e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 7:
                Log.m105924i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
                if (intent != null) {
                    Log.m105924i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    SightCaptureResult sightCaptureResult2 = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                    if (sightCaptureResult2 == null) {
                        Log.m105920e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    } else if (sightCaptureResult2.f201515e) {
                        String str2 = sightCaptureResult2.f201523p;
                        Intent intent4 = new Intent();
                        if (Util.isNullOrNil(str2)) {
                            Log.m105921e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str2);
                            intent4.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                            setResult(1, intent4);
                            finish();
                            return;
                        }
                        Uri n2 = C116299g2.m163858n(str2);
                        String path2 = n2.getPath();
                        if (path2 != null) {
                            String k2 = C116299g2.m163855k(path2, false, false);
                            if (!n2.getPath().equals(k2)) {
                                n2 = n2.buildUpon().path(k2).build();
                            }
                        }
                        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                        if (!(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b))) {
                            Log.m105921e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str2);
                            intent4.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                            setResult(1, intent4);
                            finish();
                            return;
                        }
                        C9286a.m8929a(new C6130e(str2, intent4, i2));
                        return;
                    } else {
                        String str3 = sightCaptureResult2.f201517g;
                        this.f22508n = str3;
                        Log.m105925i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str3);
                        if (!mo7084N7(this.f22509o) && mo7084N7(sightCaptureResult2.f201518h)) {
                            this.f22509o = sightCaptureResult2.f201518h;
                        }
                        if (!TextUtils.isEmpty(this.f22508n)) {
                            m1Var = new C86009m1(this.f22508n);
                        }
                        if (m1Var == null || !m1Var.mo119967g()) {
                            Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f22508n);
                        } else {
                            Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f22508n);
                            mo7080J7(this.f22508n);
                            return;
                        }
                    }
                }
                Log.m105920e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 8:
                Log.m105924i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) {
                    ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                    boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", true);
                    if (stringArrayListExtra3 == null) {
                        Log.m105920e("MicroMsg.OpenFileChooserUI", "chosen is null");
                        setResult(1);
                        finish();
                        return;
                    }
                    C9286a.m8929a(new C6131f(stringArrayListExtra3, booleanExtra, i2));
                    return;
                }
                mo7080J7(stringArrayListExtra2.get(0));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r8 = r19
            java.lang.Class<cw.g> r9 = p140cw.C7138g.class
            super.onCreate(r20)
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_pic_count"
            r10 = 0
            int r0 = r0.getIntExtra(r1, r10)
            r8.f22506i = r0
            r1 = 9
            r11 = 1
            if (r0 < r11) goto L_0x001b
            if (r0 <= r1) goto L_0x001d
        L_0x001b:
            r8.f22506i = r1
        L_0x001d:
            int r0 = r8.f22506i
            r8.f22501d = r0
            android.content.Intent r0 = r19.getIntent()
            r1 = 8
            java.lang.String r2 = "key_pick_local_pic_query_source_type"
            int r0 = r0.getIntExtra(r2, r1)
            r8.f22502e = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r12 = "query_media_type"
            int r0 = r0.getIntExtra(r12, r11)
            r8.f22503f = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_pic_send_raw"
            boolean r0 = r0.getBooleanExtra(r1, r10)
            r8.f22504g = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_pic_capture"
            r13 = 3
            int r0 = r0.getIntExtra(r1, r13)
            r8.f22505h = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_media_video_type"
            int r0 = r0.getIntExtra(r1, r10)
            r8.f22507j = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_media_choose_type"
            java.lang.String r0 = r0.getStringExtra(r1)
            r8.f22510p = r0
            int r0 = r8.f22505h
            r14 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r8.f22511q = r0
            int r0 = r8.f22502e
            r1 = 7
            java.lang.String r15 = "MicroMsg.OpenFileChooserUI"
            r7 = 2131840029(0x7f114c1d, float:1.9313326E38)
            java.lang.String r6 = "show_header_view"
            java.lang.String r5 = "key_send_raw_image"
            r4 = 2
            if (r0 != r1) goto L_0x008c
            int r0 = r8.f22503f
            if (r0 == r4) goto L_0x009a
        L_0x008c:
            int r0 = r8.f22503f
            if (r0 == r13) goto L_0x009a
            r14 = r5
            r18 = r6
            r0 = 0
            r10 = 2
            r13 = 2131840029(0x7f114c1d, float:1.9313326E38)
            goto L_0x035f
        L_0x009a:
            boolean r0 = r19.mo7083M7()
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = r8.getString(r7)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r11)
            r0.show()
            r8.f22513s = r11
        L_0x00ad:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            boolean r0 = r8.f22504g
            r3.putExtra(r5, r0)
            int r0 = r8.f22503f
            r3.putExtra(r12, r0)
            int r0 = r8.f22507j
            java.lang.String r1 = "video_full_path"
            java.lang.String r2 = "record_video_time_limit"
            java.lang.String r4 = "record_video_quality"
            java.lang.String r7 = "record_video_force_sys_camera"
            java.lang.String r13 = "key_pick_local_media_duration"
            java.lang.String r10 = "key_pick_local_media_quality"
            if (r0 != r11) goto L_0x0164
            int r0 = r8.f22505h
            java.lang.String r14 = "KEY_SIGHT_PARAMS"
            r11 = 4096(0x1000, float:5.74E-42)
            if (r0 == r11) goto L_0x0124
            r11 = r0 & 4096(0x1000, float:5.74E-42)
            if (r11 <= 0) goto L_0x0124
            android.content.Intent r0 = r19.getIntent()
            r11 = 1
            int r0 = r0.getIntExtra(r10, r11)
            android.content.Intent r10 = r19.getIntent()
            r16 = r5
            r5 = 60
            int r5 = r10.getIntExtra(r13, r5)
            com.tencent.mm.plugin.mmsight.SightParams r10 = r8.mo7082L7(r11)
            r3.putExtra(r14, r10)
            r10 = 0
            r3.putExtra(r7, r10)
            r3.putExtra(r6, r11)
            java.lang.String r7 = "record_video_is_sight_capture"
            r3.putExtra(r7, r11)
            r3.putExtra(r4, r0)
            r3.putExtra(r2, r5)
            java.lang.String r0 = r8.f22508n
            r3.putExtra(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 4
            int r4 = r8.f22501d
            int r5 = r8.f22502e
            r1 = r19
            r11 = r3
            r3 = r4
            r7 = 2
            r4 = r5
            r10 = r16
            r5 = r11
            r0.mo8308Fc(r1, r2, r3, r4, r5)
            goto L_0x0161
        L_0x0124:
            r11 = r3
            r10 = r5
            r7 = 2
            r1 = 16
            if (r0 == r1) goto L_0x014a
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L_0x0130
            goto L_0x014a
        L_0x0130:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L_0x0161
            r0 = 0
            r11.putExtra(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 4
            int r3 = r8.f22501d
            int r4 = r8.f22502e
            r1 = r19
            r5 = r11
            r0.mo8308Fc(r1, r2, r3, r4, r5)
            goto L_0x0161
        L_0x014a:
            r0 = 1
            com.tencent.mm.plugin.mmsight.SightParams r1 = r8.mo7082L7(r0)
            r11.putExtra(r14, r1)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 6
            r4 = 3
            r5 = 1
            r1 = r19
            r3 = r11
            r0.mo8314Vt(r1, r2, r3, r4, r5)
        L_0x0161:
            r14 = r10
            goto L_0x02ea
        L_0x0164:
            r11 = r3
            r14 = r5
            r5 = 2
            if (r0 != r5) goto L_0x025d
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "key_pick_local_media_sight_type"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            int r1 = r8.f22505h
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 == r2) goto L_0x0194
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 <= 0) goto L_0x0194
            java.lang.String r0 = "choose media from local or camera is not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r0 = 1
            r8.setResult(r0)
            r19.finish()
        L_0x018d:
            r17 = r6
            r11 = 2131840029(0x7f114c1d, float:1.9313326E38)
            r13 = 2
            goto L_0x01f1
        L_0x0194:
            java.lang.String r2 = "image"
            java.lang.String r3 = "video"
            r4 = 16
            if (r1 == r4) goto L_0x01f6
            r4 = 256(0x100, float:3.59E-43)
            if (r1 != r4) goto L_0x01a2
            goto L_0x01f6
        L_0x01a2:
            r4 = 4096(0x1000, float:5.74E-42)
            if (r1 != r4) goto L_0x018d
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x01b3
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L_0x01b3
            goto L_0x01c3
        L_0x01b3:
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x01bb
            r7 = 1
            goto L_0x01c4
        L_0x01bb:
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x01c3
            r7 = 2
            goto L_0x01c4
        L_0x01c3:
            r7 = 3
        L_0x01c4:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r0 = "key_can_select_video_and_pic"
            r1 = 1
            r10.putExtra(r0, r1)
            boolean r0 = r8.f22504g
            r10.putExtra(r14, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 8
            int r3 = r8.f22501d
            int r4 = r8.f22502e
            r11 = 0
            r1 = r19
            r13 = 2
            r5 = r7
            r7 = r6
            r6 = r11
            r17 = r7
            r11 = 2131840029(0x7f114c1d, float:1.9313326E38)
            r7 = r10
            r0.mo8324nq(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0259
        L_0x01f1:
            r6 = r17
            r7 = 2
            goto L_0x02ea
        L_0x01f6:
            r17 = r6
            r11 = 2131840029(0x7f114c1d, float:1.9313326E38)
            r13 = 2
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L_0x0209
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0209
            goto L_0x0219
        L_0x0209:
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L_0x0211
            r4 = 1
            goto L_0x021a
        L_0x0211:
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0219
            r4 = 2
            goto L_0x021a
        L_0x0219:
            r4 = 0
        L_0x021a:
            com.tencent.mm.plugin.mmsight.SightParams r1 = r8.mo7082L7(r4)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.f248452f
            int r4 = r1.f267170h
            int r4 = r4 * 1000
            r5 = 18
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119435e(r1, r4, r5)
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x0234
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.f272932t = r3
        L_0x0234:
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x023e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.f272931s = r0
        L_0x023e:
            java.lang.String r0 = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout"
            r2 = 0
            r1.mo129804a(r2, r0)
            java.lang.String r0 = "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout"
            r1.mo129804a(r13, r0)
            java.lang.Class<rw.l> r0 = p232rw.C77572l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.l r0 = (p232rw.C77572l) r0
            com.tencent.mm.plugin.webview.ui.tools.h r2 = new com.tencent.mm.plugin.webview.ui.tools.h
            r2.<init>(r8)
            r0.mo107612ZM(r8, r1, r2)
        L_0x0259:
            r18 = r17
            goto L_0x02ec
        L_0x025d:
            r17 = r6
            r6 = 2131840029(0x7f114c1d, float:1.9313326E38)
            int r0 = r8.f22505h
            java.lang.String r3 = ".mp4"
            java.lang.String r5 = "microMsg."
            r6 = 4096(0x1000, float:5.74E-42)
            if (r0 == r6) goto L_0x02c5
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 <= 0) goto L_0x02c5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r19.mo7081K7()
            r0.append(r6)
            r0.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.f22508n = r0
            android.content.Intent r0 = r19.getIntent()
            r3 = 1
            int r0 = r0.getIntExtra(r10, r3)
            android.content.Intent r5 = r19.getIntent()
            r6 = 60
            int r5 = r5.getIntExtra(r13, r6)
            r11.putExtra(r7, r3)
            r11.putExtra(r4, r0)
            r11.putExtra(r2, r5)
            java.lang.String r0 = r8.f22508n
            r11.putExtra(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 4
            int r3 = r8.f22501d
            int r4 = r8.f22502e
            r1 = r19
            r7 = 2
            r5 = r11
            r0.mo8308Fc(r1, r2, r3, r4, r5)
            r6 = r17
            goto L_0x02ea
        L_0x02c5:
            r7 = 2
            r1 = 16
            if (r0 == r1) goto L_0x02f1
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L_0x02cf
            goto L_0x02f1
        L_0x02cf:
            r1 = 4096(0x1000, float:5.74E-42)
            r6 = r17
            if (r0 != r1) goto L_0x02ea
            r0 = 0
            r11.putExtra(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 4
            int r3 = r8.f22501d
            int r4 = r8.f22502e
            r1 = r19
            r5 = r11
            r0.mo8308Fc(r1, r2, r3, r4, r5)
        L_0x02ea:
            r18 = r6
        L_0x02ec:
            r10 = 2
            r13 = 2131840029(0x7f114c1d, float:1.9313326E38)
            goto L_0x0345
        L_0x02f1:
            r6 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r19.mo7081K7()
            r0.append(r1)
            r0.append(r5)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.f22508n = r0
            android.content.Intent r0 = r19.getIntent()
            r1 = 1
            int r10 = r0.getIntExtra(r10, r1)
            android.content.Intent r0 = r19.getIntent()
            r1 = 60
            int r4 = r0.getIntExtra(r13, r1)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            java.lang.String r2 = r8.f22508n
            r3 = 5
            r5 = 0
            int r1 = r8.f22505h
            r11 = 16
            if (r1 != r11) goto L_0x0337
            r11 = 1
            goto L_0x0338
        L_0x0337:
            r11 = 0
        L_0x0338:
            r1 = r19
            r18 = r6
            r13 = 2131840029(0x7f114c1d, float:1.9313326E38)
            r6 = r10
            r10 = 2
            r7 = r11
            r0.mo8312MW(r1, r2, r3, r4, r5, r6, r7)
        L_0x0345:
            int r0 = r8.f22505h
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 == r1) goto L_0x0350
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 <= 0) goto L_0x0350
            goto L_0x035e
        L_0x0350:
            r2 = 16
            if (r0 == r2) goto L_0x035e
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x0359
            goto L_0x035e
        L_0x0359:
            if (r0 != r1) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r0 = 0
            goto L_0x035f
        L_0x035e:
            r0 = 1
        L_0x035f:
            if (r0 == 0) goto L_0x0362
            return
        L_0x0362:
            boolean r0 = r19.mo7083M7()
            if (r0 != 0) goto L_0x0377
            java.lang.String r0 = r8.getString(r13)
            r1 = 1
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            r8.f22513s = r1
            goto L_0x0378
        L_0x0377:
            r1 = 1
        L_0x0378:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            boolean r0 = r8.f22504g
            r5.putExtra(r14, r0)
            int r0 = r8.f22503f
            r5.putExtra(r12, r0)
            int r0 = r8.f22505h
            if (r0 == r1) goto L_0x0432
            if (r0 == r10) goto L_0x03b1
            r1 = 3
            if (r0 == r1) goto L_0x039f
            java.lang.String r0 = "unkown scene, ignore this request"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r0 = 0
            r8.setResult(r0)
            r19.finish()
            goto L_0x0448
        L_0x039f:
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 1
            int r3 = r8.f22506i
            int r4 = r8.f22502e
            r1 = r19
            r0.mo8311H7(r1, r2, r3, r4, r5)
            goto L_0x0448
        L_0x03b1:
            android.view.LayoutInflater.from(r19)
            qo3.n r0 = new qo3.n
            r1 = 1
            r2 = 0
            r0.<init>((android.content.Context) r8, (int) r1, (boolean) r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.plugin.webview.ui.tools.i r2 = new com.tencent.mm.plugin.webview.ui.tools.i
            r2.<init>(r8)
            com.tencent.mm.plugin.webview.ui.tools.j r3 = new com.tencent.mm.plugin.webview.ui.tools.j
            r3.<init>(r8)
            com.tencent.mm.plugin.webview.ui.tools.k r4 = new com.tencent.mm.plugin.webview.ui.tools.k
            r4.<init>(r8)
            r0.f225761d = r4
            com.tencent.mm.plugin.webview.ui.tools.l r5 = new com.tencent.mm.plugin.webview.ui.tools.l
            r5.<init>(r8)
            r0.f225802y = r5
            java.util.Iterator r5 = r1.iterator()
        L_0x03e1:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x03f5
            java.lang.Object r6 = r5.next()
            android.view.MenuItem r6 = (android.view.MenuItem) r6
            nj3.f0 r6 = (nj3.C76875f0) r6
            r6.f224728w = r7
            r6.f224729x = r7
            goto L_0x03e1
        L_0x03f5:
            r1.clear()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI r5 = r2.f22649d
            r6 = 2131840019(0x7f114c13, float:1.9313306E38)
            java.lang.String r5 = r5.getString(r6)
            nj3.f0 r6 = new nj3.f0
            r9 = 1
            r10 = 0
            r6.<init>(r8, r9, r10)
            r6.f224717i = r5
            r1.add(r6)
            int r1 = r1.size()
            if (r1 != 0) goto L_0x041a
            r10 = 1
            goto L_0x041b
        L_0x041a:
            r10 = 0
        L_0x041b:
            if (r10 == 0) goto L_0x0426
            java.lang.String r0 = "MicroMsg.MMSubMenuHelper"
            java.lang.String r1 = "show, menu empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0448
        L_0x0426:
            r0.f225771i = r2
            r0.f225782p = r3
            r0.f225761d = r4
            r0.f225725D = r7
            r0.mo107573q()
            goto L_0x0448
        L_0x0432:
            r0 = r18
            r1 = 0
            r5.putExtra(r0, r1)
            di3.d r0 = di3.C86312j.m106911c(r9)
            cw.g r0 = (p140cw.C7138g) r0
            r2 = 1
            int r3 = r8.f22501d
            int r4 = r8.f22502e
            r1 = r19
            r0.mo8311H7(r1, r2, r3, r4, r5)
        L_0x0448:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.OpenFileChooserUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.f22512r;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f22512r.dismiss();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr[0] == 0) {
                AppCompatActivity context = getContext();
                String K7 = mo7081K7();
                ((C7138g) C86312j.m106911c(C7138g.class)).Gl0(context, K7, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C6128c(), (DialogInterface.OnClickListener) null);
        }
    }
}
