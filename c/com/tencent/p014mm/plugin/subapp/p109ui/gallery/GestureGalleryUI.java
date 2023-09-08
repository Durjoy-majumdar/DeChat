package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import aw0.C103928o;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.CloseImagePreviewEvent;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.events.ReleaseDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FTSSeachSimilarImgActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.media.model.AppBrandMediaSource;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.p136ui.tools.PressAlphaImageView;
import com.tencent.p014mm.p136ui.widget.bottomsheet.ViewTitleWithAnimation;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.C42898a;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C42914t;
import com.tencent.p014mm.plugin.scanner.C94467l;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryTransAndOcrLogic;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.sendtowework.ImgData;
import com.tencent.p014mm.sendtowework.VideoData;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import ea3.C45601r;
import eb0.C45628s0;
import eb0.C86493v0;
import eb0.C97613b2;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import gc0.C20828a;
import ht1.C60200t1;
import i61.C98602h;
import j20.C117292a;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99252h;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import org.json.JSONArray;
import org.json.JSONObject;
import p1080f6.C97827a;
import p1193g6.C116921a;
import p140cw.C7138g;
import p159gw.C98250h;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46900z;
import p214om.C11502f;
import p215oo.C77032h;
import p248ug.C52570c0;
import p255vr.C65873e;
import p645pj.C77092c;
import p811d6.C116590f;
import p811d6.C97423c;
import p823sg.C48380r;
import p823sg.C90193h;
import p910lj.C76701a;
import p957e6.C86449e;
import p957e6.C86451f;
import p957e6.C86452g;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13604l;
import sn0.C90259e;
import tk2.C101904b;
import u73.C101980n;
import u73.C101983r;
import u73.C22613h1;
import uk2.C14201c;
import v13.C102121a;
import vl2.C111557w;
import vo3.C90852c;
import xl2.C102690c;
import xn2.C102693c;
import z51.C39315g;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI */
public class GestureGalleryUI extends MMActivity implements C97613b2.C97617c, C94533d.C94534a<String, C102690c>, GestureGalleryTransAndOcrLogic.C96469d, GestureGalleryTransAndOcrLogic.C96468c {

    /* renamed from: y1 */
    public static final /* synthetic */ int f282257y1 = 0;

    /* renamed from: A */
    public volatile String f282258A;

    /* renamed from: B */
    public int f282259B;

    /* renamed from: C */
    public final Set<Integer> f282260C = new HashSet();

    /* renamed from: D */
    public final Set<Integer> f282261D = new HashSet();

    /* renamed from: E */
    public final ConcurrentHashMap<String, Boolean> f282262E = new ConcurrentHashMap<>();

    /* renamed from: F */
    public final ConcurrentHashMap<String, Boolean> f282263F = new ConcurrentHashMap<>();

    /* renamed from: G */
    public final Set<String> f282264G = new HashSet();

    /* renamed from: H */
    public boolean f282265H = false;

    /* renamed from: I */
    public Bundle f282266I;

    /* renamed from: J */
    public boolean f282267J = false;

    /* renamed from: K */
    public C45059m0 f282268K;

    /* renamed from: L */
    public View f282269L;

    /* renamed from: M */
    public int f282270M = 0;

    /* renamed from: N */
    public int f282271N = 0;

    /* renamed from: P */
    public int f282272P = 0;

    /* renamed from: Q */
    public int f282273Q = 0;

    /* renamed from: Q0 */
    public RelativeLayout f282274Q0;

    /* renamed from: R */
    public ImageView f282275R;

    /* renamed from: R0 */
    public RedesignVideoPlayerSeekBar f282276R0;

    /* renamed from: S */
    public MMHandler f282277S = new MMHandler();

    /* renamed from: S0 */
    public long f282278S0 = 0;

    /* renamed from: T */
    public TextView f282279T;

    /* renamed from: T0 */
    public long f282280T0 = 0;

    /* renamed from: U */
    public C46900z f282281U;

    /* renamed from: U0 */
    public PlayerState f282282U0 = PlayerState.Idle;

    /* renamed from: V */
    public boolean f282283V = C30391y.f81992d;

    /* renamed from: V0 */
    public boolean f282284V0 = false;

    /* renamed from: W */
    public GestureGalleryTransAndOcrLogic f282285W;

    /* renamed from: W0 */
    public boolean f282286W0 = false;

    /* renamed from: X */
    public C45601r f282287X;

    /* renamed from: X0 */
    public boolean f282288X0 = false;

    /* renamed from: Y */
    public String f282289Y = "";

    /* renamed from: Y0 */
    public MultiCodeMaskView f282290Y0;

    /* renamed from: Z */
    public boolean f282291Z = false;

    /* renamed from: Z0 */
    public Long f282292Z0 = 0L;

    /* renamed from: a1 */
    public Long f282293a1 = 0L;

    /* renamed from: b1 */
    public Long f282294b1 = 0L;

    /* renamed from: c1 */
    public GestureDetector f282295c1;

    /* renamed from: d */
    public ImageAdapter f282296d;

    /* renamed from: d1 */
    public int f282297d1 = 1;

    /* renamed from: e */
    public MMGestureGallery f282298e;

    /* renamed from: e1 */
    public boolean f282299e1 = true;

    /* renamed from: f */
    public int f282300f;

    /* renamed from: f1 */
    public IListener<CloseImagePreviewEvent> f282301f1;

    /* renamed from: g */
    public String f282302g;

    /* renamed from: g1 */
    public List<String> f282303g1;

    /* renamed from: h */
    public C97613b2 f282304h;

    /* renamed from: h1 */
    public List<AppBrandMediaSource> f282305h1;

    /* renamed from: i */
    public boolean f282306i = false;

    /* renamed from: i1 */
    public int f282307i1;

    /* renamed from: j */
    public int f282308j = 0;

    /* renamed from: j1 */
    public int f282309j1;

    /* renamed from: k1 */
    public int f282310k1;

    /* renamed from: l1 */
    public String f282311l1;

    /* renamed from: m1 */
    public String f282312m1;

    /* renamed from: n */
    public boolean f282313n = false;

    /* renamed from: n1 */
    public boolean f282314n1;

    /* renamed from: o */
    public String f282315o = "";

    /* renamed from: o1 */
    public float f282316o1;

    /* renamed from: p */
    public String f282317p = null;

    /* renamed from: p0 */
    public ImageAdapter.ViewHolder f282318p0;

    /* renamed from: p1 */
    public int f282319p1;

    /* renamed from: q */
    public boolean f282320q = false;

    /* renamed from: q1 */
    public int f282321q1;

    /* renamed from: r */
    public boolean f282322r = false;

    /* renamed from: r1 */
    public boolean f282323r1;

    /* renamed from: s */
    public boolean f282324s = true;

    /* renamed from: s1 */
    public AdapterView.OnItemSelectedListener f282325s1;

    /* renamed from: t */
    public JSONArray f282326t = null;

    /* renamed from: t1 */
    public IListener f282327t1;

    /* renamed from: u */
    public int f282328u;

    /* renamed from: u1 */
    public IListener f282329u1;

    /* renamed from: v */
    public long f282330v;

    /* renamed from: v1 */
    public View f282331v1;

    /* renamed from: w */
    public C77407n f282332w;

    /* renamed from: w1 */
    public PlayProgressTask f282333w1;

    /* renamed from: x */
    public volatile boolean f282334x;

    /* renamed from: x0 */
    public boolean f282335x0 = false;

    /* renamed from: x1 */
    public C101904b f282336x1;

    /* renamed from: y */
    public ArrayList<ImageQBarDataBean> f282337y = new ArrayList<>();

    /* renamed from: y0 */
    public RelativeLayout f282338y0;

    /* renamed from: z */
    public ImageQBarDataBean f282339z = null;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter */
    public class ImageAdapter extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$ViewHolder */
        public class ViewHolder {

            /* renamed from: a */
            public ProgressBar f282388a;

            /* renamed from: b */
            public MMAnimateView f282389b;

            /* renamed from: c */
            public ImageView f282390c;

            /* renamed from: d */
            public View f282391d;

            /* renamed from: e */
            public VideoView f282392e;

            /* renamed from: f */
            public ImageView f282393f;

            /* renamed from: g */
            public View f282394g;

            /* renamed from: h */
            public TextView f282395h;

            /* renamed from: i */
            public MultiTouchImageView f282396i;

            /* renamed from: j */
            public WxImageView f282397j;

            public ViewHolder(ImageAdapter imageAdapter) {
            }
        }

        public ImageAdapter(Context context) {
        }

        /* renamed from: a */
        public Bitmap mo134494a(String str) {
            if (str == null) {
                return null;
            }
            Log.m105924i("MicroMsg.GestureGalleryUI", str);
            C20828a b = C20828a.m22825b();
            Bitmap e = b.mo32516e(str + "_" + C86013q1.m106451l(str));
            if (e != null && !e.isRecycled()) {
                return e;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z = true;
            options.inJustDecodeBounds = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            Log.m105924i("MicroMsg.GestureGalleryUI", String.valueOf(options.outWidth) + ", " + String.valueOf(options.outHeight));
            if (decodeFile != null) {
                Log.m105925i("MicroMsg.GestureGalleryUI", "recycle bitmap:%s", decodeFile.toString());
                decodeFile.recycle();
            }
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str);
            if (bitmapNative == null && MMNativeJpeg.IsJpegFile(str) && MMNativeJpeg.isProgressive(str)) {
                bitmapNative = MMNativeJpeg.decodeAsBitmap(str);
                Object[] objArr = new Object[1];
                if (bitmapNative != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.GestureGalleryUI", "Progressive jpeg, result isNull:%b", objArr);
            }
            if (bitmapNative == null) {
                Log.m105920e("MicroMsg.GestureGalleryUI", "getSuitableBmp fail, temBmp is null, filePath = " + str);
                return null;
            }
            C20828a b2 = C20828a.m22825b();
            b2.mo32526o(str + "_" + C86013q1.m106451l(str), bitmapNative);
            return bitmapNative;
        }

        /* renamed from: b */
        public View mo134495b() {
            MMGestureGallery mMGestureGallery = GestureGalleryUI.this.f282298e;
            if (mMGestureGallery != null) {
                return mMGestureGallery.getSelectedView();
            }
            return null;
        }

        /* renamed from: d */
        public void mo134496d(MultiTouchImageView multiTouchImageView, Bitmap bitmap, boolean z) {
            if (bitmap != null) {
                if (z) {
                    multiTouchImageView.setEnabled(false);
                } else {
                    multiTouchImageView.setEnabled(true);
                }
                ForceGpuUtil.decideLayerType(multiTouchImageView, bitmap.getWidth(), bitmap.getHeight());
                multiTouchImageView.setEnableHorLongBmpMode(false);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
                multiTouchImageView.setImageBitmap(bitmap);
                multiTouchImageView.setVisibility(0);
            }
        }

        /* renamed from: f */
        public void mo134497f(WxImageView wxImageView, String str) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap d = MMBitmapFactory.m98735d(str, options);
            if (d != null) {
                d.recycle();
            }
            wxImageView.setVisibility(0);
            wxImageView.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                    GestureGalleryUI.this.mo134460Y7();
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            });
            wxImageView.setOrientation(BackwardSupportUtil.ExifHelper.getExifOrientation(str));
            int i = options.outWidth;
            int i2 = options.outHeight;
            wxImageView.f48889h = i;
            wxImageView.f48890i = i2;
            wxImageView.mo26059d();
            wxImageView.mo21400p(str, (ImageSource) null);
        }

        public int getCount() {
            Log.m105918d("MicroMsg.GestureGalleryUI", "lstpicurl:" + GestureGalleryUI.this.f282303g1.size());
            return GestureGalleryUI.this.f282303g1.size();
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:88:0x031e, code lost:
            if (r8 != false) goto L_0x0322;
         */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x03fd  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0228  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0270 A[SYNTHETIC, Splitter:B:47:0x0270] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27) {
            /*
                r24 = this;
                r1 = r24
                r0 = r25
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.util.List<com.tencent.mm.media.model.AppBrandMediaSource> r2 = r2.f282305h1
                r3 = 0
                if (r2 == 0) goto L_0x002c
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x002c
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.util.List<com.tencent.mm.media.model.AppBrandMediaSource> r2 = r2.f282305h1
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r2 = r2.size()
                if (r2 <= r0) goto L_0x002c
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.util.List<com.tencent.mm.media.model.AppBrandMediaSource> r2 = r2.f282305h1
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.lang.Object r2 = r2.get(r0)
                com.tencent.mm.media.model.AppBrandMediaSource r2 = (com.tencent.p014mm.media.model.AppBrandMediaSource) r2
                goto L_0x002d
            L_0x002c:
                r2 = r3
            L_0x002d:
                r5 = 0
                if (r2 == 0) goto L_0x003a
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r6 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                boolean r6 = r6.mo134463b8(r0)
                if (r6 == 0) goto L_0x003a
                r6 = 1
                goto L_0x003b
            L_0x003a:
                r6 = 0
            L_0x003b:
                if (r26 == 0) goto L_0x0044
                java.lang.Object r7 = r26.getTag()
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$ViewHolder r7 = (com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder) r7
                goto L_0x0045
            L_0x0044:
                r7 = r3
            L_0x0045:
                r8 = 8
                if (r26 == 0) goto L_0x0056
                if (r6 == 0) goto L_0x0052
                if (r7 == 0) goto L_0x0052
                android.widget.VideoView r9 = r7.f282392e
                if (r9 != 0) goto L_0x0052
                goto L_0x0056
            L_0x0052:
                r9 = r26
                goto L_0x00eb
            L_0x0056:
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$ViewHolder r7 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$ViewHolder
                r7.<init>(r1)
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r9 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                r10 = 2131497077(0x7f0c1075, float:1.8617737E38)
                android.view.View r9 = android.view.View.inflate(r9, r10, r3)
                r10 = 2131311522(0x7f093ba2, float:1.8241387E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                r7.f282388a = r10
                r10 = 2131306251(0x7f09270b, float:1.8230696E38)
                android.view.View r10 = r9.findViewById(r10)
                com.tencent.mm.plugin.gif.MMAnimateView r10 = (com.tencent.p014mm.plugin.gif.MMAnimateView) r10
                r7.f282389b = r10
                r10 = 2131315195(0x7f0949fb, float:1.8248836E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                r7.f282390c = r10
                r10 = 2131316143(0x7f094daf, float:1.825076E38)
                android.view.View r10 = r9.findViewById(r10)
                r7.f282391d = r10
                r10 = 2131316244(0x7f094e14, float:1.8250964E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.VideoView r10 = (android.widget.VideoView) r10
                r7.f282392e = r10
                r10 = 2131316247(0x7f094e17, float:1.825097E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                r7.f282393f = r10
                r10 = 2131316169(0x7f094dc9, float:1.8250812E38)
                android.view.View r10 = r9.findViewById(r10)
                r7.f282394g = r10
                r10 = 2131316170(0x7f094dca, float:1.8250814E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r7.f282395h = r10
                r10 = 2131309639(0x7f093447, float:1.8237567E38)
                android.view.View r10 = r9.findViewById(r10)
                com.tencent.mm.ui.base.MultiTouchImageView r10 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r10
                r7.f282396i = r10
                r10 = 2131317277(0x7f09521d, float:1.825306E38)
                android.view.View r10 = r9.findViewById(r10)
                com.tencent.mm.ui.base.WxImageView r10 = (com.tencent.p014mm.p136ui.base.WxImageView) r10
                r7.f282397j = r10
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$2 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$2
                r11.<init>(r1, r7)
                r10.setOnImageLoadEventListener(r11)
                if (r6 == 0) goto L_0x00e8
                android.widget.ImageView r10 = r7.f282390c
                r10.setVisibility(r8)
                r10 = 2131316178(0x7f094dd2, float:1.825083E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                r7.f282390c = r10
            L_0x00e8:
                r9.setTag(r7)
            L_0x00eb:
                android.widget.Gallery$LayoutParams r10 = new android.widget.Gallery$LayoutParams
                r11 = -1
                r10.<init>(r11, r11)
                r9.setLayoutParams(r10)
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r10 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.util.List<java.lang.String> r10 = r10.f282303g1
                java.lang.Object r10 = r10.get(r0)
                java.lang.String r10 = (java.lang.String) r10
                if (r6 == 0) goto L_0x0103
                java.lang.String r10 = r2.f237883f
                r6 = 1
            L_0x0103:
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
                if (r2 == 0) goto L_0x010a
                goto L_0x0132
            L_0x010a:
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                eb0.b2 r12 = r2.f282304h
                int r13 = r2.f282307i1
                java.lang.String r2 = r2.f282317p
                java.lang.String r10 = r12.mo136884b(r10, r13, r0, r2)
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                int r2 = r2.f282310k1
                if (r0 != r2) goto L_0x0132
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r2 == 0) goto L_0x0132
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.lang.String r2 = r2.f282311l1
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                if (r2 == 0) goto L_0x0132
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                java.lang.String r10 = r2.f282311l1
                r2 = 1
                goto L_0x0133
            L_0x0132:
                r2 = 0
            L_0x0133:
                android.widget.VideoView r12 = r7.f282392e
                r12.setVisibility(r8)
                android.widget.VideoView r12 = r7.f282392e
                r12.stopPlayback()
                java.lang.String r12 = "MicroMsg.GestureGalleryUI"
                if (r6 == 0) goto L_0x0228
                android.view.View r15 = r7.f282391d
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r14.mo10233c(r13)
                java.lang.Object[] r16 = r14.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r13 = r15
                r3 = r14
                r14 = r16
                r4 = r15
                r15 = r17
                r16 = r18
                r17 = r19
                r18 = r20
                r19 = r21
                r20 = r22
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r4.setVisibility(r3)
                java.lang.String r14 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r13 = r4
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                r3.getClass()
                java.lang.String r4 = "fillVideoView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                android.widget.ImageView r4 = r7.f282393f
                r4.setVisibility(r5)
                android.widget.ProgressBar r4 = r7.f282388a
                r4.setVisibility(r8)
                android.view.View r4 = r7.f282394g
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
                r15.mo10233c(r13)
                java.lang.Object[] r14 = r15.mo10232b()
                java.lang.String r16 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI"
                java.lang.String r17 = "fillVideoView"
                java.lang.String r18 = "(Lcom/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$ViewHolder;Lcom/tencent/mm/media/model/AppBrandMediaSource;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                r13 = r4
                r11 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r19 = r20
                r20 = r21
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r11 = r11.mo10231a(r5)
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r4.setVisibility(r11)
                java.lang.String r14 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI"
                java.lang.String r15 = "fillVideoView"
                java.lang.String r16 = "(Lcom/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$ViewHolder;Lcom/tencent/mm/media/model/AppBrandMediaSource;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                android.widget.ImageView r4 = r7.f282393f
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$35 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$35
                r11.<init>()
                r4.setOnClickListener(r11)
                android.widget.VideoView r4 = r7.f282392e
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$36 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$36
                r11.<init>()
                r4.setOnPreparedListener(r11)
                android.widget.VideoView r4 = r7.f282392e
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$37 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$37
                r11.<init>()
                r4.setOnErrorListener(r11)
                android.widget.VideoView r4 = r7.f282392e
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$38 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$38
                r11.<init>()
                r4.setOnCompletionListener(r11)
                android.widget.VideoView r4 = r7.f282392e
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$39 r11 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$39
                r11.<init>()
                r4.setOnInfoListener(r11)
                goto L_0x026a
            L_0x0228:
                android.view.View r3 = r7.f282391d
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                r4.mo10233c(r11)
                java.lang.Object[] r14 = r4.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r3
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r14 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            L_0x026a:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r3 != 0) goto L_0x03fd
                android.widget.ProgressBar r3 = r7.f282388a     // Catch:{ Exception -> 0x03f6 }
                r3.setVisibility(r8)     // Catch:{ Exception -> 0x03f6 }
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                r3.getClass()     // Catch:{ Exception -> 0x03f6 }
                boolean r3 = pr3.C89436a.m111811c(r10)     // Catch:{ Exception -> 0x03f6 }
                if (r3 != 0) goto L_0x02ad
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                java.util.List<com.tencent.mm.media.model.AppBrandMediaSource> r3 = r3.f282305h1     // Catch:{ Exception -> 0x03f6 }
                if (r3 == 0) goto L_0x02a7
                java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x03f6 }
                boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x03f6 }
                if (r3 != 0) goto L_0x02a7
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                java.util.List<com.tencent.mm.media.model.AppBrandMediaSource> r3 = r3.f282305h1     // Catch:{ Exception -> 0x03f6 }
                java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x03f6 }
                java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x03f6 }
                com.tencent.mm.media.model.AppBrandMediaSource r3 = (com.tencent.p014mm.media.model.AppBrandMediaSource) r3     // Catch:{ Exception -> 0x03f6 }
                java.lang.String r3 = r3.f237883f     // Catch:{ Exception -> 0x03f6 }
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x03f6 }
                if (r3 != 0) goto L_0x02a7
                android.graphics.Bitmap r3 = r1.mo134494a(r10)     // Catch:{ Exception -> 0x03f6 }
                goto L_0x02ab
            L_0x02a7:
                android.graphics.Bitmap r3 = r1.mo134494a(r10)     // Catch:{ Exception -> 0x03f6 }
            L_0x02ab:
                r4 = 0
                goto L_0x02af
            L_0x02ad:
                r3 = 0
                r4 = 1
            L_0x02af:
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r11 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                boolean r11 = r11.f282313n     // Catch:{ Exception -> 0x03f6 }
                if (r11 == 0) goto L_0x02c5
                if (r3 == 0) goto L_0x02bd
                boolean r11 = r3.isRecycled()     // Catch:{ Exception -> 0x03f6 }
                if (r11 == 0) goto L_0x02c5
            L_0x02bd:
                if (r4 != 0) goto L_0x02c5
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                r0.finish()     // Catch:{ Exception -> 0x03f6 }
                return r9
            L_0x02c5:
                if (r3 == 0) goto L_0x02dd
                boolean r11 = r3.isRecycled()     // Catch:{ Exception -> 0x03f6 }
                if (r11 != 0) goto L_0x02dd
                int r11 = r3.getWidth()     // Catch:{ Exception -> 0x03f6 }
                r13 = 1024(0x400, float:1.435E-42)
                if (r11 > r13) goto L_0x02db
                int r11 = r3.getHeight()     // Catch:{ Exception -> 0x03f6 }
                if (r11 <= r13) goto L_0x02dd
            L_0x02db:
                r11 = 1
                goto L_0x02de
            L_0x02dd:
                r11 = 0
            L_0x02de:
                if (r11 == 0) goto L_0x0321
                if (r3 != 0) goto L_0x02e4
            L_0x02e2:
                r15 = r9
                goto L_0x031d
            L_0x02e4:
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r11 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()     // Catch:{ Exception -> 0x03f6 }
                android.graphics.Point r11 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r11)     // Catch:{ Exception -> 0x03f6 }
                int r11 = r11.x     // Catch:{ Exception -> 0x03f6 }
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r13 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                androidx.appcompat.app.AppCompatActivity r13 = r13.getContext()     // Catch:{ Exception -> 0x03f6 }
                android.graphics.Point r13 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r13)     // Catch:{ Exception -> 0x03f6 }
                int r13 = r13.y     // Catch:{ Exception -> 0x03f6 }
                int r11 = r11 * r13
                int r13 = r3.getWidth()     // Catch:{ Exception -> 0x03f6 }
                int r14 = r3.getHeight()     // Catch:{ Exception -> 0x03f6 }
                int r13 = r13 * r14
                long r13 = (long) r13     // Catch:{ Exception -> 0x03f6 }
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r15 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f6 }
                boolean r15 = r15.f282320q     // Catch:{ Exception -> 0x03f6 }
                if (r15 == 0) goto L_0x02e2
                boolean r15 = r3.isRecycled()     // Catch:{ Exception -> 0x03f6 }
                if (r15 != 0) goto L_0x02e2
                r15 = r9
                long r8 = (long) r11
                int r11 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r11 >= 0) goto L_0x031d
                r8 = 1
                goto L_0x031e
            L_0x031d:
                r8 = 0
            L_0x031e:
                if (r8 == 0) goto L_0x0371
                goto L_0x0322
            L_0x0321:
                r15 = r9
            L_0x0322:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r10)     // Catch:{ Exception -> 0x03f7 }
                if (r8 == 0) goto L_0x0371
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f7 }
                int r4 = r2.f282310k1     // Catch:{ Exception -> 0x03f7 }
                if (r0 != r4) goto L_0x0330
                r2.f282265H = r5     // Catch:{ Exception -> 0x03f7 }
            L_0x0330:
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x0356 }
                android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x0356 }
                r4 = -1
                r2.<init>(r4, r4)     // Catch:{ Exception -> 0x0356 }
                r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x0356 }
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x0356 }
                r2 = 8
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x0356 }
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x0356 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x0356 }
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x0356 }
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x0356 }
                boolean r2 = r2.f282320q     // Catch:{ Exception -> 0x0356 }
                r0.f271889j = r2     // Catch:{ Exception -> 0x0356 }
                r2 = 0
                r4 = 1
                r0.mo129234u(r10, r4, r2)     // Catch:{ Exception -> 0x0356 }
                goto L_0x0450
            L_0x0356:
                r0 = move-exception
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x03f7 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x03f7 }
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x03f7 }
                r2 = 8
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x03f7 }
                r0.setImageBitmap(r3)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x0371:
                if (r2 == 0) goto L_0x0388
                if (r3 == 0) goto L_0x0388
                boolean r2 = r3.isRecycled()     // Catch:{ Exception -> 0x03f7 }
                if (r2 != 0) goto L_0x0388
                android.widget.ProgressBar r0 = r7.f282388a     // Catch:{ Exception -> 0x03f7 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r7.f282396i     // Catch:{ Exception -> 0x03f7 }
                r2 = 1
                r1.mo134496d(r0, r3, r2)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x0388:
                if (r6 == 0) goto L_0x03b0
                if (r3 == 0) goto L_0x03b0
                boolean r2 = r3.isRecycled()     // Catch:{ Exception -> 0x03f7 }
                if (r2 != 0) goto L_0x03b0
                android.widget.ProgressBar r0 = r7.f282388a     // Catch:{ Exception -> 0x03f7 }
                r2 = 8
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x03f7 }
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x03f7 }
                r0.setVisibility(r5)     // Catch:{ Exception -> 0x03f7 }
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x03f7 }
                android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03f7 }
                r4 = -1
                r2.<init>(r4, r4)     // Catch:{ Exception -> 0x03f7 }
                r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x03f7 }
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x03f7 }
                r0.setImageBitmap(r3)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x03b0:
                if (r3 == 0) goto L_0x03cb
                boolean r2 = r3.isRecycled()     // Catch:{ Exception -> 0x03f7 }
                if (r2 != 0) goto L_0x03cb
                android.widget.ImageView r0 = r7.f282390c     // Catch:{ Exception -> 0x03f7 }
                r2 = 8
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b     // Catch:{ Exception -> 0x03f7 }
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r7.f282396i     // Catch:{ Exception -> 0x03f7 }
                r1.mo134496d(r0, r3, r5)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x03cb:
                if (r4 == 0) goto L_0x03ef
                com.tencent.mm.ui.base.WxImageView r2 = r7.f282397j     // Catch:{ Exception -> 0x03f7 }
                int r2 = r2.getVisibility()     // Catch:{ Exception -> 0x03f7 }
                r3 = 8
                if (r2 != r3) goto L_0x0450
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r2 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this     // Catch:{ Exception -> 0x03f7 }
                int r3 = r2.f282310k1     // Catch:{ Exception -> 0x03f7 }
                if (r0 != r3) goto L_0x03e9
                java.lang.String r0 = r2.f282311l1     // Catch:{ Exception -> 0x03f7 }
                android.graphics.Bitmap r0 = r1.mo134494a(r0)     // Catch:{ Exception -> 0x03f7 }
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r7.f282396i     // Catch:{ Exception -> 0x03f7 }
                r3 = 1
                r1.mo134496d(r2, r0, r3)     // Catch:{ Exception -> 0x03f7 }
            L_0x03e9:
                com.tencent.mm.ui.base.WxImageView r0 = r7.f282397j     // Catch:{ Exception -> 0x03f7 }
                r1.mo134497f(r0, r10)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x03ef:
                java.lang.String r0 = "load image failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x03f7 }
                goto L_0x0450
            L_0x03f6:
                r15 = r9
            L_0x03f7:
                java.lang.String r0 = "Catch Exception"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                goto L_0x0450
            L_0x03fd:
                r15 = r9
                android.widget.ProgressBar r0 = r7.f282388a
                r0.setVisibility(r5)
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r7.f282389b
                r2 = 8
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r7.f282390c
                r0.setVisibility(r2)
                android.view.View r8 = r7.f282391d
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.mo10233c(r2)
                java.lang.Object[] r17 = r0.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r8
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r0 = r0.mo10231a(r5)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r8.setVisibility(r0)
                java.lang.String r9 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x0450:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.ImageAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$PlayProgressTask */
    public class PlayProgressTask implements Runnable {

        /* renamed from: d */
        public boolean f282398d = true;

        public PlayProgressTask(C964701 r2) {
        }

        public void run() {
            Log.m105924i("MicroMsg.GestureGalleryUI", "start run play progress task");
            while (!this.f282398d) {
                try {
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    PlayerState playerState = gestureGalleryUI.f282282U0;
                    if ((playerState == PlayerState.Start || playerState == PlayerState.Prepared || playerState == PlayerState.Resume) && gestureGalleryUI.f282318p0 != null) {
                        gestureGalleryUI.f282276R0.post(new Runnable() {
                            public void run() {
                                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                gestureGalleryUI.f282276R0.seek(gestureGalleryUI.f282318p0.f282392e.getCurrentPosition() / 1000);
                            }
                        });
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GestureGalleryUI", "PlayProgressTask run exception:" + e.getMessage());
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$PlayerState */
    public enum PlayerState {
        Idle,
        Prepared,
        Start,
        Resume,
        Paused,
        Complete,
        Stop,
        Error
    }

    public GestureGalleryUI() {
        C40008f fVar = C40008f.f107254d;
        this.f282301f1 = new IListener<CloseImagePreviewEvent>(fVar) {
            {
                this.__eventId = 105104325;
            }

            public boolean callback(IEvent iEvent) {
                CloseImagePreviewEvent closeImagePreviewEvent = (CloseImagePreviewEvent) iEvent;
                GestureGalleryUI.this.finish();
                return false;
            }
        };
        this.f282303g1 = new ArrayList();
        this.f282305h1 = new ArrayList();
        this.f282307i1 = 0;
        this.f282309j1 = -1;
        this.f282310k1 = -1;
        this.f282311l1 = null;
        this.f282312m1 = null;
        this.f282314n1 = false;
        this.f282316o1 = 1.0f;
        this.f282319p1 = 0;
        this.f282321q1 = 0;
        this.f282323r1 = false;
        this.f282325s1 = new AdapterView.OnItemSelectedListener() {

            /* renamed from: d */
            public VideoView f282360d;

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0234, code lost:
                r4 = r4.length();
                r5 = r6.f282361e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(android.widget.AdapterView<?> r25, android.view.View r26, int r27, long r28) {
                /*
                    r24 = this;
                    r6 = r24
                    r7 = r26
                    r8 = r27
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r1 = r25
                    r0.add(r1)
                    r0.add(r7)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                    r0.add(r1)
                    java.lang.Long r1 = java.lang.Long.valueOf(r28)
                    r0.add(r1)
                    java.lang.Object[] r5 = r0.toArray()
                    r0.clear()
                    java.lang.String r0 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r1 = "android/widget/AdapterView$OnItemSelectedListener"
                    java.lang.String r2 = "onItemSelected"
                    java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    r4 = r24
                    j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "onItemSelected  pos:"
                    r0.append(r1)
                    r0.append(r8)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "MicroMsg.GestureGalleryUI"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r0.f282309j1 = r8
                    android.widget.TextView r0 = r0.f282279T
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    int r3 = r3.f282309j1
                    r4 = 1
                    int r3 = r3 + r4
                    r2.append(r3)
                    java.lang.String r3 = "/"
                    r2.append(r3)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter r3 = r3.f282296d
                    int r3 = r3.getCount()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r0.setText(r2)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = ""
                    r2.append(r3)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r5 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    int r5 = r5.f282309j1
                    int r5 = r5 + r4
                    r2.append(r5)
                    java.lang.String r5 = " / "
                    r2.append(r5)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r5 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.util.List<java.lang.String> r5 = r5.f282303g1
                    int r5 = r5.size()
                    r2.append(r5)
                    java.lang.String r2 = r2.toString()
                    r0.setMMTitle((java.lang.String) r2)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "pos:"
                    r0.append(r2)
                    r0.append(r8)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.util.List<java.lang.String> r2 = r0.f282303g1
                    java.lang.Object r2 = r2.get(r8)
                    java.lang.String r2 = (java.lang.String) r2
                    r0.f282289Y = r2
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r0.f282302g = r3
                    r2 = 0
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r0.f282335x0 = r2
                    android.widget.VideoView r0 = r6.f282360d
                    if (r0 == 0) goto L_0x00d9
                    r0.stopPlayback()
                    r0 = 0
                    r6.f282360d = r0
                L_0x00d9:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r0 = r0.f282276R0
                    r0.setIsPlay(r2)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$PlayerState r5 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.PlayerState.Idle
                    r0.f282282U0 = r5
                    r0 = 8
                    if (r7 == 0) goto L_0x01e3
                    java.lang.Object r5 = r26.getTag()
                    if (r5 == 0) goto L_0x01e3
                    java.lang.Object r5 = r26.getTag()
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$ImageAdapter$ViewHolder r5 = (com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder) r5
                    if (r5 == 0) goto L_0x019a
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    boolean r7 = r7.mo134463b8(r8)
                    if (r7 == 0) goto L_0x019a
                    android.widget.VideoView r7 = r5.f282392e
                    r6.f282360d = r7
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r7.f282318p0 = r5
                    android.view.View r7 = r5.f282391d
                    k20.a r15 = new k20.a
                    r15.<init>()
                    java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                    r15.mo10233c(r3)
                    java.lang.Object[] r10 = r15.mo10232b()
                    java.lang.String r11 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r12 = "onItemSelected"
                    java.lang.String r13 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r14 = "android/view/View_EXEC_"
                    java.lang.String r16 = "setVisibility"
                    java.lang.String r17 = "(I)V"
                    r9 = r7
                    r4 = r15
                    r15 = r16
                    r16 = r17
                    j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Object r4 = r4.mo10231a(r2)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r7.setVisibility(r4)
                    java.lang.String r10 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r11 = "onItemSelected"
                    java.lang.String r12 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setVisibility"
                    java.lang.String r15 = "(I)V"
                    j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                    android.widget.ImageView r4 = r5.f282393f
                    r4.setVisibility(r2)
                    android.widget.ProgressBar r4 = r5.f282388a
                    r4.setVisibility(r0)
                    android.view.View r4 = r5.f282394g
                    k20.a r5 = new k20.a
                    r5.<init>()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                    r5.mo10233c(r7)
                    java.lang.Object[] r10 = r5.mo10232b()
                    java.lang.String r11 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r12 = "onItemSelected"
                    java.lang.String r13 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r14 = "android/view/View_EXEC_"
                    java.lang.String r15 = "setVisibility"
                    java.lang.String r16 = "(I)V"
                    r9 = r4
                    j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Object r5 = r5.mo10231a(r2)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    int r5 = r5.intValue()
                    r4.setVisibility(r5)
                    java.lang.String r10 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r11 = "onItemSelected"
                    java.lang.String r12 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setVisibility"
                    java.lang.String r15 = "(I)V"
                    j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                    goto L_0x01e3
                L_0x019a:
                    if (r5 == 0) goto L_0x01e3
                    android.view.View r4 = r5.f282391d
                    if (r4 == 0) goto L_0x01e3
                    k20.a r5 = new k20.a
                    r5.<init>()
                    java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                    r5.mo10233c(r7)
                    java.lang.Object[] r17 = r5.mo10232b()
                    java.lang.String r18 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r19 = "onItemSelected"
                    java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r21 = "android/view/View_EXEC_"
                    java.lang.String r22 = "setVisibility"
                    java.lang.String r23 = "(I)V"
                    r16 = r4
                    j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                    java.lang.Object r5 = r5.mo10231a(r2)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    int r5 = r5.intValue()
                    r4.setVisibility(r5)
                    java.lang.String r17 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r18 = "onItemSelected"
                    java.lang.String r19 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r20 = "android/view/View_EXEC_"
                    java.lang.String r21 = "setVisibility"
                    java.lang.String r22 = "(I)V"
                    j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                L_0x01e3:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    boolean r4 = r4.mo134463b8(r8)
                    if (r4 == 0) goto L_0x01fa
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.lang.String r4 = r3.mo134458W7()
                    r3.f282302g = r4
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r3.f282300f = r8
                L_0x01f7:
                    r3 = 1
                    goto L_0x02d9
                L_0x01fa:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    eb0.b2 r5 = r4.f282304h
                    java.util.List<java.lang.String> r7 = r4.f282303g1
                    java.lang.Object r7 = r7.get(r8)
                    java.lang.String r7 = (java.lang.String) r7
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r9 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    int r10 = r9.f282307i1
                    java.lang.String r9 = r9.f282317p
                    java.lang.String r5 = r5.mo136884b(r7, r10, r8, r9)
                    r4.f282302g = r5
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.lang.String r4 = r4.f282302g
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    if (r4 == 0) goto L_0x0228
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.util.List<java.lang.String> r5 = r4.f282303g1
                    java.lang.Object r5 = r5.get(r8)
                    java.lang.String r5 = (java.lang.String) r5
                    r4.f282302g = r5
                L_0x0228:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r4.f282300f = r8
                    android.view.View r5 = r4.f282331v1
                    if (r5 == 0) goto L_0x01f7
                    org.json.JSONArray r4 = r4.f282326t
                    if (r4 == 0) goto L_0x01f7
                    int r4 = r4.length()
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r5 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    int r7 = r5.f282300f
                    if (r4 <= r7) goto L_0x01f7
                    org.json.JSONArray r4 = r5.f282326t
                    org.json.JSONObject r4 = r4.optJSONObject(r7)
                    java.lang.String r5 = "jumpType"
                    boolean r4 = r4.has(r5)
                    if (r4 == 0) goto L_0x0291
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    android.view.View r4 = r4.f282331v1
                    k20.a r5 = new k20.a
                    r5.<init>()
                    java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                    r5.mo10233c(r3)
                    java.lang.Object[] r8 = r5.mo10232b()
                    java.lang.String r9 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r10 = "onItemSelected"
                    java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setVisibility"
                    java.lang.String r14 = "(I)V"
                    r7 = r4
                    j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r3 = r5.mo10231a(r2)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r4.setVisibility(r3)
                    java.lang.String r8 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r9 = "onItemSelected"
                    java.lang.String r10 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r11 = "android/view/View_EXEC_"
                    java.lang.String r12 = "setVisibility"
                    java.lang.String r13 = "(I)V"
                    j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                    goto L_0x01f7
                L_0x0291:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    android.view.View r3 = r3.f282331v1
                    k20.a r4 = new k20.a
                    r4.<init>()
                    java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                    r4.mo10233c(r5)
                    java.lang.Object[] r8 = r4.mo10232b()
                    java.lang.String r9 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r10 = "onItemSelected"
                    java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setVisibility"
                    java.lang.String r14 = "(I)V"
                    r7 = r3
                    j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r4 = r4.mo10231a(r2)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r3.setVisibility(r4)
                    java.lang.String r8 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r9 = "onItemSelected"
                    java.lang.String r10 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    java.lang.String r11 = "android/view/View_EXEC_"
                    java.lang.String r12 = "setVisibility"
                    java.lang.String r13 = "(I)V"
                    j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                    goto L_0x01f7
                L_0x02d9:
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    java.lang.String r3 = r3.f282302g
                    r4[r2] = r3
                    java.lang.String r3 = "curFilename:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    boolean r4 = r3.f282265H
                    if (r4 != 0) goto L_0x02ed
                    goto L_0x02f7
                L_0x02ed:
                    com.tencent.mm.ui.tools.MMGestureGallery r4 = r3.f282298e
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$11 r5 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$11
                    r5.<init>()
                    r4.setGalleryScaleListener(r5)
                L_0x02f7:
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r3 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    android.widget.RelativeLayout r3 = r3.f282274Q0
                    r3.setVisibility(r0)
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    r0.mo134456U7()
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                    int r3 = r0.f282300f
                    boolean r4 = r0.f282314n1
                    if (r4 == 0) goto L_0x0332
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    r4[r2] = r5
                    int r2 = r0.f282308j
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r5 = 1
                    r4[r5] = r2
                    java.lang.String r2 = "dispatchImageChangedEvent pos: %s, webViewId: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r4)
                    com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent r1 = new com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent
                    r1.<init>()
                    com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent$a r2 = r1.f107834d
                    r2.f107836b = r3
                    int r0 = r0.f282308j
                    r2.f107835a = r0
                    r1.publish()
                L_0x0332:
                    java.lang.String r0 = "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$26"
                    java.lang.String r1 = "android/widget/AdapterView$OnItemSelectedListener"
                    java.lang.String r2 = "onItemSelected"
                    java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                    j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.C9648826.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f282327t1 = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                if (recogQBarOfImageFileResultEvent == null) {
                    Log.m105920e("MicroMsg.GestureGalleryUI", "RecogQBarOfImageFileResultEvent is null.");
                } else if (!recogQBarOfImageFileResultEvent.f265015d.f265016a.equals(GestureGalleryUI.this.f282258A)) {
                    Log.m105920e("MicroMsg.GestureGalleryUI", "not same filepath");
                } else {
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    int i = GestureGalleryUI.f282257y1;
                    gestureGalleryUI.getClass();
                    ArrayList<ImageQBarDataBean> a = C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent);
                    if (gestureGalleryUI.f282286W0 || gestureGalleryUI.f282320q) {
                        ArrayList<ImageQBarDataBean> arrayList = new ArrayList<>();
                        boolean eQ = ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(gestureGalleryUI.f282312m1);
                        Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
                        Iterator<ImageQBarDataBean> it = a.iterator();
                        while (it.hasNext()) {
                            ImageQBarDataBean next = it.next();
                            if (C42914t.m46582c(next.f273114e, next.f273113d, eQ, gestureGalleryUI.f282322r)) {
                                arrayList.add(next);
                                gestureGalleryUI.mo134466e8(true, next.f273114e, next.f273113d, false, bundleExtra);
                            } else {
                                gestureGalleryUI.mo134466e8(false, next.f273114e, next.f273113d, false, bundleExtra);
                            }
                        }
                        a = arrayList;
                    }
                    gestureGalleryUI.f282337y = a;
                    Log.m105924i("MicroMsg.GestureGalleryUI", "recog result size: " + GestureGalleryUI.this.f282337y.size());
                    GestureGalleryUI.this.f282292Z0 = Long.valueOf(System.currentTimeMillis());
                    GestureGalleryUI.this.f282293a1 = Long.valueOf(System.currentTimeMillis() - GestureGalleryUI.this.f282294b1.longValue());
                    if (GestureGalleryUI.this.f282337y.size() != 0) {
                        GestureGalleryUI.this.f282258A = null;
                        if (!Util.isNullOrNil((List) GestureGalleryUI.this.f282337y)) {
                            C77407n nVar = GestureGalleryUI.this.f282332w;
                            if ((nVar != null && nVar.mo107563h()) || GestureGalleryUI.this.f282291Z) {
                                GestureGalleryUI.this.mo134469i8();
                            }
                            ImageQBarDataBean X7 = GestureGalleryUI.this.mo134459X7();
                            if (X7 != null) {
                                GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                                gestureGalleryUI2.f282339z = X7;
                                ((ScanCodeSheetItemLogic) gestureGalleryUI2.f282281U).mo67078i(X7.f273114e, GestureGalleryUI.m123765R7(gestureGalleryUI2, X7.f273113d));
                            } else if (GestureGalleryUI.this.f282337y.size() == 1) {
                                GestureGalleryUI gestureGalleryUI3 = GestureGalleryUI.this;
                                gestureGalleryUI3.f282339z = gestureGalleryUI3.f282337y.get(0);
                                GestureGalleryUI gestureGalleryUI4 = GestureGalleryUI.this;
                                C46900z zVar = gestureGalleryUI4.f282281U;
                                ImageQBarDataBean imageQBarDataBean = gestureGalleryUI4.f282339z;
                                ((ScanCodeSheetItemLogic) zVar).mo67078i(imageQBarDataBean.f273114e, GestureGalleryUI.m123765R7(gestureGalleryUI4, imageQBarDataBean.f273113d));
                            } else {
                                GestureGalleryUI.this.f282339z = null;
                            }
                        } else {
                            GestureGalleryUI.this.f282339z = null;
                        }
                    }
                }
                return false;
            }
        };
        this.f282329u1 = new IListener<NotifyDealQBarStrResultEvent>(fVar) {
            {
                this.__eventId = 1280295539;
            }

            public boolean callback(IEvent iEvent) {
                ImageQBarDataBean imageQBarDataBean;
                NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
                if (notifyDealQBarStrResultEvent == null) {
                    Log.m105920e("MicroMsg.GestureGalleryUI", "NotifyDealQBarStrResultEvent is null.");
                } else {
                    Log.m105925i("MicroMsg.GestureGalleryUI", "notify Event: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
                    NotifyDealQBarStrResultEvent.C92533a aVar = notifyDealQBarStrResultEvent.f264935d;
                    Activity activity = aVar.f264937b;
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    if (activity != gestureGalleryUI || (imageQBarDataBean = gestureGalleryUI.f282339z) == null || !aVar.f264936a.equals(imageQBarDataBean.f273113d)) {
                        Log.m105920e("MicroMsg.GestureGalleryUI", "not the same");
                    } else if (notifyDealQBarStrResultEvent.f264935d.f264938c == 3) {
                        GestureGalleryUI.this.finish();
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m123755H7(GestureGalleryUI gestureGalleryUI, int i) {
        String str = gestureGalleryUI.f282302g;
        if (str != null && !str.equals("")) {
            try {
                C101983r rVar = new C101983r();
                rVar.f300283b = gestureGalleryUI.getContext();
                rVar.f300288g = gestureGalleryUI.f282302g;
                rVar.f300285d = i;
                int i2 = gestureGalleryUI.f282328u;
                rVar.f300290i = i2;
                rVar.f300282a = gestureGalleryUI.f282330v;
                Log.m105919d("MicroMsg.GestureGalleryUI", "doSosAction, scene = %s.", Integer.valueOf(i2));
                ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GestureGalleryUI", "doSosAction fail, ex = ", e);
            }
        }
    }

    /* renamed from: I7 */
    public static void m123756I7(GestureGalleryUI gestureGalleryUI, int i) {
        if (gestureGalleryUI.f282336x1 == null) {
            gestureGalleryUI.f282336x1 = ((C14201c) C86312j.m106911c(C14201c.class)).mo12579vD();
        }
        C101904b bVar = gestureGalleryUI.f282336x1;
        int i2 = (gestureGalleryUI.f282286W0 || gestureGalleryUI.f282320q) ? 6 : 5;
        String str = gestureGalleryUI.f282302g;
        bVar.mo10651a(i, i2, (str == null || !((HashSet) gestureGalleryUI.f282264G).contains(str)) ? 0 : 1);
    }

    /* renamed from: J7 */
    public static void m123757J7(GestureGalleryUI gestureGalleryUI) {
        GestureGalleryUI gestureGalleryUI2 = gestureGalleryUI;
        Class cls = C11502f.class;
        Class cls2 = C39315g.class;
        if (Util.isNullOrNil(gestureGalleryUI2.f282302g)) {
            Log.m105928w("MicroMsg.GestureGalleryUI", "share image to friend fail, imgPath is null");
            return;
        }
        gestureGalleryUI2.mo134455T7(1, (ImageQBarDataBean) null);
        final int i = (gestureGalleryUI2.f282320q || gestureGalleryUI2.f282286W0) ? 6 : 5;
        String str = "";
        if (ImgUtil.isGif(gestureGalleryUI2.f282302g)) {
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137999G(C86013q1.m106456q(gestureGalleryUI2.f282302g));
            if (G == null) {
                G = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137999G(((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137995C(MMApplicationContext.getContext(), gestureGalleryUI2.f282302g));
            }
            long l = G == null ? 0 : C86013q1.m106451l(G.mo62640K1());
            String K1 = G == null ? gestureGalleryUI2.f282302g : G.mo62640K1();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            boolean z = (BitmapUtil.decodeFile(K1, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c();
            if (l > ((long) C77092c.m93039a()) || z) {
                C76879j.m92754y(gestureGalleryUI.getContext(), gestureGalleryUI2.getString(C0966R.string.f8198u2), str, gestureGalleryUI2.getString(C0966R.string.au5), (DialogInterface.OnClickListener) null);
                return;
            }
            Intent intent = new Intent();
            if (G != null) {
                str = G.getMd5();
            }
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Msg_Type", 5);
            intent.putExtra("Retr_MsgImgScene", 1);
            intent.putExtra("from_scene_forward_to_wework", i);
            intent.putExtra("content_type_forward_to_wework", 14);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93184q(intent, gestureGalleryUI.getContext());
        } else if (gestureGalleryUI2.mo134463b8(gestureGalleryUI2.f282309j1)) {
            ThreadPool.post(new Runnable() {
                public void run() {
                    Log.m105924i("MicroMsg.GestureGalleryUI", "send video to friend");
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    int i = GestureGalleryUI.f282257y1;
                    final String str = AndroidMediaUtil.getSysCameraDirPath() + C86013q1.m106456q(gestureGalleryUI.mo134458W7()) + ".mp4";
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        if (C86013q1.m106443d(GestureGalleryUI.this.mo134458W7(), str, false) < 0) {
                            Log.m105921e("MicroMsg.GestureGalleryUI", "copy file fail origin path:%s", GestureGalleryUI.this.mo134458W7());
                            return;
                        }
                        ((C7138g) C86312j.m106911c(C7138g.class)).mo8315Wr(str, GestureGalleryUI.this);
                    }
                    GestureGalleryUI.this.runOnUiThread(new Runnable() {
                        public void run() {
                            C86009m1 m1Var = new C86009m1(str);
                            long r = m1Var.mo119967g() ? m1Var.mo119980r() : -1;
                            Log.m105925i("MicroMsg.GestureGalleryUI", "send video to file size :%d, MaxSendVideoSize:%d", Long.valueOf(r), Long.valueOf(C77092c.m93048j()));
                            if (r <= 0) {
                                C76879j.m92754y(GestureGalleryUI.this.getContext(), GestureGalleryUI.this.getString(C0966R.string.f66), "", GestureGalleryUI.this.getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null);
                            } else if (r > C77092c.m93048j()) {
                                C76879j.m92754y(GestureGalleryUI.this.getContext(), GestureGalleryUI.this.getString(C0966R.string.f6r), "", GestureGalleryUI.this.getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null);
                            } else {
                                Log.m105924i("MicroMsg.GestureGalleryUI", "select contact in SelectConversationUI");
                                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                int i = GestureGalleryUI.f282257y1;
                                String W7 = gestureGalleryUI.mo134458W7();
                                Intent intent = new Intent();
                                intent.putExtra("image_path", W7);
                                intent.putExtra("Retr_Msg_Type", 1);
                                intent.putExtra("Select_Conv_Type", 3);
                                intent.putExtra("select_is_ret", true);
                                intent.putExtra("mutil_select_is_ret", true);
                                intent.putExtra("from_scene_forward_to_wework", i);
                                intent.putExtra("content_type_forward_to_wework", 3);
                                intent.putExtra("Select_Data_Send_To_WeWork", new VideoData(C86013q1.m106448i(W7, false)));
                                C88144b.m109802t(GestureGalleryUI.this.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
                            }
                        }
                    });
                }
            }, str);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Retr_File_Name", gestureGalleryUI2.f282302g);
            intent2.putExtra("Retr_Compress_Type", 0);
            intent2.putExtra("Retr_Msg_Type", 0);
            intent2.putExtra("from_scene_forward_to_wework", i);
            intent2.putExtra("content_type_forward_to_wework", 2);
            intent2.putExtra("Select_Data_Send_To_WeWork", new ImgData(C86013q1.m106448i(gestureGalleryUI2.f282302g, false)));
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93184q(intent2, gestureGalleryUI.getContext());
            ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
        }
    }

    /* renamed from: K7 */
    public static void m123758K7(GestureGalleryUI gestureGalleryUI, int i) {
        gestureGalleryUI.getClass();
        FTSSeachSimilarImgActionReportStruct fTSSeachSimilarImgActionReportStruct = new FTSSeachSimilarImgActionReportStruct();
        fTSSeachSimilarImgActionReportStruct.f265492d = 2;
        fTSSeachSimilarImgActionReportStruct.f265496h = fTSSeachSimilarImgActionReportStruct.mo86045b("PicMD5", MD5Util.getMD5String(gestureGalleryUI.f282289Y), true);
        fTSSeachSimilarImgActionReportStruct.f265497i = (long) i;
        fTSSeachSimilarImgActionReportStruct.f265493e = fTSSeachSimilarImgActionReportStruct.mo86045b("SessionId", "", true);
        fTSSeachSimilarImgActionReportStruct.f265495g = fTSSeachSimilarImgActionReportStruct.mo86045b("DocId", "", true);
        fTSSeachSimilarImgActionReportStruct.f265494f = fTSSeachSimilarImgActionReportStruct.mo86045b("SearchId", "", true);
        fTSSeachSimilarImgActionReportStruct.mo86054n();
    }

    /* renamed from: L7 */
    public static void m123759L7(GestureGalleryUI gestureGalleryUI) {
        String str = gestureGalleryUI.f282302g;
        if (str != null && !str.equals("")) {
            ArrayList<ImageQBarDataBean> arrayList = gestureGalleryUI.f282337y;
            gestureGalleryUI.mo134455T7(2, (arrayList == null || arrayList.size() <= 0) ? null : gestureGalleryUI.f282337y.get(0));
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(gestureGalleryUI, (View) null);
            } else if (gestureGalleryUI.mo134463b8(gestureGalleryUI.f282309j1)) {
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(gestureGalleryUI, gestureGalleryUI.mo134458W7(), new C98250h.C98251a() {
                    /* renamed from: a */
                    public void mo2055a(String str, String str2) {
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        C76701a.makeText((Context) gestureGalleryUI, (CharSequence) gestureGalleryUI.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
                        ((C7138g) C86312j.m106911c(C7138g.class)).mo8315Wr(str2, GestureGalleryUI.this);
                    }

                    /* renamed from: b */
                    public void mo2056b(String str, String str2) {
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        C76701a.makeText((Context) gestureGalleryUI, (CharSequence) gestureGalleryUI.getString(C0966R.string.kag), 1).show();
                    }
                });
            } else {
                ((C7138g) C86312j.m106911c(C7138g.class)).he0(gestureGalleryUI.f282302g, gestureGalleryUI);
            }
        }
    }

    /* renamed from: M7 */
    public static void m123760M7(GestureGalleryUI gestureGalleryUI) {
        gestureGalleryUI.mo134455T7(3, (ImageQBarDataBean) null);
        if (gestureGalleryUI.mo134463b8(gestureGalleryUI.f282309j1)) {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            String str = ((AppBrandMediaSource) ((ArrayList) gestureGalleryUI.f282305h1).get(gestureGalleryUI.f282309j1)).f237883f;
            if (!C86013q1.m106450k(str)) {
                str = gestureGalleryUI.f282304h.mo136884b(str, gestureGalleryUI.f282307i1, gestureGalleryUI.f282309j1, gestureGalleryUI.f282317p);
            }
            String str2 = str;
            C96787m0.m124253g(doFavoriteEvent, 1, gestureGalleryUI.f282302g, str2, 0, "", "", true);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264684i = gestureGalleryUI;
            aVar.f264688m = 32;
            doFavoriteEvent.publish();
            return;
        }
        DoFavoriteEvent doFavoriteEvent2 = new DoFavoriteEvent();
        C96787m0.m124252f(doFavoriteEvent2, 1, gestureGalleryUI.f282302g);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent2.f264674d;
        aVar2.f264684i = gestureGalleryUI;
        aVar2.f264688m = 32;
        doFavoriteEvent2.publish();
    }

    /* renamed from: N7 */
    public static void m123761N7(GestureGalleryUI gestureGalleryUI) {
        final Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
        Log.m105924i("MicroMsg.GestureGalleryUI", "request deal QBAR string");
        C77407n nVar = gestureGalleryUI.f282332w;
        if (nVar != null && nVar.mo107563h()) {
            gestureGalleryUI.f282332w.mo107572p();
        }
        if (gestureGalleryUI.f282337y.size() > 0) {
            C94468m.m119494b(gestureGalleryUI, gestureGalleryUI.f282296d.mo134495b(), gestureGalleryUI.f282337y, 0, new C94467l() {
                /* renamed from: a */
                public void mo64853a(ArrayList<PointF> arrayList, ArrayList<ImageQBarDataBean> arrayList2, ArrayList<ImageQBarDataBean> arrayList3) {
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    MultiCodeMaskView multiCodeMaskView = gestureGalleryUI.f282290Y0;
                    if (multiCodeMaskView != null) {
                        multiCodeMaskView.mo67040c(arrayList3, arrayList, arrayList2, gestureGalleryUI.f282298e.getMeasuredHeight());
                        GestureGalleryUI.this.f282290Y0.setMMultiCodeMaskViewListener(new MultiCodeMaskView.C42884a() {
                            /* renamed from: a */
                            public void mo64868a(ArrayList<ImageQBarDataBean> arrayList) {
                                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                gestureGalleryUI.f282339z = null;
                                C42912n.f116194a.mo67103a(gestureGalleryUI.f282292Z0.longValue(), 3, arrayList, (ImageQBarDataBean) null, GestureGalleryUI.this.f282293a1.longValue(), 1, GestureGalleryUI.m123762O7(GestureGalleryUI.this));
                            }

                            /* renamed from: b */
                            public void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z) {
                                C9648523 r0 = C9648523.this;
                                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                gestureGalleryUI.f282339z = null;
                                GestureGalleryUI.m123763P7(gestureGalleryUI, imageQBarDataBean, bundleExtra);
                                C42912n.f116194a.mo67103a(GestureGalleryUI.this.f282292Z0.longValue(), z ? 1 : 2, arrayList, imageQBarDataBean, GestureGalleryUI.this.f282293a1.longValue(), 1, GestureGalleryUI.m123762O7(GestureGalleryUI.this));
                            }
                        });
                        if (arrayList.size() > 1) {
                            C42912n.f116194a.mo67103a(GestureGalleryUI.this.f282292Z0.longValue(), 11, arrayList3, (ImageQBarDataBean) null, GestureGalleryUI.this.f282293a1.longValue(), 1, GestureGalleryUI.m123762O7(GestureGalleryUI.this));
                        }
                        GestureGalleryUI.m123764Q7(GestureGalleryUI.this, arrayList.size());
                    }
                }

                /* renamed from: b */
                public void mo64854b(ImageQBarDataBean imageQBarDataBean, ArrayList<ImageQBarDataBean> arrayList) {
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    gestureGalleryUI.f282339z = null;
                    GestureGalleryUI.m123763P7(gestureGalleryUI, imageQBarDataBean, bundleExtra);
                    GestureGalleryUI.m123764Q7(GestureGalleryUI.this, 0);
                    C42912n.f116194a.mo67103a(GestureGalleryUI.this.f282292Z0.longValue(), 1, arrayList, imageQBarDataBean, GestureGalleryUI.this.f282293a1.longValue(), 1, GestureGalleryUI.m123762O7(GestureGalleryUI.this));
                }
            });
        }
    }

    /* renamed from: O7 */
    public static int m123762O7(GestureGalleryUI gestureGalleryUI) {
        gestureGalleryUI.getClass();
        try {
            if (!gestureGalleryUI.f282320q) {
                if (!gestureGalleryUI.f282286W0) {
                    return ((C45696d) C86709a0.m107533q(C45696d.class)).B60(gestureGalleryUI.f282312m1) ? 5 : 3;
                }
            }
            return 4;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.GestureGalleryUI", e, "getCurrScene", new Object[0]);
            return 0;
        }
    }

    /* renamed from: P7 */
    public static void m123763P7(GestureGalleryUI gestureGalleryUI, ImageQBarDataBean imageQBarDataBean, Bundle bundle) {
        Bundle bundle2;
        gestureGalleryUI.mo134455T7(4, imageQBarDataBean);
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = gestureGalleryUI;
        aVar.f264649a = imageQBarDataBean.f273113d;
        aVar.f264651c = imageQBarDataBean.f273114e;
        aVar.f264652d = imageQBarDataBean.f273115f;
        aVar.f264661m = imageQBarDataBean.f273121o;
        int i = gestureGalleryUI.f282259B;
        if (44 == i) {
            aVar.f264657i = i;
        } else {
            aVar.f264657i = 40;
        }
        aVar.f264660l = bundle;
        if (bundle == null) {
            Log.m105924i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, statObj is null");
            bundle2 = new Bundle();
            dealQBarStrEvent.f264648d.f264660l = bundle2;
        } else {
            bundle2 = bundle;
        }
        if (gestureGalleryUI.f282286W0 || gestureGalleryUI.f282320q) {
            Log.m105924i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, from app brand");
            bundle2.putInt("LaunchCodeScene_ScanScene", 5);
        } else {
            Log.m105924i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, from h5");
            bundle2.putInt("LaunchCodeScene_ScanScene", 3);
        }
        dealQBarStrEvent.publish();
        gestureGalleryUI.mo134466e8(true, imageQBarDataBean.f273114e, imageQBarDataBean.f273113d, true, bundle);
    }

    /* renamed from: Q7 */
    public static void m123764Q7(GestureGalleryUI gestureGalleryUI, int i) {
        int i2 = (gestureGalleryUI.f282286W0 || gestureGalleryUI.f282320q) ? 6 : 4;
        C115669n.INSTANCE.mo160131h(23040, Long.valueOf(gestureGalleryUI.f282292Z0.longValue()), Integer.valueOf(gestureGalleryUI.f282337y.size()), Integer.valueOf(i), Integer.valueOf(i2), "");
    }

    /* renamed from: R7 */
    public static C46897s.C46898a m123765R7(GestureGalleryUI gestureGalleryUI, String str) {
        Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("stat_app_id");
            if (string != null) {
                C46897s.C46898a aVar = new C46897s.C46898a(str);
                aVar.f126106b = 5;
                aVar.f126107c = string;
                return aVar;
            }
            String string2 = bundleExtra.getString("stat_url");
            if (!Util.isNullOrNil(string2)) {
                C46897s.C46898a aVar2 = new C46897s.C46898a(str);
                aVar2.f126106b = 4;
                aVar2.f126107c = string2;
                return aVar2;
            }
        }
        return new C46897s.C46898a(str);
    }

    /* renamed from: S7 */
    public static void m123766S7(GestureGalleryUI gestureGalleryUI) {
        List<AppBrandMediaSource> list;
        gestureGalleryUI.getClass();
        Log.m105924i("MicroMsg.GestureGalleryUI", "resumeVideo");
        ImageAdapter.ViewHolder viewHolder = gestureGalleryUI.f282318p0;
        if (viewHolder == null || viewHolder.f282392e.isPlaying() || gestureGalleryUI.f282282U0 != PlayerState.Paused) {
            Log.m105924i("MicroMsg.GestureGalleryUI", "call playVideo");
            if (gestureGalleryUI.f282318p0 == null || gestureGalleryUI.f282309j1 < 0 || (list = gestureGalleryUI.f282305h1) == null || ((ArrayList) list).size() == 0) {
                Log.m105920e("MicroMsg.GestureGalleryUI", "playVideo fail");
                return;
            }
            Log.m105924i("MicroMsg.GestureGalleryUI", "playVideo");
            gestureGalleryUI.mo134470j8();
            PlayProgressTask playProgressTask = new PlayProgressTask((C964701) null);
            gestureGalleryUI.f282333w1 = playProgressTask;
            playProgressTask.f282398d = false;
            ThreadPool.post(playProgressTask, "gesture_gallery_ui_video_update_progress");
            gestureGalleryUI.f282276R0.setIsPlay(true);
            String W7 = gestureGalleryUI.mo134458W7();
            gestureGalleryUI.f282318p0.f282393f.setVisibility(8);
            gestureGalleryUI.f282318p0.f282388a.setVisibility(0);
            View view = gestureGalleryUI.f282318p0.f282394g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "playVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "playVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gestureGalleryUI.f282318p0.f282392e.setVisibility(0);
            gestureGalleryUI.f282318p0.f282392e.setVideoURI(Uri.parse(W7));
            gestureGalleryUI.f282318p0.f282392e.start();
            gestureGalleryUI.f282282U0 = PlayerState.Start;
            return;
        }
        long j = gestureGalleryUI.f282280T0;
        if (j >= 0) {
            gestureGalleryUI.f282318p0.f282392e.seekTo((int) j);
            gestureGalleryUI.f282276R0.seek(((int) gestureGalleryUI.f282280T0) / 1000);
        }
        gestureGalleryUI.f282318p0.f282392e.start();
        gestureGalleryUI.f282318p0.f282393f.setVisibility(8);
        if (gestureGalleryUI.f282318p0.f282390c.getVisibility() == 0) {
            gestureGalleryUI.f282318p0.f282390c.setVisibility(8);
        }
        gestureGalleryUI.f282282U0 = PlayerState.Resume;
        gestureGalleryUI.f282276R0.setIsPlay(true);
        gestureGalleryUI.mo134470j8();
        PlayProgressTask playProgressTask2 = new PlayProgressTask((C964701) null);
        gestureGalleryUI.f282333w1 = playProgressTask2;
        playProgressTask2.f282398d = false;
        ThreadPool.post(playProgressTask2, "gesture_gallery_ui_video_update_progress");
        Log.m105924i("MicroMsg.GestureGalleryUI", IXWebBroadcastListener.STAGE_START);
    }

    /* renamed from: T7 */
    public final void mo134455T7(int i, ImageQBarDataBean imageQBarDataBean) {
        if (this.f282287X != null && !Util.isNullOrNil(this.f282312m1)) {
            C45601r rVar = this.f282287X;
            rVar.f123324b = this.f282312m1;
            rVar.f123326d = this.f282259B;
            if (imageQBarDataBean != null) {
                rVar.f123325c = true;
                rVar.f123329g = imageQBarDataBean.f273114e == 22 ? "WX_CODE" : "QR_CODE";
                rVar.f123328f = imageQBarDataBean.f273113d;
            }
            String str = this.f282289Y;
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            String doUrlEncode = WebViewUtilities.doUrlEncode(str);
            C45601r rVar2 = this.f282287X;
            rVar2.f123330h = doUrlEncode;
            rVar2.mo71118a(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098 A[SYNTHETIC, Splitter:B:26:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ Exception -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa A[Catch:{ Exception -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8 A[Catch:{ Exception -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff A[Catch:{ Exception -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: U7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134456U7() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.GestureGalleryUI"
            java.lang.String r1 = r9.f282302g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x014b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = r9.f282263F
            java.lang.String r2 = r9.f282302g
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x014b
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            int r1 = r1.mo123467m()
            if (r1 == 0) goto L_0x014b
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            boolean r2 = com.tencent.p014mm.plugin.scanner.C30391y.m39060e()
            java.lang.String r3 = "MicroMsg.ScannerHelper"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0037
            java.lang.String r1 = "Word Detect Closed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x0035:
            r1 = 0
            goto L_0x0096
        L_0x0037:
            k40.a r2 = f40.C86709a0.m107533q(r1)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r7 = "EnableWebviewPicTranslation"
            int r2 = r2.mo107404b(r7, r6)
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r7 = "PicTranslationSupportUserLanguage"
            java.lang.String r1 = r1.mo107405c(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r2 != r5) goto L_0x005e
            r8 = 1
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r6] = r8
            r7[r5] = r1
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r7[r4] = r8
            java.lang.String r8 = "enable %s, support lang %s, current lang %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
            if (r2 != r5) goto L_0x0091
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0091
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)
            if (r1 == 0) goto L_0x0091
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            boolean r1 = qe3.C89625d.f257846l
            if (r1 == 0) goto L_0x0035
        L_0x0095:
            r1 = 1
        L_0x0096:
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = r9.f282311l1     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x00a5
            int r2 = r1.length()     // Catch:{ Exception -> 0x0143 }
            if (r2 != 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r2 = 0
            goto L_0x00a6
        L_0x00a5:
            r2 = 1
        L_0x00a6:
            r3 = 0
            if (r2 == 0) goto L_0x00aa
            goto L_0x00c4
        L_0x00aa:
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)     // Catch:{ Exception -> 0x0143 }
            if (r2 != 0) goto L_0x00b1
            goto L_0x00c4
        L_0x00b1:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0143 }
            r2.<init>()     // Catch:{ Exception -> 0x0143 }
            r2.inJustDecodeBounds = r5     // Catch:{ Exception -> 0x0143 }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r1, r2)     // Catch:{ Exception -> 0x0143 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ Exception -> 0x0143 }
            int r1 = r2.outWidth     // Catch:{ Exception -> 0x0143 }
            int r2 = r2.outHeight     // Catch:{ Exception -> 0x0143 }
            r3.<init>(r1, r2)     // Catch:{ Exception -> 0x0143 }
        L_0x00c4:
            if (r3 == 0) goto L_0x00ff
            java.lang.Class<lx.g0> r1 = p200lx.C99711g0.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0143 }
            lx.g0 r1 = (p200lx.C99711g0) r1     // Catch:{ Exception -> 0x0143 }
            int r2 = r3.x     // Catch:{ Exception -> 0x0143 }
            int r7 = r3.y     // Catch:{ Exception -> 0x0143 }
            boolean r1 = r1.cq0(r2, r7)     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = "doWordDetectImage image overRatioLimit: %s , imagePath:%s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0143 }
            r2[r6] = r3     // Catch:{ Exception -> 0x0143 }
            java.lang.String r3 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            r2[r5] = r3     // Catch:{ Exception -> 0x0143 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ Exception -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = r9.f282263F     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0143 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = r9.f282262E     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0143 }
            java.util.Set<java.lang.String> r1 = r9.f282264G     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ Exception -> 0x0143 }
            r1.add(r2)     // Catch:{ Exception -> 0x0143 }
            return
        L_0x00ff:
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic r1 = r9.f282285W     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            com.tencent.mm.ui.MMActivity r3 = r1.f282241f     // Catch:{ Exception -> 0x0143 }
            if (r3 == 0) goto L_0x012b
            boolean r3 = r3.isFinishing()     // Catch:{ Exception -> 0x0143 }
            if (r3 == 0) goto L_0x010e
            goto L_0x012b
        L_0x010e:
            com.tencent.mm.plugin.scanner.word.d r3 = r1.f282237b     // Catch:{ Exception -> 0x0143 }
            if (r3 != 0) goto L_0x0122
            java.lang.Class<lx.u> r3 = p200lx.C99716u.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0143 }
            lx.u r3 = (p200lx.C99716u) r3     // Catch:{ Exception -> 0x0143 }
            com.tencent.mm.ui.MMActivity r4 = r1.f282241f     // Catch:{ Exception -> 0x0143 }
            com.tencent.mm.plugin.scanner.word.d r3 = r3.B80(r4)     // Catch:{ Exception -> 0x0143 }
            r1.f282237b = r3     // Catch:{ Exception -> 0x0143 }
        L_0x0122:
            com.tencent.mm.plugin.scanner.word.d r3 = r1.f282237b     // Catch:{ Exception -> 0x0143 }
            com.tencent.mm.plugin.scanner.word.d$a r1 = r1.f282236a     // Catch:{ Exception -> 0x0143 }
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r3 = (com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine) r3     // Catch:{ Exception -> 0x0143 }
            r3.mo130013b(r2, r1)     // Catch:{ Exception -> 0x0143 }
        L_0x012b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0143 }
            r1.<init>()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = "photoTransLogic.scan :"
            r1.append(r2)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f282302g     // Catch:{ Exception -> 0x0143 }
            r1.append(r2)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0143 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0143 }
            goto L_0x014b
        L_0x0143:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r3, r2)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.mo134456U7():void");
    }

    /* renamed from: V7 */
    public final void mo134457V7(int i) {
        ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.mo126611w(C99252h.m129298c(this.f282330v));
        chatImageWebSearchActionStruct.mo126609u("");
        chatImageWebSearchActionStruct.f265370f = i;
        chatImageWebSearchActionStruct.f265369e = 1;
        chatImageWebSearchActionStruct.mo126608t("");
        chatImageWebSearchActionStruct.mo126607s("");
        int i2 = this.f282328u;
        if (i2 == 0) {
            i2 = 83;
        }
        chatImageWebSearchActionStruct.f265371g = i2;
        chatImageWebSearchActionStruct.f265374j = 0;
        chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(this.f282302g));
        chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
        chatImageWebSearchActionStruct.mo86054n();
        C22613h1.m26490p(chatImageWebSearchActionStruct);
    }

    /* renamed from: W7 */
    public final String mo134458W7() {
        List<AppBrandMediaSource> list;
        if (this.f282309j1 < 0 || (list = this.f282305h1) == null || ((ArrayList) list).size() == 0) {
            return "";
        }
        String str = ((AppBrandMediaSource) ((ArrayList) this.f282305h1).get(this.f282309j1)).f237881d;
        Log.m105925i("MicroMsg.GestureGalleryUI", "playVideo  url :%s", str);
        if (str == null || !str.startsWith("http")) {
            return str;
        }
        C116590f fVar = C102121a.f300705a;
        if (fVar == null) {
            C86009m1 m1Var = new C86009m1(C112760b.m154202J());
            if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                m1Var.mo119987x();
            }
            C116921a aVar = new C116921a(this);
            File externalCacheDir = "mounted".equals(Environment.getExternalStorageState()) ? getExternalCacheDir() : null;
            if (externalCacheDir == null) {
                externalCacheDir = getCacheDir();
            }
            if (externalCacheDir == null) {
                externalCacheDir = new File("/data/data/" + getPackageName() + "/cache/");
            }
            new File(externalCacheDir, "video-cache");
            Executors.newSingleThreadExecutor();
            C116590f fVar2 = new C116590f(new C97423c(new File(C48380r.m53726a(m1Var.mo119976n(), false)), new C86451f(), new C86452g(134217728), aVar, new C97827a()), (C116590f.C97424a) null);
            C102121a.f300705a = fVar2;
            fVar = fVar2;
        }
        C97423c cVar = fVar.f349627f;
        if (new File(cVar.f285959a, ((C86451f) cVar.f285960b).mo120872a(str)).exists()) {
            C97423c cVar2 = fVar.f349627f;
            File file = new File(cVar2.f285959a, ((C86451f) cVar2.f285960b).mo120872a(str));
            try {
                C86449e eVar = (C86449e) fVar.f349627f.f285961c;
                eVar.f251239a.submit(new C86449e.C86450a(file));
            } catch (IOException unused) {
                Objects.toString(file);
            }
            return Uri.fromFile(file).toString();
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = "127.0.0.1";
        objArr[1] = Integer.valueOf(fVar.f349626e);
        try {
            objArr[2] = URLEncoder.encode(str, "utf-8");
            return String.format(locale, "http://%s:%d/%s", objArr);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* renamed from: X7 */
    public final ImageQBarDataBean mo134459X7() {
        C13604l<ArrayList<ImageQBarDataBean>, ArrayList<PointF>> a = C94468m.m119493a(this, this.f282296d.mo134495b(), this.f282337y, 0);
        if (((ArrayList) a.f38555d).size() == 1) {
            return (ImageQBarDataBean) ((ArrayList) a.f38555d).get(0);
        }
        return null;
    }

    /* renamed from: Y7 */
    public void mo134460Y7() {
        int intExtra = getIntent().getIntExtra("nevNext", 1);
        if (this.f282285W.f282239d != 1) {
            if (!this.f282324s) {
                Log.m105920e("MicroMsg.GestureGalleryUI", "showmenu is false, don't show menu");
                return;
            }
            C45601r rVar = new C45601r();
            this.f282287X = rVar;
            rVar.f123327e = 2;
            rVar.f123323a = System.currentTimeMillis();
            if (1 == intExtra) {
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                PointF c2 = C111557w.m152067c(this.f282296d.mo134495b(), (float) this.f282298e.getXDown(), (float) this.f282298e.getYDown());
                if (c2 != null) {
                    c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(c2.x));
                    c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(c2.y));
                }
                GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = this.f282285W;
                int i = gestureGalleryTransAndOcrLogic.f282239d;
                if (i == 0 || i == 2) {
                    GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
                    galleryTranslateReportStruct.f265618d = gestureGalleryTransAndOcrLogic.f282239d == 2 ? 1 : 0;
                    galleryTranslateReportStruct.f265619e = 1;
                    galleryTranslateReportStruct.f265620f = gestureGalleryTransAndOcrLogic.f282247l ? 6 : 5;
                    galleryTranslateReportStruct.mo86054n();
                    mo134469i8();
                    return;
                }
                mo134469i8();
            } else if (2 == intExtra) {
                C76879j.m92737h(this, (String) null, getContext().getResources().getStringArray(C0966R.array.f2594ah), "", false, new C76879j.C11180n() {
                    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
                        r7 = r6.f282373a;
                     */
                    /* renamed from: j */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void mo782j(int r7) {
                        /*
                            r6 = this;
                            if (r7 == 0) goto L_0x003e
                            r0 = 1
                            if (r7 == r0) goto L_0x0006
                            goto L_0x0063
                        L_0x0006:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                            java.lang.String r0 = r7.f282302g
                            if (r0 == 0) goto L_0x0063
                            int r1 = r0.length()
                            if (r1 != 0) goto L_0x0013
                            goto L_0x0063
                        L_0x0013:
                            android.content.Intent r1 = new android.content.Intent
                            r1.<init>()
                            java.lang.String r2 = "Retr_File_Name"
                            r1.putExtra(r2, r0)
                            r0 = 0
                            java.lang.String r2 = "Retr_Msg_Type"
                            r1.putExtra(r2, r0)
                            java.lang.String r2 = "Retr_Compress_Type"
                            r1.putExtra(r2, r0)
                            java.lang.Class<om.f> r0 = p214om.C11502f.class
                            di3.d r0 = di3.C86312j.m106911c(r0)
                            om.f r0 = (p214om.C11502f) r0
                            wc3.z r0 = r0.mo11462yM()
                            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
                            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
                            r0.mo93184q(r1, r7)
                            goto L_0x0063
                        L_0x003e:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.this
                            java.lang.String r1 = r7.f282302g
                            if (r1 == 0) goto L_0x0063
                            int r0 = r1.length()
                            if (r0 != 0) goto L_0x004b
                            goto L_0x0063
                        L_0x004b:
                            com.tencent.mm.ui.MMActivityController r0 = r7.mController
                            r2 = 0
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$25 r5 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$25
                            r5.<init>(r1)
                            r3 = 1
                            java.lang.String r4 = ""
                            qo3.g r7 = wd3.C78575u.m94948q(r0, r1, r2, r3, r4, r5)
                            if (r7 != 0) goto L_0x0063
                            java.lang.String r7 = "MicroMsg.GestureGalleryUI"
                            java.lang.String r0 = "doTimeline fail, cannot show dialog"
                            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                        L_0x0063:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI.C965004.mo782j(int):void");
                    }
                });
            }
        }
    }

    /* renamed from: Z7 */
    public final boolean mo134461Z7() {
        boolean z = false;
        try {
            String str = this.f282302g;
            if (str != null && this.f282263F.containsKey(str)) {
                z = this.f282263F.get(str).booleanValue();
            }
        } catch (Exception e) {
            Log.printDebugStack("MicroMsg.GestureGalleryUI", "", e);
        }
        Log.m105924i("MicroMsg.GestureGalleryUI", "isCurrentImgCanShowOCREntrance:" + z);
        return z;
    }

    /* renamed from: a8 */
    public final boolean mo134462a8() {
        boolean z = false;
        try {
            String str = this.f282302g;
            if (str != null && this.f282262E.containsKey(str)) {
                z = this.f282262E.get(str).booleanValue();
            }
        } catch (Exception e) {
            Log.printDebugStack("MicroMsg.GestureGalleryUI", "", e);
        }
        Log.m105924i("MicroMsg.GestureGalleryUI", "isCurrentImgCanShowTransEntrance:" + z);
        return z;
    }

    /* renamed from: b8 */
    public final boolean mo134463b8(int i) {
        List<AppBrandMediaSource> list = this.f282305h1;
        return list != null && ((ArrayList) list).size() > i && ((ArrayList) this.f282305h1).get(i) != null && "video".endsWith(((AppBrandMediaSource) ((ArrayList) this.f282305h1).get(i)).f237882e);
    }

    /* renamed from: c8 */
    public void mo134464c8() {
        this.f282288X0 = false;
        MMGestureGallery mMGestureGallery = this.f282298e;
        if (mMGestureGallery != null) {
            mMGestureGallery.f56433o = false;
        }
        if (this.f282299e1) {
            this.f282279T.setVisibility(0);
        }
    }

    /* renamed from: d8 */
    public final void mo134465d8() {
        Log.m105924i("MicroMsg.GestureGalleryUI", "pauseVideo");
        if (this.f282318p0 != null) {
            long j = (long) (this.f282276R0.getmPosition() * 1000);
            this.f282280T0 = j;
            Log.m105925i("MicroMsg.GestureGalleryUI", "pauseVideo currentVideoPos：%d", Long.valueOf(j));
            this.f282318p0.f282392e.pause();
            this.f282318p0.f282393f.setVisibility(0);
            PlayerState playerState = this.f282282U0;
            if (playerState == PlayerState.Start || playerState == PlayerState.Resume) {
                this.f282282U0 = PlayerState.Paused;
                this.f282284V0 = true;
            }
            this.f282276R0.setIsPlay(false);
        }
        mo134470j8();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Log.m105918d("MicroMsg.GestureGalleryUI", "dispatchKeyEvent");
        MultiCodeMaskView multiCodeMaskView = this.f282290Y0;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            mo134467f8();
            return true;
        }
        this.f282290Y0.mo67041d(this.f282292Z0.longValue(), false);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f282295c1;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getActionMasked() == 0) {
            View selectedView = this.f282298e.getSelectedView();
            if (selectedView instanceof WxImageView) {
                ((WxImageView) selectedView).setInternalTouchEventConsumed(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e8 */
    public final void mo134466e8(boolean z, int i, String str, boolean z2, Bundle bundle) {
        String str2;
        String str3;
        Bundle bundle2 = bundle;
        if (this.f282320q || this.f282286W0) {
            String stringExtra = getIntent().getStringExtra("wxaSessionId");
            int intExtra = getIntent().getIntExtra("wxaScene", 0);
            if (bundle2 != null) {
                String string = bundle2.getString("wxappPathWithQuery");
                str3 = bundle2.getString("stat_app_id");
                str2 = string;
            } else {
                str3 = "";
                str2 = str3;
            }
            C42898a.f116163a.mo67087b(stringExtra, intExtra, str3, this.f282286W0, str2, i, str, z, z2, this.f282312m1);
        }
    }

    /* renamed from: f8 */
    public void mo134467f8() {
        if (!this.f282288X0) {
            if (this.f282298e.getSelectedItemPosition() != this.f282310k1 || !this.f282265H) {
                finish();
                overridePendingTransition(0, 0);
            } else if (this.f282323r1 || this.f282296d == null) {
                Log.m105924i("MicroMsg.GestureGalleryUI", "isRunningExitAnimation");
            } else {
                Log.m105924i("MicroMsg.GestureGalleryUI", "runExitAnimation");
                int width = this.f282298e.getWidth();
                int height = this.f282298e.getHeight();
                int selectedItemPosition = this.f282298e.getSelectedItemPosition();
                String str = this.f282303g1.get(selectedItemPosition);
                if (!C86013q1.m106450k(str)) {
                    str = this.f282304h.mo136884b(str, this.f282307i1, selectedItemPosition, this.f282317p);
                }
                if (!Util.isNullOrNil(str)) {
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
                    height = (int) ((((float) width) / ((float) imageOptions.outWidth)) * ((float) imageOptions.outHeight));
                    if (height > this.f282298e.getHeight()) {
                        if (((double) height) < ((double) this.f282298e.getHeight()) * 2.5d) {
                            this.f282273Q = (this.f282298e.getHeight() * this.f282273Q) / height;
                        }
                        height = this.f282298e.getHeight();
                    }
                }
                C45059m0 m0Var = this.f282268K;
                m0Var.f122226f = width;
                m0Var.f122227g = height;
                m0Var.mo70410e(this.f282271N, this.f282270M, this.f282272P, this.f282273Q);
                float f = this.f282316o1;
                if (((double) f) != 1.0d) {
                    this.f282268K.f122234n = 1.0f / f;
                    if (!(this.f282319p1 == 0 && this.f282321q1 == 0)) {
                        int width2 = ((int) (((float) (this.f282298e.getWidth() / 2)) * (1.0f - this.f282316o1))) + this.f282319p1;
                        int height2 = (int) (((float) ((this.f282298e.getHeight() / 2) + this.f282321q1)) - (((float) (height / 2)) * this.f282316o1));
                        C45059m0 m0Var2 = this.f282268K;
                        m0Var2.f122235o = width2;
                        m0Var2.f122236p = height2;
                    }
                }
                this.f282268K.mo70409d(this.f282298e, this.f282275R, new C45059m0.C45068i() {
                    public void onAnimationEnd() {
                        GestureGalleryUI.this.f282277S.post(new Runnable() {
                            public void run() {
                                GestureGalleryUI.this.finish();
                                GestureGalleryUI.this.overridePendingTransition(0, 0);
                            }
                        });
                        GestureGalleryUI.this.f282323r1 = false;
                    }

                    public void onAnimationStart() {
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        gestureGalleryUI.f282323r1 = true;
                        gestureGalleryUI.f282277S.postDelayed(new Runnable() {
                            public void run() {
                                View b = GestureGalleryUI.this.f282296d.mo134495b();
                                if (b instanceof MultiTouchImageView) {
                                    ((MultiTouchImageView) b).mo26059d();
                                }
                            }
                        }, 20);
                    }
                }, (C45059m0.C45066g) null);
            }
        }
    }

    /* renamed from: g8 */
    public final boolean mo134468g8() {
        return this.f282334x && !Util.isNullOrNil((List) this.f282337y);
    }

    public int getForceOrientation() {
        return (this.f282320q || this.f282322r) ? getIntent().getIntExtra("KOrientation", -1) : super.getForceOrientation();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bpp;
    }

    /* renamed from: i8 */
    public final void mo134469i8() {
        boolean z = false;
        if (this.f282332w == null) {
            this.f282332w = new C77407n((Context) getContext(), this.f282297d1, false);
        }
        int i = this.f282297d1;
        if (i == 1) {
            C77407n nVar = this.f282332w;
            nVar.f225771i = new C11182m0() {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    GestureGalleryUI.this.f282332w.mo107567l((View) null);
                    e0Var.clear();
                    if (!GestureGalleryUI.this.f282291Z) {
                        e0Var.mo107125a(1, C0966R.string.hre);
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        if (gestureGalleryUI.mo134463b8(gestureGalleryUI.f282309j1)) {
                            e0Var.mo107125a(2, C0966R.string.iar);
                        } else {
                            e0Var.mo107125a(2, C0966R.string.iam);
                        }
                        e0Var.mo107125a(3, C0966R.string.f361137hk2);
                    }
                    GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                    if ((gestureGalleryUI2.f282283V || gestureGalleryUI2.mo134462a8()) && !Util.isNullOrNil(GestureGalleryUI.this.f282302g)) {
                        e0Var.mo107125a(4, C0966R.string.b8h);
                        GestureGalleryUI.this.f282285W.mo134450c();
                    }
                    if (GestureGalleryUI.this.mo134461Z7()) {
                        e0Var.mo107144g(12, GestureGalleryUI.this.getString(C0966R.string.b8f), C0966R.raw.icons_outlined_ocr);
                        GestureGalleryUI.m123756I7(GestureGalleryUI.this, 2);
                    }
                    if (!GestureGalleryUI.this.f282320q && !((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
                        e0Var.add(0, 6, 0, (CharSequence) GestureGalleryUI.this.getString(C0966R.string.cwg));
                        GestureGalleryUI.this.mo134457V7(15);
                    }
                    if (GestureGalleryUI.this.mo134468g8()) {
                        GestureGalleryUI gestureGalleryUI3 = GestureGalleryUI.this;
                        gestureGalleryUI3.getClass();
                        C549924 r3 = new View.OnClickListener() {
                            public void onClick(View view) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(view);
                                Object[] array = arrayList.toArray();
                                arrayList.clear();
                                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                                GestureGalleryUI.m123761N7(GestureGalleryUI.this);
                                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        };
                        ImageQBarDataBean X7 = gestureGalleryUI3.mo134459X7();
                        View c = ((ScanCodeSheetItemLogic) gestureGalleryUI3.f282281U).mo67072c(r3, gestureGalleryUI3.f282337y, X7, 8);
                        GestureGalleryUI.this.f282332w.mo107567l(c);
                        if (!(c instanceof ViewTitleWithAnimation)) {
                            return;
                        }
                        if (e0Var.size() > 1) {
                            ((ViewTitleWithAnimation) c).setTopPaddingVisibility(0);
                        } else {
                            ((ViewTitleWithAnimation) c).setTopPaddingVisibility(8);
                        }
                    }
                }
            };
            nVar.f225782p = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int itemId = menuItem.getItemId();
                    if (itemId != 12) {
                        switch (itemId) {
                            case 1:
                                GestureGalleryUI.m123757J7(GestureGalleryUI.this);
                                GestureGalleryUI.m123758K7(GestureGalleryUI.this, 1);
                                return;
                            case 2:
                                GestureGalleryUI.m123759L7(GestureGalleryUI.this);
                                GestureGalleryUI.m123758K7(GestureGalleryUI.this, 2);
                                return;
                            case 3:
                                GestureGalleryUI.m123758K7(GestureGalleryUI.this, 3);
                                GestureGalleryUI.m123760M7(GestureGalleryUI.this);
                                return;
                            case 4:
                                if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(GestureGalleryUI.this.getContext())) {
                                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                    int i2 = GestureGalleryUI.f282257y1;
                                    gestureGalleryUI.mo134455T7(6, (ImageQBarDataBean) null);
                                    GestureGalleryUI.this.f282285W.mo134451d();
                                    return;
                                }
                                return;
                            case 5:
                                GestureGalleryUI.m123761N7(GestureGalleryUI.this);
                                return;
                            case 6:
                                GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                                int i3 = GestureGalleryUI.f282257y1;
                                gestureGalleryUI2.mo134455T7(7, (ImageQBarDataBean) null);
                                GestureGalleryUI.m123755H7(GestureGalleryUI.this, 15);
                                return;
                            default:
                                return;
                        }
                    } else {
                        GestureGalleryUI gestureGalleryUI3 = GestureGalleryUI.this;
                        GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = gestureGalleryUI3.f282285W;
                        MMGestureGallery mMGestureGallery = gestureGalleryUI3.f282298e;
                        gestureGalleryTransAndOcrLogic.mo134449b(mMGestureGallery, mMGestureGallery.getSelectedView(), GestureGalleryUI.this.f282302g);
                        GestureGalleryUI.m123756I7(GestureGalleryUI.this, 1);
                    }
                }
            };
        } else if (i == 0) {
            C77407n nVar2 = this.f282332w;
            nVar2.f225771i = new C11182m0() {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    e0Var.clear();
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    if (!gestureGalleryUI.f282291Z) {
                        e0Var.mo107146h(1, gestureGalleryUI.getString(C0966R.string.i4e), C0966R.raw.icons_filled_share, GestureGalleryUI.this.getResources().getColor(C0966R.color.f2939n));
                        C88144b.m109788f("favorite");
                        e0Var.mo107146h(3, GestureGalleryUI.this.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
                    }
                    if (!GestureGalleryUI.this.f282320q && !((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
                        e0Var.mo107146h(6, GestureGalleryUI.this.getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo, GestureGalleryUI.this.getResources().getColor(C0966R.color.f2966ao));
                        GestureGalleryUI.this.mo134457V7(15);
                    }
                }
            };
            nVar2.f225773j = new C11182m0() {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    e0Var.clear();
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    if (!gestureGalleryUI.f282291Z) {
                        e0Var.mo107144g(2, gestureGalleryUI.mo134463b8(gestureGalleryUI.f282309j1) ? GestureGalleryUI.this.getString(C0966R.string.iar) : GestureGalleryUI.this.getString(C0966R.string.iam), C0966R.raw.icons_outlined_download);
                    }
                    GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                    if ((gestureGalleryUI2.f282283V || gestureGalleryUI2.mo134462a8()) && !Util.isNullOrNil(GestureGalleryUI.this.f282302g)) {
                        e0Var.mo107144g(4, GestureGalleryUI.this.getString(C0966R.string.b8i), C0966R.raw.icons_outlined_translate);
                        GestureGalleryUI.this.f282285W.mo134450c();
                    }
                    if (GestureGalleryUI.this.mo134461Z7()) {
                        e0Var.mo107144g(12, GestureGalleryUI.this.getString(C0966R.string.b8f), C0966R.raw.icons_outlined_ocr);
                        GestureGalleryUI.m123756I7(GestureGalleryUI.this, 2);
                    }
                }
            };
            nVar2.f225780o = new C11182m0() {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    e0Var.clear();
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    int i = GestureGalleryUI.f282257y1;
                    if (gestureGalleryUI.mo134468g8()) {
                        GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                        ((ScanCodeSheetItemLogic) gestureGalleryUI2.f282281U).mo67074e(gestureGalleryUI2.f282337y, gestureGalleryUI2.mo134459X7(), GestureGalleryUI.this.f282332w, e0Var, 5);
                    }
                }
            };
            nVar2.f225782p = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 1) {
                        GestureGalleryUI.m123757J7(GestureGalleryUI.this);
                        GestureGalleryUI.m123758K7(GestureGalleryUI.this, 1);
                    } else if (itemId == 3) {
                        GestureGalleryUI.m123758K7(GestureGalleryUI.this, 3);
                        GestureGalleryUI.m123760M7(GestureGalleryUI.this);
                    } else if (itemId == 6) {
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        int i2 = GestureGalleryUI.f282257y1;
                        gestureGalleryUI.mo134455T7(7, (ImageQBarDataBean) null);
                        GestureGalleryUI.m123755H7(GestureGalleryUI.this, 15);
                    }
                }
            };
            nVar2.f225787r = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 2) {
                        GestureGalleryUI.m123759L7(GestureGalleryUI.this);
                        GestureGalleryUI.m123758K7(GestureGalleryUI.this, 2);
                    } else if (itemId != 4) {
                        if (itemId == 12) {
                            GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                            GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = gestureGalleryUI.f282285W;
                            MMGestureGallery mMGestureGallery = gestureGalleryUI.f282298e;
                            gestureGalleryTransAndOcrLogic.mo134449b(mMGestureGallery, mMGestureGallery.getSelectedView(), GestureGalleryUI.this.f282302g);
                            GestureGalleryUI.m123756I7(GestureGalleryUI.this, 1);
                        }
                    } else if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(GestureGalleryUI.this.getContext())) {
                        GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                        int i2 = GestureGalleryUI.f282257y1;
                        gestureGalleryUI2.mo134455T7(6, (ImageQBarDataBean) null);
                        GestureGalleryUI.this.f282285W.mo134451d();
                    }
                }
            };
            nVar2.f225793u = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    GestureGalleryUI.m123761N7(GestureGalleryUI.this);
                }
            };
        }
        this.f282332w.f225761d = new C77407n.C47880p() {
            public void onDismiss() {
                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                int i = GestureGalleryUI.f282257y1;
                gestureGalleryUI.mo134455T7(5, (ImageQBarDataBean) null);
                GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                gestureGalleryUI2.f282339z = null;
                gestureGalleryUI2.f282337y.clear();
                GestureGalleryUI gestureGalleryUI3 = GestureGalleryUI.this;
                gestureGalleryUI3.f282332w = null;
                ((ScanCodeSheetItemLogic) gestureGalleryUI3.f282281U).mo67083n();
            }
        };
        if (!getContext().isFinishing()) {
            if (!this.f282291Z || mo134468g8() || mo134462a8() || mo134461Z7()) {
                z = true;
            }
            if (z) {
                this.f282332w.mo107573q();
            }
        }
        if (this.f282334x && Util.isNullOrNil((List) this.f282337y) && C97625j3.m125815e().mo123467m() != 0) {
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
            recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
            RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
            aVar.f107733b = this.f282302g;
            aVar.f107735d = new HashSet(this.f282260C);
            RecogQBarOfImageFileEvent.C40158a aVar2 = recogQBarOfImageFileEvent.f107731d;
            aVar2.f107736e = true;
            aVar2.f107737f = 2;
            this.f282258A = this.f282302g;
            recogQBarOfImageFileEvent.publish();
            this.f282294b1 = Long.valueOf(System.currentTimeMillis());
        }
    }

    public void initView() {
        int indexOf;
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("nowUrl"));
        this.f282311l1 = Util.nullAsNil(getIntent().getStringExtra("nowUrlPath"));
        this.f282312m1 = Util.nullAsNil(getIntent().getStringExtra("nowWebUrl"));
        this.f282307i1 = getIntent().getIntExtra("type", 0);
        this.f282314n1 = ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(this.f282312m1);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("mediaSource");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ((ArrayList) this.f282305h1).clear();
            ((ArrayList) this.f282305h1).addAll(parcelableArrayListExtra);
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra("urlList");
        if (stringArrayExtra == null || stringArrayExtra.length == 0) {
            String nullAsNil2 = Util.nullAsNil(getIntent().getStringExtra("htmlData"));
            int i = 0;
            while (i >= 0) {
                int indexOf2 = nullAsNil2.indexOf("weixin://viewimage/", i);
                if (indexOf2 < 0 || (indexOf = nullAsNil2.indexOf(FastJsonResponse.QUOTE, indexOf2)) < 0) {
                    break;
                }
                String substring = nullAsNil2.substring(indexOf2 + 19, indexOf);
                Log.m105918d("MicroMsg.GestureGalleryUI", "start:" + indexOf2 + " end:" + indexOf + " url:" + substring);
                this.f282303g1.add(substring);
                i = indexOf;
            }
        } else {
            this.f282303g1 = Arrays.asList(stringArrayExtra);
        }
        String stringExtra = getIntent().getStringExtra("pageInfos");
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                this.f282326t = new JSONArray(stringExtra);
            } catch (Exception unused) {
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f282303g1.size()) {
                break;
            } else if (nullAsNil.equals(this.f282303g1.get(i2))) {
                this.f282309j1 = i2;
                break;
            } else {
                i2++;
            }
        }
        this.f282310k1 = this.f282309j1;
        if (getIntent().getIntExtra("currentPos", -1) >= 0) {
            this.f282310k1 = getIntent().getIntExtra("currentPos", -1);
        }
        setBackBtn(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                GestureGalleryUI.this.mo134467f8();
                return true;
            }
        });
        TextView textView = (TextView) findViewById(C0966R.C0970id.hqs);
        this.f282279T = textView;
        if (this.f282299e1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        int g = C75044y4.m89995g(getContext(), C0966R.dimen.f3899i_);
        int f = C76577a.m92155f(getContext(), C0966R.dimen.f3963ll);
        StringBuilder sb = new StringBuilder();
        sb.append("page indicator Y is ");
        sb.append(String.valueOf(this.f282279T.getY() + " pixel now"));
        Log.m105918d("MicroMsg.GestureGalleryUI", sb.toString());
        ((RelativeLayout.LayoutParams) this.f282279T.getLayoutParams()).topMargin = g + f;
        this.f282275R = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f282274Q0 = (RelativeLayout) findViewById(C0966R.C0970id.l7u);
        this.f282276R0 = (RedesignVideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        ((PressAlphaImageView) findViewById(C0966R.C0970id.l4y)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                GestureGalleryUI.this.mo134467f8();
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f282276R0.setPlayBtnOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                if (gestureGalleryUI.f282276R0.f283824z) {
                    gestureGalleryUI.mo134465d8();
                } else {
                    GestureGalleryUI.m123766S7(gestureGalleryUI);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f282276R0.setVideoTotalTime(0);
        this.f282276R0.seek(0);
        this.f282276R0.setIplaySeekCallback(new C102693c() {
            /* renamed from: a */
            public void mo4335a(int i) {
                ImageAdapter.ViewHolder viewHolder = GestureGalleryUI.this.f282318p0;
                if (viewHolder != null) {
                    viewHolder.f282392e.seekTo(i * 1000);
                }
            }

            /* renamed from: c */
            public void mo4336c(int i) {
            }

            public void onSeekPre() {
            }
        });
        this.f282296d = new ImageAdapter(this);
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f282298e = mMGestureGallery;
        mMGestureGallery.setVisibility(0);
        this.f282298e.setVerticalFadingEdgeEnabled(false);
        this.f282298e.setHorizontalFadingEdgeEnabled(false);
        this.f282298e.setAdapter(this.f282296d);
        this.f282298e.setSelection(this.f282309j1);
        this.f282298e.setOnItemSelectedListener(this.f282325s1);
        this.f282298e.setSingleClickOverListener(new MMGestureGallery.C19842g() {
            /* renamed from: a */
            public void mo26370a() {
                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                if (gestureGalleryUI.mo134463b8(gestureGalleryUI.f282309j1)) {
                    GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                    if (!gestureGalleryUI2.f282335x0) {
                        gestureGalleryUI2.f282274Q0.setVisibility(0);
                    } else {
                        gestureGalleryUI2.f282274Q0.setVisibility(8);
                    }
                    GestureGalleryUI gestureGalleryUI3 = GestureGalleryUI.this;
                    gestureGalleryUI3.f282335x0 = true ^ gestureGalleryUI3.f282335x0;
                    return;
                }
                GestureGalleryUI gestureGalleryUI4 = GestureGalleryUI.this;
                if (gestureGalleryUI4.f282285W.f282239d != 1) {
                    gestureGalleryUI4.mo134467f8();
                }
            }
        });
        getIntent().getIntExtra("nevNext", 1);
        this.f282298e.setLongClickOverListener(new MMGestureGallery.C19841d() {
            /* renamed from: a */
            public void mo26369a() {
                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                if (gestureGalleryUI.f282285W.f282239d != 1 && !gestureGalleryUI.f282288X0) {
                    gestureGalleryUI.mo134460Y7();
                }
            }
        });
        this.f282268K = new C45059m0(this);
        if (this.f282269L == null) {
            this.f282269L = findViewById(C0966R.C0970id.ehs);
        }
        this.f282269L.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                GestureGalleryUI.m123755H7(GestureGalleryUI.this, 16);
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f282269L == null) {
            this.f282269L = findViewById(C0966R.C0970id.ehs);
        }
        if (this.f282269L.getVisibility() == 0) {
            mo134457V7(16);
        }
        this.f282290Y0 = (MultiCodeMaskView) findViewById(C0966R.C0970id.h2z);
    }

    /* renamed from: j8 */
    public final void mo134470j8() {
        PlayProgressTask playProgressTask = this.f282333w1;
        if (playProgressTask != null) {
            playProgressTask.f282398d = true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && -1 == i2) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            final C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
            final C9650241 r1 = new Runnable(this) {
                public void run() {
                    Q.dismiss();
                }
            };
            if (!Util.isNullOrNil(stringExtra)) {
                for (final String next : Util.stringsToList(stringExtra.split(","))) {
                    final String str2 = ((AppBrandMediaSource) ((ArrayList) this.f282305h1).get(this.f282309j1)).f237883f;
                    if (!C86013q1.m106450k(str2)) {
                        str2 = this.f282304h.mo136884b(str2, this.f282307i1, this.f282309j1, this.f282317p);
                    }
                    Log.m105925i("MicroMsg.GestureGalleryUI", "onActivityResult,  sendVideo video:%s,  thumbFilename:%s", mo134458W7(), str2);
                    C86709a0.m107525e().postToWorker(new Runnable() {
                        public void run() {
                            C97425j a = C7250m.m7431a();
                            AppCompatActivity context = GestureGalleryUI.this.getContext();
                            String str = next;
                            GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                            int i = GestureGalleryUI.f282257y1;
                            a.Ml0(context, str, gestureGalleryUI.mo134458W7(), str2, 1, (int) GestureGalleryUI.this.f282278S0, false, false, "", "");
                            MMHandlerThread.postToMainThread(r1);
                        }

                        public String toString() {
                            return super.toString() + "send video";
                        }
                    });
                    if (!Util.isNullOrNil(str)) {
                        C7250m.m7431a().mo136257Tm(next, str, C45628s0.m50810y(next), 0);
                    }
                }
                C75026b.m89951a(this, getString(C0966R.string.euo));
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        MultiCodeMaskView multiCodeMaskView = this.f282290Y0;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            this.f282290Y0.mo67041d(this.f282292Z0.longValue(), false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f282266I = bundle;
        this.f282301f1.alive();
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        fullScreenNoTitleBar(true);
        this.f282295c1 = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onDoubleTap = super.onDoubleTap(motionEvent);
                C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                MMGestureGallery mMGestureGallery = GestureGalleryUI.this.f282298e;
                if (mMGestureGallery == null || !(mMGestureGallery.getSelectedView() instanceof WxImageView)) {
                    return false;
                }
                GestureGalleryUI.this.mo134467f8();
                return true;
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        this.f282320q = getIntent().getBooleanExtra("isFromAppBrand", false);
        this.f282322r = getIntent().getBooleanExtra("isFromAppBrandGame", false);
        this.f282286W0 = getIntent().getBooleanExtra("isFromAppBrandWebView", false);
        this.f282291Z = getIntent().getBooleanExtra("forBidForward", false);
        this.f282306i = getIntent().getBooleanExtra("isFromWebView", false);
        this.f282308j = getIntent().getIntExtra("webViewId", 0);
        this.f282324s = getIntent().getBooleanExtra("showmenu", true);
        getIntent().getBooleanExtra("isFromSimilarImg", false);
        getIntent().getBooleanExtra("isOfficialAccountImg", false);
        this.f282313n = getIntent().getBooleanExtra("isOuntLink", false);
        this.f282315o = getIntent().getStringExtra("IsFromWebViewReffer");
        this.f282334x = getIntent().getBooleanExtra("shouldShowScanQrCodeMenu", false);
        this.f282265H = getIntent().getBooleanExtra("shouldRunDragAnimation", false);
        this.f282259B = getIntent().getIntExtra("scanQrCodeGetA8KeyScene", 40);
        int[] intArrayExtra = getIntent().getIntArrayExtra("scanCodeTypes");
        this.f282328u = getIntent().getIntExtra("KScene", 0);
        this.f282330v = ((C65873e) C86312j.m106911c(C65873e.class)).vk0(67);
        this.f282297d1 = getIntent().getIntExtra("BottomSheetStyle", 1);
        this.f282299e1 = getIntent().getBooleanExtra("ShowIndicator", true);
        if (intArrayExtra != null && intArrayExtra.length > 0) {
            for (int valueOf : intArrayExtra) {
                ((HashSet) this.f282260C).add(Integer.valueOf(valueOf));
            }
        }
        int[] intArrayExtra2 = getIntent().getIntArrayExtra("scanResultCodeTypes");
        if (intArrayExtra2 != null && intArrayExtra2.length > 0) {
            for (int valueOf2 : intArrayExtra2) {
                ((HashSet) this.f282261D).add(Integer.valueOf(valueOf2));
            }
        }
        this.f282285W = new GestureGalleryTransAndOcrLogic(this, this, this, this, this.f282313n);
        this.f282317p = getIntent().getStringExtra("cookie");
        Log.m105919d("MicroMsg.GestureGalleryUI", "isFromWebView: %b, isFromWebViewReffer:%s, cookie = %s, forbidForward=%b", Boolean.valueOf(this.f282306i), this.f282315o, this.f282317p, Boolean.valueOf(this.f282291Z));
        C97613b2 b2Var = new C97613b2(this.f282306i, this.f282315o);
        this.f282304h = b2Var;
        Log.m105918d("MicroMsg.GetPicService", "addListener :" + hashCode());
        b2Var.f286375e = this;
        this.f282327t1.alive();
        this.f282329u1.alive();
        initView();
        this.f282323r1 = false;
        if (this.f282320q) {
            getWindow().setBackgroundDrawableResource(C0966R.C0969drawable.f357116be3);
        }
        this.f282281U = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(MMApplicationContext.getContext(), new C46900z.C46901a() {
            /* renamed from: a */
            public void mo64788a() {
                C77407n nVar = GestureGalleryUI.this.f282332w;
                if (nVar != null && nVar.mo107563h()) {
                    GestureGalleryUI.this.mo134469i8();
                }
                GestureGalleryUI.this.f282339z = null;
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.f3k);
        this.f282338y0 = relativeLayout;
        if (this.f282326t != null) {
            this.f282331v1 = findViewById(C0966R.C0970id.jys);
            this.f282338y0.setVisibility(0);
            ((TextView) findViewById(C0966R.C0970id.idr)).setTextSize(1, 12.0f);
            this.f282331v1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    try {
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        JSONObject optJSONObject = gestureGalleryUI.f282326t.optJSONObject(gestureGalleryUI.f282300f);
                        if (optJSONObject.optInt("jumpType", 0) == 9) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("feedId", optJSONObject.optString("feedId", ""));
                            jSONObject.put("extInfo", optJSONObject.optJSONObject("extInfo"));
                            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, optJSONObject.optString(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, ""));
                            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76781MY(MMApplicationContext.getContext(), jSONObject.toString(), (Intent) null);
                        } else if (optJSONObject.optInt("jumpType", 0) == 2) {
                            String optString = optJSONObject.optString("userName");
                            String optString2 = optJSONObject.optString("weappUrl");
                            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                            aVar.f9526a = optString;
                            aVar.f9527b = optString2;
                            startAppBrandUIFromOuterEvent.publish();
                        } else if (optJSONObject.optInt("jumpType", 0) == 3) {
                            String optString3 = optJSONObject.optString("jumpUrl");
                            Intent intent = new Intent();
                            intent.putExtra("rawUrl", optString3);
                            C88144b.m109791i(GestureGalleryUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        }
                        GestureGalleryUI.m123758K7(GestureGalleryUI.this, 5);
                    } catch (Exception unused) {
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            findViewById(C0966R.C0970id.f4z).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                    int i = GestureGalleryUI.f282257y1;
                    gestureGalleryUI.mo134469i8();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            findViewById(C0966R.C0970id.c9n).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    GestureGalleryUI.m123758K7(GestureGalleryUI.this, 4);
                    GestureGalleryUI.m123759L7(GestureGalleryUI.this);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            return;
        }
        relativeLayout.setVisibility(8);
    }

    public void onDestroy() {
        InputMethodManager inputMethodManager;
        super.onDestroy();
        C97613b2 b2Var = this.f282304h;
        b2Var.getClass();
        Log.m105918d("MicroMsg.GetPicService", "removeListener :" + hashCode());
        b2Var.f286375e = null;
        C97613b2 b2Var2 = this.f282304h;
        C97613b2.C97616b bVar = b2Var2.f286371a;
        if (bVar != null) {
            bVar.f286380d = true;
        }
        b2Var2.f286371a = null;
        this.f282327t1.dead();
        this.f282329u1.dead();
        this.f282301f1.dead();
        if (Build.VERSION.SDK_INT <= 22 && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null) {
            String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i = 0; i < 3; i++) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        if (((View) obj).getContext() != this) {
                            break;
                        }
                        declaredField.set(inputMethodManager, (Object) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = this.f282285W;
        if (gestureGalleryTransAndOcrLogic != null) {
            gestureGalleryTransAndOcrLogic.mo134453f();
            gestureGalleryTransAndOcrLogic.f282246k.removeAllUpdateListeners();
            gestureGalleryTransAndOcrLogic.f282248m.dead();
            gestureGalleryTransAndOcrLogic.mo134448a();
            C86709a0.m107529k().mo121129d(gestureGalleryTransAndOcrLogic.f282249n);
            gestureGalleryTransAndOcrLogic.f282236a = null;
            gestureGalleryTransAndOcrLogic.f282241f = null;
            gestureGalleryTransAndOcrLogic.f282240e = null;
            gestureGalleryTransAndOcrLogic.f282242g = null;
        }
        ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new ReleaseDealQBarStrEvent();
        releaseDealQBarStrEvent.f265057d.f265058a = this;
        releaseDealQBarStrEvent.publish();
        Log.m105924i("MicroMsg.GestureGalleryUI", "stopVideo");
        ImageAdapter.ViewHolder viewHolder = this.f282318p0;
        if (viewHolder != null) {
            viewHolder.f282392e.stopPlayback();
            this.f282282U0 = PlayerState.Stop;
            this.f282276R0.setIsPlay(false);
            this.f282276R0.setIplaySeekCallback((C102693c) null);
            this.f282318p0.f282393f.setVisibility(0);
            this.f282318p0.f282390c.setVisibility(0);
            this.f282318p0.f282392e.setVisibility(8);
        }
        mo134470j8();
    }

    public void onPause() {
        super.onPause();
        mo134465d8();
        getWindow().setFlags(2048, 2048);
        C103928o.m138642b();
    }

    public void onResume() {
        super.onResume();
        getWindow().clearFlags(2048);
        C103928o.m138641a(true, true, true);
    }

    public void onStart() {
        Bundle bundle = this.f282266I;
        if (!this.f282267J && this.f282265H) {
            this.f282267J = true;
            this.f282270M = getIntent().getIntExtra("img_gallery_top", 0);
            this.f282271N = getIntent().getIntExtra("img_gallery_left", 0);
            this.f282272P = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f282273Q = intExtra;
            this.f282268K.mo70410e(this.f282271N, this.f282270M, this.f282272P, intExtra);
            if (bundle == null) {
                this.f282298e.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        GestureGalleryUI.this.f282298e.getViewTreeObserver().removeOnPreDrawListener(this);
                        GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                        gestureGalleryUI.f282268K.mo70408c(gestureGalleryUI.f282298e, (View) null, (C45059m0.C45068i) null);
                        GestureGalleryUI gestureGalleryUI2 = GestureGalleryUI.this;
                        if (!gestureGalleryUI2.f282265H) {
                            return true;
                        }
                        gestureGalleryUI2.f282298e.setGalleryScaleListener(new MMGestureGallery.C19821c() {
                            /* renamed from: a */
                            public void mo26353a(float f, float f2) {
                                if (GestureGalleryUI.this.f282298e.getHeight() > 0) {
                                    float f3 = 1.0f;
                                    float height = 1.0f - (f2 / ((float) GestureGalleryUI.this.f282298e.getHeight()));
                                    if (height <= 1.0f) {
                                        f3 = height;
                                    }
                                    Log.m105919d("MicroMsg.GestureGalleryUI", "onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                                    GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                    gestureGalleryUI.f282316o1 = f3;
                                    View b = gestureGalleryUI.f282296d.mo134495b();
                                    if (b != null) {
                                        b.setPivotX((float) (GestureGalleryUI.this.f282298e.getWidth() / 2));
                                        b.setPivotY((float) (GestureGalleryUI.this.f282298e.getHeight() / 2));
                                        b.setScaleX(f3);
                                        b.setScaleY(f3);
                                        b.setTranslationX(f);
                                        b.setTranslationY(f2);
                                        GestureGalleryUI.this.f282275R.setAlpha(f3);
                                        return;
                                    }
                                    Log.m105918d("MicroMsg.GestureGalleryUI", "runDragAnimation contentView is null !!");
                                }
                            }

                            /* renamed from: b */
                            public void mo26354b(float f, float f2) {
                                GestureGalleryUI gestureGalleryUI = GestureGalleryUI.this;
                                gestureGalleryUI.f282319p1 = (int) f;
                                gestureGalleryUI.f282321q1 = (int) f2;
                            }
                        });
                        return true;
                    }
                });
            }
        }
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        if (this.f282339z != null) {
            CancelDealQBarStrEvent cancelDealQBarStrEvent = new CancelDealQBarStrEvent();
            CancelDealQBarStrEvent.C92466a aVar = cancelDealQBarStrEvent.f264642d;
            aVar.f264644b = this;
            aVar.f264643a = this.f282339z.f273113d;
            cancelDealQBarStrEvent.publish();
            this.f282339z = null;
        }
        this.f282337y.clear();
    }

    /* renamed from: w3 */
    public void mo86628w3(Object obj, Object obj2) {
        String str = (String) obj;
        C102690c cVar = (C102690c) obj2;
        int b = C30391y.m39057b(cVar.f303305a);
        boolean g = C30391y.m39062g(b);
        boolean f = C30391y.m39061f(cVar.f303305a);
        this.f282262E.put(str, Boolean.valueOf(g));
        this.f282263F.put(str, Boolean.valueOf(f));
        Log.m105925i("MicroMsg.GestureGalleryUI", "local translate, img %s, result %s, ratio %d, showTransEntrance %b, showOCREntrance %b", str, cVar.f303305a, Integer.valueOf(b), Boolean.valueOf(g), Boolean.valueOf(f));
    }
}
