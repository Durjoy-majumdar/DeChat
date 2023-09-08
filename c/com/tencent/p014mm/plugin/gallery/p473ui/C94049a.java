package com.tencent.p014mm.plugin.gallery.p473ui;

import a70.C112760b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.p136ui.widget.MMNumberCheckbox;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.C94057e;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import ew1.C97754e;
import gy3.C8480h;
import gy3.C87412m;
import hh2.C8532a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import kq3.C61143a;
import kq3.C99166b;
import nj3.C76879j;
import org.json.JSONObject;
import ow1.C100561b;
import ow1.a$$a;
import p1042u.C90590d;
import p156gj.C107835h0;
import p166hy.C98567o0;
import p182kk.C61104a;
import p206nj.C11171e;
import p447aw.C103918d;
import p910lj.C76701a;
import qo3.C77426q;
import qw1.C63341j;

/* renamed from: com.tencent.mm.plugin.gallery.ui.a */
public class C94049a extends RecyclerView.C16613e<RecyclerView.C16631z> implements C94057e {

    /* renamed from: A */
    public View.OnClickListener f271534A;

    /* renamed from: B */
    public String f271535B;

    /* renamed from: C */
    public long f271536C;

    /* renamed from: D */
    public C94055l f271537D;

    /* renamed from: E */
    public View.OnClickListener f271538E;

    /* renamed from: d */
    public int f271539d = 9;

    /* renamed from: e */
    public Context f271540e;

    /* renamed from: f */
    public ArrayList<GalleryItem$MediaItem> f271541f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<GalleryItem$MediaItem> f271542g = new ArrayList<>();

    /* renamed from: h */
    public C94057e.C94058a f271543h;

    /* renamed from: i */
    public SimpleDateFormat f271544i = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: j */
    public int f271545j;

    /* renamed from: n */
    public String f271546n;

    /* renamed from: o */
    public int f271547o = 10;

    /* renamed from: p */
    public boolean f271548p;

    /* renamed from: q */
    public String f271549q = "";

    /* renamed from: r */
    public LinkedList<C94054k> f271550r = new LinkedList<>();

    /* renamed from: s */
    public boolean f271551s;

    /* renamed from: t */
    public boolean f271552t;

    /* renamed from: u */
    public boolean f271553u;

    /* renamed from: v */
    public boolean f271554v;

    /* renamed from: w */
    public boolean f271555w;

    /* renamed from: x */
    public C99166b f271556x;

    /* renamed from: y */
    public GestureFoursquareRelativeLayout.C75077a f271557y;

    /* renamed from: z */
    public View.OnLongClickListener f271558z;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$a */
    public class C56815a implements C61143a {
        public C56815a() {
        }

        /* renamed from: a */
        public void mo80226a(int i, boolean z) {
            C97754e.C97756b.f286807a.f286806y.set(Boolean.TRUE);
            C94049a aVar = C94049a.this;
            if (aVar.f271555w) {
                z = !z;
            }
            GalleryItem$MediaItem g5 = aVar.mo129050g5(i);
            if (g5 == null || Util.isNullOrNil(g5.f162747d)) {
                Log.m105920e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
                aVar.notifyItemChanged(i);
            } else {
                Log.m105924i("MicroMsg.AlbumAdapter", "click image path:" + g5.f162747d);
                if (aVar.f271542g.contains(g5) != z) {
                    aVar.mo129046R5(i, g5, (View) null);
                }
            }
            C97754e.C97756b.f286807a.f286806y.set(Boolean.FALSE);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$c */
    public class C56816c implements View.OnLongClickListener {
        public C56816c() {
        }

        public boolean onLongClick(View view) {
            GalleryItem$MediaItem g5;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Object tag = view.getTag(C0966R.C0970id.fbj);
            if ((tag instanceof Integer) && (g5 = C94049a.this.mo129050g5(((Integer) tag).intValue())) != null) {
                ClipboardHelper.setText(C94049a.this.f271540e, "media info", g5.toString());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$d */
    public class C56817d implements View.OnClickListener {
        public C56817d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag(C0966R.C0970id.fbj);
            if (!(tag instanceof Integer)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int intValue = ((Integer) tag).intValue();
            GalleryItem$MediaItem g5 = C94049a.this.mo129050g5(intValue);
            if (g5 == null || Util.isNullOrNil(g5.f162747d)) {
                Log.m105920e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
                C94049a.this.notifyItemChanged(intValue);
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C94049a.this.mo129046R5(intValue, g5, view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$e */
    public class C56818e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f162819d;

        public C56818e(C94049a aVar, View view) {
            this.f162819d = view;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            View view = this.f162819d;
            if (view instanceof MMNumberCheckbox) {
                ((MMNumberCheckbox) view).setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$f */
    public class C56819f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f162820d;

        public C56819f(C94049a aVar, View view) {
            this.f162820d = view;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            View view = this.f162820d;
            if (view instanceof MMNumberCheckbox) {
                ((MMNumberCheckbox) view).setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$m */
    public static class C56820m implements Runnable {

        /* renamed from: h */
        public static HashMap<TextView, C56820m> f162821h = new HashMap<>();

        /* renamed from: d */
        public WeakReference<TextView> f162822d;

        /* renamed from: e */
        public GalleryItem$VideoMediaItem f162823e;

        /* renamed from: f */
        public C30066b f162824f;

        /* renamed from: g */
        public boolean f162825g;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.a$m$a */
        public class C30065a implements C30066b {
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.a$m$b */
        public interface C30066b {
        }

        public C56820m(TextView textView, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, C30066b bVar) {
            this.f162822d = new WeakReference<>(textView);
            this.f162823e = galleryItem$VideoMediaItem;
            this.f162824f = bVar;
        }

        /* renamed from: a */
        public static void m65511a(TextView textView, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
            C56820m mVar;
            if (textView == null || galleryItem$VideoMediaItem == null) {
                Log.m105920e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
                return;
            }
            if (f162821h.containsKey(textView) && (mVar = f162821h.get(textView)) != null) {
                if (!mVar.f162823e.equals(galleryItem$VideoMediaItem)) {
                    if (textView.equals(mVar.f162822d.get())) {
                        mVar.f162822d = new WeakReference<>((Object) null);
                        mVar.f162825g = true;
                    }
                } else {
                    return;
                }
            }
            int i = galleryItem$VideoMediaItem.f162766w;
            if (i >= 0) {
                Log.m105925i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", Integer.valueOf(i), galleryItem$VideoMediaItem);
                m65512c(textView, galleryItem$VideoMediaItem.f162766w);
                f162821h.remove(textView);
                return;
            }
            textView.setText("");
            C56820m mVar2 = new C56820m(textView, galleryItem$VideoMediaItem, new C30065a());
            C93958f.m118753m().mo128894b(mVar2);
            f162821h.put(textView, mVar2);
        }

        /* renamed from: c */
        public static void m65512c(TextView textView, int i) {
            if (textView != null) {
                if (i < 0) {
                    textView.setText("--:--");
                    return;
                }
                int round = Math.round(((float) i) / 1000.0f);
                String valueOf = String.valueOf(round % 60);
                if (valueOf.length() < 2) {
                    valueOf = "0" + valueOf;
                }
                textView.setText((round / 60) + XVFSFile.PATH_SEPARATOR + valueOf);
            }
        }

        /* renamed from: b */
        public final void mo80231b() {
            if (this.f162823e != null) {
                long currentTicks = Util.currentTicks();
                try {
                    String e = this.f162823e.mo80159e();
                    String simpleMp4InfoVFS = SightVideoJNI.getSimpleMp4InfoVFS(e);
                    Log.m105919d("MicroMsg.AlbumAdapter", "get simple mp4 info %s", simpleMp4InfoVFS);
                    JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
                    this.f162823e.f162766w = jSONObject.getInt("videoDuration");
                    this.f162823e.f162767x = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
                    this.f162823e.f162768y = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                    this.f162823e.f162769z = jSONObject.getInt("videoBitrate");
                    this.f162823e.f162762B = jSONObject.getInt("videoFPS");
                    this.f162823e.f162763C = SightVideoJNI.getMp4RotateVFS(e);
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f162823e;
                    galleryItem$VideoMediaItem.f162761A = 0;
                    galleryItem$VideoMediaItem.f162764u = C63341j.m74673a(jSONObject.getString("videoType"));
                    this.f162823e.f162765v = C63341j.m74673a(jSONObject.getString("audioType"));
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.AlbumAdapter", e2, "loadItemFromSimpleMP4Info fail", new Object[0]);
                }
                Log.m105919d("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info mediaItem: %s", this.f162823e);
                Log.m105925i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C56820m)) {
                return false;
            }
            return this.f162823e.equals(((C56820m) obj).f162823e);
        }

        public int hashCode() {
            return this.f162823e.hashCode();
        }

        /* JADX WARNING: Removed duplicated region for block: B:120:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0110  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r24 = this;
                r1 = r24
                java.lang.Class<h81.h> r2 = h81.C32735h.class
                boolean r0 = r1.f162825g
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f162823e
                java.lang.String r0 = r0.mo80159e()
                di3.d r3 = di3.C86312j.m106911c(r2)
                h81.h r3 = (h81.C32735h) r3
                h81.h$c r4 = h81.C32735h.C32737c.clicfg_album_device_configuration
                java.lang.String r5 = ""
                java.lang.String r3 = r3.Y60(r4, r5)
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                java.lang.String r6 = "MicroMsg.AlbumAdapter"
                r7 = 2
                r8 = 1
                r9 = 0
                if (r4 == 0) goto L_0x002a
                goto L_0x0108
            L_0x002a:
                java.lang.Object[] r4 = new java.lang.Object[r8]
                r4[r9] = r3
                java.lang.String r10 = "devices configuration: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r4)
                r4 = 4
                java.lang.Object[] r10 = new java.lang.Object[r4]
                int r11 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r9] = r11
                java.lang.String r11 = android.os.Build.MANUFACTURER
                r10[r8] = r11
                java.lang.String r11 = android.os.Build.BRAND
                r10[r7] = r11
                java.lang.String r11 = p156gj.C87203t.m108275k()
                r12 = 3
                r10[r12] = r11
                java.lang.String r11 = "android version: %s, manufacturer: %s, brand: %s, model: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0100 }
                r10.<init>(r3)     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r3 = "devices"
                java.lang.String r3 = r10.optString(r3)     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r11 = "maxsize"
                int r10 = r10.optInt(r11)     // Catch:{ JSONException -> 0x0100 }
                org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0100 }
                r11.<init>(r3)     // Catch:{ JSONException -> 0x0100 }
                r3 = 0
            L_0x0069:
                int r13 = r11.length()     // Catch:{ JSONException -> 0x0100 }
                if (r3 >= r13) goto L_0x0108
                org.json.JSONObject r13 = r11.optJSONObject(r3)     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r14 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r15 = "brand"
                java.lang.String r15 = r13.optString(r15)     // Catch:{ JSONException -> 0x0100 }
                boolean r15 = r14.equalsIgnoreCase(r15)     // Catch:{ JSONException -> 0x0100 }
                if (r15 == 0) goto L_0x00fa
                java.lang.String r15 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r4 = "model"
                java.lang.String r4 = r13.optString(r4)     // Catch:{ JSONException -> 0x0100 }
                boolean r4 = r15.equalsIgnoreCase(r4)     // Catch:{ JSONException -> 0x0100 }
                if (r4 == 0) goto L_0x00f9
                long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ JSONException -> 0x0100 }
                if (r10 == 0) goto L_0x00b8
                int r4 = r10 * 1024
                int r4 = r4 * 1024
                long r7 = (long) r4     // Catch:{ JSONException -> 0x0100 }
                int r4 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
                if (r4 <= 0) goto L_0x00b8
                java.lang.String r3 = "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s"
                java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ JSONException -> 0x0100 }
                java.lang.Long r7 = java.lang.Long.valueOf(r17)     // Catch:{ JSONException -> 0x0100 }
                r4[r9] = r7     // Catch:{ JSONException -> 0x0100 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0100 }
                r8 = 1
                r4[r8] = r7     // Catch:{ JSONException -> 0x0100 }
                r7 = 2
                r4[r7] = r0     // Catch:{ JSONException -> 0x0100 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r4)     // Catch:{ JSONException -> 0x0100 }
                goto L_0x0108
            L_0x00b8:
                java.lang.String r4 = "androidVersion"
                int r4 = r13.optInt(r4)     // Catch:{ JSONException -> 0x0100 }
                r7 = -1
                if (r7 != r4) goto L_0x00d7
                java.lang.String r0 = "hit devices all version, manufacturer: %s, brand: %s, model: %s"
                java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ JSONException -> 0x0100 }
                r3[r9] = r14     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r4 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x0100 }
                r7 = 1
                r3[r7] = r4     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r4 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x0100 }
                r7 = 2
                r3[r7] = r4     // Catch:{ JSONException -> 0x0100 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)     // Catch:{ JSONException -> 0x0100 }
                goto L_0x00f7
            L_0x00d7:
                int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0100 }
                if (r7 != r4) goto L_0x00f9
                java.lang.String r0 = "hit devices, version: %s, manufacturer: %s, brand: %s, model: %s"
                r4 = 4
                java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0100 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x0100 }
                r3[r9] = r4     // Catch:{ JSONException -> 0x0100 }
                r4 = 1
                r3[r4] = r14     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r4 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x0100 }
                r7 = 2
                r3[r7] = r4     // Catch:{ JSONException -> 0x0100 }
                java.lang.String r4 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x0100 }
                r3[r12] = r4     // Catch:{ JSONException -> 0x0100 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)     // Catch:{ JSONException -> 0x0100 }
            L_0x00f7:
                r0 = 1
                goto L_0x0109
            L_0x00f9:
                r4 = 4
            L_0x00fa:
                int r3 = r3 + 1
                r7 = 2
                r8 = 1
                goto L_0x0069
            L_0x0100:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r9]
                java.lang.String r4 = "parse json error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
            L_0x0108:
                r0 = 0
            L_0x0109:
                if (r0 == 0) goto L_0x0110
                r24.mo80231b()
                goto L_0x0295
            L_0x0110:
                di3.d r0 = di3.C86312j.m106911c(r2)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_album_get_video_info
                int r0 = r0.mo58779Qe(r2, r9)
                r2 = 1
                if (r0 != r2) goto L_0x0121
                r0 = 1
                goto L_0x0122
            L_0x0121:
                r0 = 0
            L_0x0122:
                if (r0 == 0) goto L_0x0129
                r24.mo80231b()
                goto L_0x0295
            L_0x0129:
                java.lang.String r0 = "frame-rate"
                java.lang.String r2 = "i-frame-interval"
                java.lang.String r3 = "bitrate"
                java.lang.String r4 = "width"
                java.lang.String r7 = "height"
                java.lang.String r8 = "durationUs"
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                oj.b r12 = new oj.b
                r12.<init>()
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r13 = r1.f162823e
                java.lang.String r13 = r13.mo80159e()
                r12.mo161392k(r13)     // Catch:{ Exception -> 0x026b }
                int r14 = r12.mo161385d()     // Catch:{ Exception -> 0x026b }
                r16 = 0
                r17 = r16
                r15 = 0
            L_0x0151:
                java.lang.String r9 = "mime"
                if (r15 >= r14) goto L_0x01ab
                r19 = r5
                android.media.MediaFormat r5 = r12.mo161386e(r15)     // Catch:{ Exception -> 0x026b }
                boolean r20 = r5.containsKey(r9)     // Catch:{ Exception -> 0x026b }
                if (r20 != 0) goto L_0x016b
                java.lang.String r5 = "find video mime : not found."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)     // Catch:{ Exception -> 0x026b }
                r22 = r10
                r20 = r14
                goto L_0x01a2
            L_0x016b:
                r20 = r14
                java.lang.String r14 = r5.getString(r9)     // Catch:{ Exception -> 0x026b }
                r21 = r5
                java.lang.String r5 = "find video mime : %s"
                r22 = r10
                r10 = 1
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0267 }
                r10 = 0
                r11[r10] = r14     // Catch:{ Exception -> 0x0267 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r11)     // Catch:{ Exception -> 0x0267 }
                if (r14 != 0) goto L_0x0183
                goto L_0x01a2
            L_0x0183:
                java.lang.String r5 = "video/"
                boolean r5 = r14.startsWith(r5)     // Catch:{ Exception -> 0x0267 }
                if (r5 == 0) goto L_0x0191
                if (r16 != 0) goto L_0x019d
                r16 = r21
                goto L_0x019d
            L_0x0191:
                java.lang.String r5 = "audio/"
                boolean r5 = r14.startsWith(r5)     // Catch:{ Exception -> 0x0267 }
                if (r5 == 0) goto L_0x019d
                if (r17 != 0) goto L_0x019d
                r17 = r21
            L_0x019d:
                if (r17 == 0) goto L_0x01a2
                if (r16 == 0) goto L_0x01a2
                goto L_0x01af
            L_0x01a2:
                int r15 = r15 + 1
                r5 = r19
                r14 = r20
                r10 = r22
                goto L_0x0151
            L_0x01ab:
                r19 = r5
                r22 = r10
            L_0x01af:
                r5 = r16
                r10 = r17
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r11 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                if (r11 == 0) goto L_0x0248
                if (r5 == 0) goto L_0x0235
                boolean r14 = r5.containsKey(r8)     // Catch:{ Exception -> 0x0267 }
                if (r14 != 0) goto L_0x01c1
                r8 = 0
                goto L_0x01ca
            L_0x01c1:
                long r14 = r5.getLong(r8)     // Catch:{ Exception -> 0x0267 }
                r16 = 1000(0x3e8, double:4.94E-321)
                long r14 = r14 / r16
                int r8 = (int) r14     // Catch:{ Exception -> 0x0267 }
            L_0x01ca:
                r11.f162766w = r8     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r8 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r11 = r5.containsKey(r7)     // Catch:{ Exception -> 0x0267 }
                if (r11 != 0) goto L_0x01d6
                r7 = 0
                goto L_0x01da
            L_0x01d6:
                int r7 = r5.getInteger(r7)     // Catch:{ Exception -> 0x0267 }
            L_0x01da:
                r8.f162767x = r7     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r7 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r8 = r5.containsKey(r4)     // Catch:{ Exception -> 0x0267 }
                if (r8 != 0) goto L_0x01e6
                r4 = 0
                goto L_0x01ea
            L_0x01e6:
                int r4 = r5.getInteger(r4)     // Catch:{ Exception -> 0x0267 }
            L_0x01ea:
                r7.f162768y = r4     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r4 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r7 = r5.containsKey(r9)     // Catch:{ Exception -> 0x0267 }
                if (r7 != 0) goto L_0x01f7
                r7 = r19
                goto L_0x01fb
            L_0x01f7:
                java.lang.String r7 = r5.getString(r9)     // Catch:{ Exception -> 0x0267 }
            L_0x01fb:
                r4.f162764u = r7     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r4 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r7 = r5.containsKey(r3)     // Catch:{ Exception -> 0x0267 }
                if (r7 != 0) goto L_0x0207
                r3 = 0
                goto L_0x020b
            L_0x0207:
                int r3 = r5.getInteger(r3)     // Catch:{ Exception -> 0x0267 }
            L_0x020b:
                r4.f162769z = r3     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r4 = r5.containsKey(r2)     // Catch:{ Exception -> 0x0267 }
                if (r4 != 0) goto L_0x0217
                r2 = 0
                goto L_0x021b
            L_0x0217:
                int r2 = r5.getInteger(r2)     // Catch:{ Exception -> 0x0267 }
            L_0x021b:
                r3.f162761A = r2     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r3 = r5.containsKey(r0)     // Catch:{ Exception -> 0x0267 }
                if (r3 != 0) goto L_0x0227
                r0 = 0
                goto L_0x022b
            L_0x0227:
                int r0 = r5.getInteger(r0)     // Catch:{ Exception -> 0x0267 }
            L_0x022b:
                r2.f162762B = r0     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                int r2 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r13)     // Catch:{ Exception -> 0x0267 }
                r0.f162763C = r2     // Catch:{ Exception -> 0x0267 }
            L_0x0235:
                if (r10 == 0) goto L_0x0248
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                boolean r2 = r10.containsKey(r9)     // Catch:{ Exception -> 0x0267 }
                if (r2 != 0) goto L_0x0242
                r2 = r19
                goto L_0x0246
            L_0x0242:
                java.lang.String r2 = r10.getString(r9)     // Catch:{ Exception -> 0x0267 }
            L_0x0246:
                r0.f162765v = r2     // Catch:{ Exception -> 0x0267 }
            L_0x0248:
                java.lang.String r0 = "loadItemFromExtractor mediaItem: %s"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0267 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f162823e     // Catch:{ Exception -> 0x0267 }
                r4 = 0
                r3[r4] = r2     // Catch:{ Exception -> 0x0267 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r3)     // Catch:{ Exception -> 0x0267 }
                java.lang.String r0 = "mediaItem format:%s, videoPath:%s"
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0267 }
                r3[r4] = r5     // Catch:{ Exception -> 0x0267 }
                r2 = 1
                r3[r2] = r13     // Catch:{ Exception -> 0x0267 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r3)     // Catch:{ Exception -> 0x0267 }
                r12.mo161388g()
                r4 = 1
                goto L_0x0283
            L_0x0267:
                r0 = move-exception
                goto L_0x026e
            L_0x0269:
                r0 = move-exception
                goto L_0x02cc
            L_0x026b:
                r0 = move-exception
                r22 = r10
            L_0x026e:
                java.lang.String r2 = "Video extractor init failed. video path = [%s] e = [%s]"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0269 }
                r4 = 0
                r3[r4] = r13     // Catch:{ all -> 0x0269 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0269 }
                r4 = 1
                r3[r4] = r0     // Catch:{ all -> 0x0269 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r3)     // Catch:{ all -> 0x0269 }
                r12.mo161388g()
            L_0x0283:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r22)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = "loadItemFromExtractor used %sms"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            L_0x0295:
                boolean r0 = r1.f162825g
                if (r0 == 0) goto L_0x029a
                goto L_0x02cb
            L_0x029a:
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                if (r0 != r2) goto L_0x02c3
                com.tencent.mm.plugin.gallery.ui.a$m$b r0 = r1.f162824f
                if (r0 == 0) goto L_0x02cb
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f162823e
                int r0 = r0.f162766w
                java.lang.ref.WeakReference<android.widget.TextView> r2 = r1.f162822d
                if (r2 != 0) goto L_0x02b1
                goto L_0x02cb
            L_0x02b1:
                java.lang.Object r2 = r2.get()
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r2 != 0) goto L_0x02ba
                goto L_0x02cb
            L_0x02ba:
                m65512c(r2, r0)
                java.util.HashMap<android.widget.TextView, com.tencent.mm.plugin.gallery.ui.a$m> r0 = f162821h
                r0.remove(r2)
                goto L_0x02cb
            L_0x02c3:
                com.tencent.mm.plugin.gallery.ui.c r0 = new com.tencent.mm.plugin.gallery.ui.c
                r0.<init>(r1)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            L_0x02cb:
                return
            L_0x02cc:
                r12.mo161388g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.C94049a.C56820m.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$b */
    public class C68996b implements GestureFoursquareRelativeLayout.C75077a {
        public C68996b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$g */
    public class C94050g implements View.OnClickListener {
        public C94050g() {
        }

        public void onClick(View view) {
            C94055l lVar;
            int i;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view2.getTag(C0966R.C0970id.fbj);
            int intValue = tag instanceof Integer ? ((Integer) tag).intValue() : -1;
            Object tag2 = view2.getTag(C0966R.C0970id.fc6);
            int intValue2 = tag2 instanceof Integer ? ((Integer) tag2).intValue() : -1;
            if (!(intValue == -1 || intValue2 == -1 || (lVar = C94049a.this.f271537D) == null)) {
                AlbumPreviewUI.C93994l lVar2 = (AlbumPreviewUI.C93994l) lVar;
                boolean z = true;
                if (intValue2 == 0) {
                    AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
                    Class cls = C98567o0.class;
                    Boolean bool = Boolean.TRUE;
                    Log.m105919d("MicroMsg.AlbumPreviewUI", "on click open camera, valid click times[%d]", Integer.valueOf(albumPreviewUI.f271259Q));
                    if (albumPreviewUI.f271256M) {
                        Log.m105928w("MicroMsg.AlbumPreviewUI", "click open camera, but camera is opening");
                    } else {
                        albumPreviewUI.f271259Q++;
                        albumPreviewUI.f271256M = true;
                        int i2 = albumPreviewUI.f271274X0;
                        if (i2 == 2 || (i = albumPreviewUI.f271272W0) == 13) {
                            if (albumPreviewUI.getIntent().getBooleanExtra("record_video_force_sys_camera", false)) {
                                C96892t1.m124466f(albumPreviewUI.getContext(), albumPreviewUI.getIntent().getStringExtra("video_full_path"), 4372, albumPreviewUI.getIntent().getIntExtra("record_video_time_limit", 0), 0, albumPreviewUI.getIntent().getIntExtra("record_video_quality", 0), false);
                            } else if (albumPreviewUI.getIntent().getBooleanExtra("record_video_is_sight_capture", false)) {
                                if (((SightParams) albumPreviewUI.getIntent().getParcelableExtra("KEY_SIGHT_PARAMS")) == null) {
                                    Log.m105920e("MicroMsg.AlbumPreviewUI", "takeMMSight, sightParams == null");
                                }
                                if (albumPreviewUI.f271272W0 != 13) {
                                    C96892t1.m124467g(albumPreviewUI.getContext(), 4375, albumPreviewUI.getIntent(), 3, "", 1, "");
                                } else {
                                    RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
                                    recordConfigProvider.f272931s = bool;
                                    recordConfigProvider.f272933u = bool;
                                    recordConfigProvider.f272934v = Boolean.FALSE;
                                    recordConfigProvider.f272905F = 4;
                                    UICustomParam uICustomParam = new UICustomParam();
                                    ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
                                    ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                                    ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                                    ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                                    recordConfigProvider.f272927o = uICustomParam;
                                    if (albumPreviewUI.f271264S0) {
                                        C8532a.f27585a.mo9445d(albumPreviewUI.getContext(), 4378, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, recordConfigProvider, 0);
                                    } else {
                                        C96892t1.m124467g(albumPreviewUI.getContext(), 4375, albumPreviewUI.getIntent(), 4, "", 1, "");
                                    }
                                }
                            } else if (C107835h0.f322856m.f322908o != 1 || C61104a.m71651g(albumPreviewUI.getContext()) || C61104a.m71665u(albumPreviewUI.getContext()) || C61104a.m71649e(albumPreviewUI.getContext())) {
                                Log.m105920e("MicroMsg.AlbumPreviewUI", "Should not be here!?");
                            } else {
                                AppCompatActivity context = albumPreviewUI.getContext();
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                intent.putExtra("android.intent.extra.videoQuality", 0);
                                if (C11171e.m11046c(8)) {
                                    intent.putExtra("android.intent.extra.durationLimit", 30);
                                    intent.putExtra("android.intent.extra.sizeLimit", 10485760);
                                }
                                try {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(4372);
                                    aVar.mo10233c(intent);
                                    C117292a.m165364j(context, aVar.mo10232b(), "com/tencent/mm/compatible/video/TakeVideoUtil", "takeVideoFromSys", "(Landroid/app/Activity;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                                } catch (ActivityNotFoundException e) {
                                    Log.printErrStackTrace("MicroMsg.TakeVideoUtil", e, "", new Object[0]);
                                }
                            }
                        } else if (i == 32) {
                            albumPreviewUI.mo79063S7();
                        } else if (i2 == 1 || i2 == 3) {
                            Uri n = C116299g2.m163858n(C112760b.m154240l());
                            String path = n.getPath();
                            if (path != null) {
                                String k = C116299g2.m163855k(path, false, false);
                                if (!n.getPath().equals(k)) {
                                    n = n.buildUpon().path(k).build();
                                }
                            }
                            C116281f0 f0Var = C116281f0.C116289i.f348994a;
                            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                                if (!(!l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b))) {
                                    C76701a.makeText((Context) albumPreviewUI.getContext(), (CharSequence) albumPreviewUI.getString(C0966R.string.f360831f52), 1).show();
                                }
                            }
                            if (!((C98567o0) C86312j.m106911c(cls)).gj0() || albumPreviewUI.f271272W0 != 4) {
                                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(albumPreviewUI.getContext(), "android.permission.CAMERA", 16, "", "");
                                Log.m105925i("MicroMsg.AlbumPreviewUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), albumPreviewUI.getContext());
                                if (z1) {
                                    albumPreviewUI.mo128956c8();
                                }
                            } else if (albumPreviewUI.f271290h.mo129049g0() >= albumPreviewUI.f271257N) {
                                albumPreviewUI.f271256M = false;
                                Resources resources = albumPreviewUI.getResources();
                                int i3 = albumPreviewUI.f271257N;
                                C76879j.m92726T(albumPreviewUI, resources.getQuantityString(C0966R.plurals.f7234p, i3, new Object[]{Integer.valueOf(i3)}));
                            } else {
                                C98567o0 o0Var = (C98567o0) C86312j.m106911c(cls);
                                if (albumPreviewUI.f271290h.mo129049g0() > 0 || 9 != albumPreviewUI.f271257N) {
                                    z = false;
                                }
                                o0Var.fb0(albumPreviewUI, z);
                            }
                        }
                    }
                } else if (intValue2 == 1) {
                    AlbumPreviewUI.this.mo77421U7(intValue, view2, intValue2);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$h */
    public static class C94051h extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f271560A;

        /* renamed from: B */
        public ImageView f271561B;

        /* renamed from: C */
        public TextView f271562C;

        /* renamed from: D */
        public ImageView f271563D;

        /* renamed from: E */
        public TextView f271564E;

        /* renamed from: F */
        public MMNumberCheckbox f271565F;

        /* renamed from: G */
        public GestureFoursquareRelativeLayout f271566G;

        /* renamed from: H */
        public View f271567H;

        /* renamed from: z */
        public ImageView f271568z;

        public C94051h(View view) {
            super(view);
            this.f271566G = (GestureFoursquareRelativeLayout) view;
            this.f271568z = (ImageView) view.findViewById(C0966R.C0970id.gqq);
            this.f271560A = (ImageView) view.findViewById(C0966R.C0970id.gqe);
            this.f271561B = (ImageView) view.findViewById(C0966R.C0970id.kzf);
            this.f271562C = (TextView) view.findViewById(C0966R.C0970id.kzh);
            this.f271565F = (MMNumberCheckbox) view.findViewById(C0966R.C0970id.gpy);
            this.f271563D = (ImageView) view.findViewById(C0966R.C0970id.c78);
            this.f271564E = (TextView) view.findViewById(C0966R.C0970id.f357872ly3);
            this.f271567H = view.findViewById(C0966R.C0970id.kzd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$i */
    public static class C94052i extends C94054k {
        public C94052i(int i) {
            this.f271570a = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$j */
    public static class C94053j extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f271569z;

        public C94053j(View view) {
            super(view);
            this.f271569z = (TextView) view.findViewById(C0966R.C0970id.gqq);
            if (C93958f.m118750j().f271196f == 4) {
                this.f271569z.setText(C0966R.string.f6u);
            } else if (C93958f.m118750j().f271197g == 2 || C93958f.m118750j().f271196f == 13) {
                this.f271569z.setText(C0966R.string.f6w);
            } else if (C93958f.m118750j().f271197g == 1) {
                this.f271569z.setText(C0966R.string.f6v);
            } else if (C93958f.m118750j().f271197g == 3) {
                this.f271569z.setText(C0966R.string.f6u);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$k */
    public static abstract class C94054k {

        /* renamed from: a */
        public int f271570a;
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.a$l */
    public interface C94055l {
    }

    public C94049a(boolean z, Context context, C94057e.C94058a aVar) {
        this.f271551s = false;
        this.f271553u = false;
        this.f271554v = false;
        this.f271555w = false;
        C56815a aVar2 = new C56815a();
        this.f271557y = new C68996b();
        this.f271558z = new C56816c();
        this.f271534A = new C56817d();
        this.f271538E = new C94050g();
        this.f271540e = context;
        this.f271543h = aVar;
        this.f271552t = z;
        C99166b.C99167a aVar3 = C99166b.f290778E;
        C87412m.m108594g(context, "context");
        C99166b bVar = new C99166b(context, aVar2, (C8480h) null);
        bVar.f290787g = context.getResources().getDimensionPixelSize(C0966R.dimen.f3710c3);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3721of);
        bVar.f290788h = -dimensionPixelSize;
        bVar.f290789i = dimensionPixelSize;
        context.getResources().getDimensionPixelSize(C0966R.dimen.f3722cc);
        this.f271556x = bVar;
        for (int i = 0; i < 32; i++) {
            this.f271541f.add(new GalleryItem$ImageMediaItem());
        }
        notifyDataSetChanged();
    }

    /* renamed from: F4 */
    public static void m118872F4(C94049a aVar, View view) {
        aVar.getClass();
        Object tag = view.getTag(C0966R.C0970id.fbj);
        if (tag instanceof Integer) {
            int intValue = ((Integer) tag).intValue();
            aVar.f271555w = aVar.f271542g.contains(aVar.mo129050g5(intValue));
            C99166b bVar = aVar.f271556x;
            if (bVar.f290795r) {
                C99166b.C99167a.m129188a(C99166b.f290778E, "Drag selection is already active.");
                return;
            }
            bVar.f290793p = -1;
            bVar.f290797t = -1;
            bVar.f290798u = -1;
            bVar.f290785e.removeCallbacks(bVar.f290786f);
            bVar.mo138533a(false);
            bVar.f290803z = false;
            bVar.f290780A = false;
            bVar.f290784d.getClass();
            ((C56815a) bVar.f290784d).mo80226a(intValue, true);
            bVar.f290795r = true;
            bVar.f290794q = intValue;
            bVar.f290793p = intValue;
            C99166b.C99167a aVar2 = C99166b.f290778E;
            C99166b.C99167a.m129188a(aVar2, "Drag selection initialized, starting at index " + intValue + '.');
        }
    }

    /* renamed from: G4 */
    public int mo129039G4() {
        return this.f271550r.size();
    }

    /* renamed from: I */
    public void mo129040I(int i) {
        this.f271545j = i;
    }

    /* renamed from: N5 */
    public void mo129041N5(C90590d<Integer> dVar) {
        for (int i = 0; i < this.f271542g.size(); i++) {
            int indexOf = this.f271541f.indexOf(this.f271542g.get(i));
            if (indexOf != -1) {
                dVar.add(Integer.valueOf(indexOf));
            }
        }
        Iterator<Integer> it = dVar.iterator();
        while (it.hasNext()) {
            notifyItemChanged(it.next().intValue() + mo129039G4());
        }
    }

    /* renamed from: O4 */
    public String mo129042O4(int i) {
        if (i < this.f271550r.size()) {
            Log.m105919d("MicroMsg.AlbumAdapter", "header, old pos[%d].", Integer.valueOf(i));
            i = this.f271550r.size();
        }
        GalleryItem$MediaItem g5 = mo129050g5(i);
        if (g5 == null) {
            return "";
        }
        if (!Util.isNullOrNil(g5.f162758r)) {
            return g5.f162758r;
        }
        return C74763a.m89510e().mo103936d(new Date(g5.f162752i), this.f271540e);
    }

    /* renamed from: O5 */
    public void mo129043O5(GalleryItem$MediaItem galleryItem$MediaItem) {
        if (this.f271542g.contains(galleryItem$MediaItem)) {
            ArrayList arrayList = new ArrayList();
            for (int indexOf = this.f271542g.indexOf(galleryItem$MediaItem); indexOf < this.f271542g.size(); indexOf++) {
                int indexOf2 = this.f271541f.indexOf(this.f271542g.get(indexOf));
                if (indexOf2 != -1) {
                    arrayList.add(Integer.valueOf(indexOf2));
                }
            }
            this.f271542g.remove(galleryItem$MediaItem);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                notifyItemChanged(((Integer) it.next()).intValue() + mo129039G4());
            }
        }
    }

    /* renamed from: P5 */
    public void mo129044P5(ArrayList<String> arrayList, List<GalleryItem$MediaItem> list) {
        Log.m105919d("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s].", this.f271542g);
        this.f271542g.clear();
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(0, 0, next, "", "");
                if (list != null) {
                    int indexOf = list.indexOf(c);
                    if (indexOf >= 0) {
                        this.f271542g.add(list.get(indexOf));
                    } else {
                        String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(next);
                        Log.m105918d("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
                        if (next.toLowerCase().endsWith("mp4")) {
                            this.f271542g.add(GalleryItem$MediaItem.m65488c(2, 0, next, "", ""));
                        } else {
                            ArrayList<GalleryItem$MediaItem> arrayList2 = this.f271542g;
                            if (Util.isNullOrNil(mimeTypeByFilePath)) {
                                mimeTypeByFilePath = "";
                            }
                            arrayList2.add(GalleryItem$MediaItem.m65488c(1, 0, next, "", mimeTypeByFilePath));
                        }
                    }
                }
            }
        }
        Log.m105919d("MicroMsg.AlbumAdapter", "after set selected paths, selected[%s].", this.f271542g);
    }

    /* renamed from: Q5 */
    public final void mo129045Q5(String str) {
        C77426q qVar = new C77426q(this.f271540e);
        qVar.mo107606r(str);
        qVar.mo107602n(this.f271540e.getString(C0966R.string.f5b));
        qVar.mo107600l(new a$$a());
        qVar.mo107603o();
        if (this.f271554v) {
            MMHandlerThread.postToMainThreadDelayed(new C100561b(this), 200);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b8, code lost:
        if (r2 != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032a, code lost:
        if (((r4 != null ? r4.f162766w : 0) / 1000) > r3) goto L_0x032c;
     */
    /* renamed from: R5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo129046R5(int r20, com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r21, android.view.View r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<bq.z0> r4 = p008bq.C92293z0.class
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "click image path:"
            r6.append(r7)
            java.lang.String r7 = r1.f162747d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.AlbumAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r0.f271542g
            boolean r6 = r6.contains(r1)
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r6 == 0) goto L_0x003d
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            int r2 = r2.indexOf(r1)
            r0.mo129043O5(r1)
            r1 = 0
            r3 = 1
            goto L_0x0377
        L_0x003d:
            com.tencent.mm.plugin.gallery.model.n r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r6 = r6.f271196f
            java.lang.String r12 = "image/gif"
            if (r6 != r8) goto L_0x00cd
            java.lang.String r6 = r1.f162755o
            boolean r6 = r6.equalsIgnoreCase(r12)
            if (r6 == 0) goto L_0x00cd
            di3.d r6 = di3.C86312j.m106911c(r4)
            bq.z0 r6 = (p008bq.C92293z0) r6
            java.lang.String r13 = r1.f162747d
            boolean r6 = r6.mo126039l1(r13)
            if (r6 != 0) goto L_0x00cd
            java.lang.String r1 = r1.f162747d
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r3 = 13459(0x3493, float:1.886E-41)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = ","
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = ",,0"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            qw1.C101316l.m132914m(r3, r4)
            boolean r3 = hd0.C98429r0.m127830u()
            if (r3 == 0) goto L_0x00aa
            int r3 = p645pj.C77092c.m93039a()
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00aa
            android.content.Context r3 = r0.f271540e
            r4 = 2131830564(0x7f112724, float:1.9294129E38)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            int r6 = p645pj.C77092c.m93039a()
            long r6 = (long) r6
            java.lang.String r6 = qw1.C101316l.m132906e(r6)
            r5[r11] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            r0.mo129045Q5(r3)
            goto L_0x00b6
        L_0x00aa:
            android.content.Context r3 = r0.f271540e
            r4 = 2131830637(0x7f11276d, float:1.9294277E38)
            java.lang.String r4 = r3.getString(r4)
            nj3.C76879j.m92726T(r3, r4)
        L_0x00b6:
            com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct
            r3.<init>()
            r4 = 4
            r3.f266442e = r4
            r3.f266443f = r1
            java.lang.String r1 = r0.f271549q
            r3.mo126631s(r1)
            r3.mo86054n()
            r19.notifyItemChanged(r20)
            return
        L_0x00cd:
            boolean r6 = r0.f271551s
            if (r6 == 0) goto L_0x0109
            com.tencent.mm.plugin.gallery.model.n r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r6 = r6.f271196f
            r13 = 16
            if (r6 != r13) goto L_0x0109
            int r6 = r0.f271545j
            if (r6 == r9) goto L_0x00e1
            if (r6 != r8) goto L_0x0109
        L_0x00e1:
            int r6 = r19.mo129049g0()
            if (r6 <= 0) goto L_0x0109
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r0.f271542g
            java.lang.Object r6 = r6.get(r11)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r6
            int r6 = r6.getType()
            int r13 = r21.getType()
            if (r6 == r13) goto L_0x0109
            android.content.Context r1 = r0.f271540e
            r2 = 2131830608(0x7f112750, float:1.9294218E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r1, r2)
            r19.notifyItemChanged(r20)
            return
        L_0x0109:
            java.lang.String r6 = r0.f271546n
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0141
            java.lang.String r6 = r0.f271546n
            java.lang.String r13 = "album_business_byp"
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L_0x0141
            java.lang.String r6 = r1.f162755o
            boolean r6 = r6.equalsIgnoreCase(r12)
            if (r6 == 0) goto L_0x0141
            di3.d r4 = di3.C86312j.m106911c(r4)
            bq.z0 r4 = (p008bq.C92293z0) r4
            java.lang.String r6 = r1.f162747d
            boolean r4 = r4.mo126036N1(r6)
            if (r4 != 0) goto L_0x0141
            android.content.Context r1 = r0.f271540e
            r2 = 2131830605(0x7f11274d, float:1.9294212E38)
            java.lang.String r2 = r1.getString(r2)
            nj3.C76879j.m92726T(r1, r2)
            r19.notifyItemChanged(r20)
            return
        L_0x0141:
            int r4 = r0.f271545j
            r6 = -1
            if (r4 == r9) goto L_0x0148
            if (r4 != r8) goto L_0x0238
        L_0x0148:
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r4 == 0) goto L_0x0238
            com.tencent.mm.plugin.gallery.model.n r4 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r4 = r4.f271196f
            r12 = 25
            if (r4 != r12) goto L_0x01fb
            di3.d r4 = di3.C86312j.m106911c(r5)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android
            r14 = 300(0x12c, float:4.2E-43)
            int r4 = r4.mo58779Qe(r12, r14)
            di3.d r15 = di3.C86312j.m106911c(r3)
            ht1.t1 r15 = (ht1.C60200t1) r15
            ht1.z4 r15 = r15.mo76861l7()
            int r15 = r15.mo83778Y5()
            int r4 = java.lang.Math.max(r4, r15)
            long r8 = (long) r4
            di3.d r4 = di3.C86312j.m106911c(r5)
            h81.h r4 = (h81.C32735h) r4
            int r4 = r4.mo58779Qe(r12, r14)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.t1 r3 = (ht1.C60200t1) r3
            ht1.z4 r3 = r3.mo76861l7()
            int r3 = r3.mo83778Y5()
            int r3 = r3 + r6
            int r3 = java.lang.Math.max(r4, r3)
            long r3 = (long) r3
            r12 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r12 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r12
            int r14 = r12.f162766w
            xb0.h r16 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r16.mo142238c6()
            int r6 = r6.f267171i
            int r6 = r6 * 1000
            java.lang.String r15 = ""
            if (r14 >= r6) goto L_0x01d2
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2131830664(0x7f112788, float:1.9294332E38)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            xb0.h r6 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r6.mo142238c6()
            int r6 = r6.f267171i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r11] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            com.tencent.mm.plugin.gallery.ui.a$e r4 = new com.tencent.mm.plugin.gallery.ui.a$e
            r4.<init>(r0, r2)
            nj3.C76879j.m92713G(r1, r3, r15, r11, r4)
            return
        L_0x01d2:
            int r6 = r12.f162766w
            long r13 = (long) r6
            r17 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r17
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x01fb
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r5 = r1.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6[r11] = r3
            r3 = 2131830665(0x7f112789, float:1.9294334E38)
            java.lang.String r3 = r5.getString(r3, r6)
            com.tencent.mm.plugin.gallery.ui.a$f r4 = new com.tencent.mm.plugin.gallery.ui.a$f
            r4.<init>(r0, r2)
            nj3.C76879j.m92713G(r1, r3, r15, r11, r4)
            return
        L_0x01fb:
            java.lang.String r2 = r0.f271546n
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0238
            java.lang.String r2 = r0.f271546n
            java.lang.String r3 = "album_business_bubble_media_by_coordinate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0238
            r2 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            int r2 = r2.f162766w
            int r3 = r0.f271547o
            int r3 = r3 * 1000
            int r3 = r3 + 500
            if (r2 < r3) goto L_0x0238
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r2 = r1.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r4 = r0.f271547o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            r4 = 2131830665(0x7f112789, float:1.9294334E38)
            java.lang.String r2 = r2.getString(r4, r3)
            nj3.C76879j.m92726T(r1, r2)
            r19.notifyItemChanged(r20)
            return
        L_0x0238:
            boolean r2 = r0.f271553u
            if (r2 == 0) goto L_0x024c
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            boolean r3 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271089u
            if (r3 == 0) goto L_0x024a
            boolean r2 = r2.mo128850c()
            if (r2 == 0) goto L_0x024a
            r2 = 1
            goto L_0x0252
        L_0x024a:
            r2 = 0
            goto L_0x0252
        L_0x024c:
            fw1.c r2 = fw1.C98052c.f287486a
            boolean r2 = r2.mo137356b()
        L_0x0252:
            if (r2 != 0) goto L_0x02ba
            boolean r2 = r0.f271553u
            if (r2 == 0) goto L_0x02b7
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            java.lang.String r3 = "selectMediaList"
            gy3.C87412m.m108594g(r2, r3)
            boolean r3 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271089u
            if (r3 == 0) goto L_0x02b7
            int r3 = r2.size()
            if (r3 != r10) goto L_0x0276
            java.lang.Object r3 = sx3.C110818d0.m150914L(r2)
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r3 == 0) goto L_0x0276
            r3 = 1
            goto L_0x0277
        L_0x0276:
            r3 = 0
        L_0x0277:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x027e
            goto L_0x029c
        L_0x027e:
            java.util.Iterator r4 = r2.iterator()
        L_0x0282:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x029c
            java.lang.Object r6 = r4.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r6
            int r6 = r6.getType()
            r8 = 2
            if (r6 != r8) goto L_0x0297
            r6 = 1
            goto L_0x0298
        L_0x0297:
            r6 = 0
        L_0x0298:
            if (r6 == 0) goto L_0x0282
            r4 = 1
            goto L_0x029d
        L_0x029c:
            r4 = 0
        L_0x029d:
            r4 = r4 ^ r10
            if (r3 == 0) goto L_0x02a1
            goto L_0x02b5
        L_0x02a1:
            if (r4 == 0) goto L_0x02ac
            int r2 = r2.size()
            r3 = 9
            if (r2 != r3) goto L_0x02ac
            goto L_0x02b5
        L_0x02ac:
            if (r4 == 0) goto L_0x02b7
            int r2 = r21.getType()
            r3 = 2
            if (r2 != r3) goto L_0x02b7
        L_0x02b5:
            r2 = 1
            goto L_0x02b8
        L_0x02b7:
            r2 = 0
        L_0x02b8:
            if (r2 == 0) goto L_0x0357
        L_0x02ba:
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r2 == 0) goto L_0x0357
            boolean r3 = r0.f271553u
            if (r3 == 0) goto L_0x02ca
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            boolean r2 = r2.mo128849b(r1)
            goto L_0x0351
        L_0x02ca:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI> r3 = fw1.C98052c.f287489d
            r4 = 0
            if (r3 == 0) goto L_0x02d6
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r3 = (com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI) r3
            goto L_0x02d7
        L_0x02d6:
            r3 = r4
        L_0x02d7:
            fw1.a r6 = fw1.C98052c.f287487b
            if (r6 == 0) goto L_0x02e1
            boolean r8 = r6.f287475f
            if (r8 != r10) goto L_0x02e1
            r8 = 1
            goto L_0x02e2
        L_0x02e1:
            r8 = 0
        L_0x02e2:
            if (r8 == 0) goto L_0x0350
            if (r6 == 0) goto L_0x02ee
            boolean r6 = r6.mo137352a()
            if (r6 != r10) goto L_0x02ee
            r6 = 1
            goto L_0x02ef
        L_0x02ee:
            r6 = 0
        L_0x02ef:
            if (r6 == 0) goto L_0x0350
            if (r3 == 0) goto L_0x0350
            di3.d r3 = di3.C86312j.m106911c(r5)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_publish_template_media_total_duration_seconds
            r6 = 600(0x258, float:8.41E-43)
            int r3 = r3.mo58779Qe(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getPublishTemplateMediaTotalDurationLimitSeconds: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.SnsTemplateExptConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            int r5 = fw1.C98052c.f287492g
            int r5 = r5 / 1000
            if (r5 > r3) goto L_0x032c
            if (r2 == 0) goto L_0x0322
            r4 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r4
        L_0x0322:
            if (r4 == 0) goto L_0x0327
            int r2 = r4.f162766w
            goto L_0x0328
        L_0x0327:
            r2 = 0
        L_0x0328:
            int r2 = r2 / 1000
            if (r2 <= r3) goto L_0x0350
        L_0x032c:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131830582(0x7f112736, float:1.9294165E38)
            java.lang.Object[] r6 = new java.lang.Object[r10]
            float r3 = (float) r3
            r8 = 1114636288(0x42700000, float:60.0)
            float r3 = r3 / r8
            int r3 = iy3.C60641c.m70921b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r11] = r3
            java.lang.String r3 = r4.getString(r5, r6)
            nj3.C76879j.m92726T(r2, r3)
            r2 = 0
            goto L_0x0351
        L_0x0350:
            r2 = 1
        L_0x0351:
            if (r2 != 0) goto L_0x0357
            r19.notifyItemChanged(r20)
            return
        L_0x0357:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            int r2 = r2.size()
            int r3 = r0.f271539d
            if (r2 >= r3) goto L_0x0371
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            r2.add(r1)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r0.f271542g
            int r1 = r1.size()
            int r1 = r1 - r10
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x0374
        L_0x0371:
            r1 = 1
            r2 = -1
            r3 = 1
        L_0x0374:
            r19.notifyItemChanged(r20)
        L_0x0377:
            if (r1 != 0) goto L_0x0388
            com.tencent.mm.plugin.gallery.ui.e$a r1 = r0.f271543h
            if (r1 == 0) goto L_0x0432
            int r4 = r19.mo129049g0()
            r5 = r20
            r1.mo128709a(r4, r5, r2, r3)
            goto L_0x0432
        L_0x0388:
            int r1 = r0.f271545j
            if (r1 != r10) goto L_0x03a8
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131689486(0x7f0f000e, float:1.9007989E38)
            int r4 = r0.f271539d
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r11] = r6
            java.lang.String r2 = r2.getQuantityString(r3, r4, r5)
            nj3.C76879j.m92726T(r1, r2)
            goto L_0x0432
        L_0x03a8:
            r2 = 2
            if (r1 != r2) goto L_0x03c6
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131689489(0x7f0f0011, float:1.9007995E38)
            int r4 = r0.f271539d
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r11] = r6
            java.lang.String r2 = r2.getQuantityString(r3, r4, r5)
            nj3.C76879j.m92726T(r1, r2)
            goto L_0x0432
        L_0x03c6:
            android.content.Context r1 = r0.f271540e
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131689487(0x7f0f000f, float:1.900799E38)
            int r4 = r0.f271539d
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r11] = r6
            java.lang.String r2 = r2.getQuantityString(r3, r4, r5)
            boolean r3 = r0.f271554v
            if (r3 != 0) goto L_0x03e5
            nj3.C76879j.m92726T(r1, r2)
            goto L_0x0418
        L_0x03e5:
            java.lang.String r1 = r0.f271535B
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x040d
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.f271536C
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 500(0x1f4, double:2.47E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x040d
            java.lang.String r1 = "showTips hit return"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            r0.f271535B = r2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f271536C = r1
            goto L_0x0418
        L_0x040d:
            r0.mo129045Q5(r2)
            r0.f271535B = r2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f271536C = r1
        L_0x0418:
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271196f
            r2 = 3
            if (r1 != r2) goto L_0x0432
            com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct
            r1.<init>()
            r2 = 5
            r1.f266442e = r2
            java.lang.String r2 = r0.f271549q
            r1.mo126631s(r2)
            r1.mo86054n()
        L_0x0432:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.C94049a.mo129046R5(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, android.view.View):void");
    }

    /* renamed from: T2 */
    public ArrayList<GalleryItem$MediaItem> mo129047T2() {
        return this.f271542g;
    }

    public void clear() {
        this.f271541f.clear();
    }

    /* renamed from: g0 */
    public int mo129049g0() {
        return this.f271542g.size();
    }

    /* renamed from: g5 */
    public GalleryItem$MediaItem mo129050g5(int i) {
        if (i < this.f271550r.size()) {
            Log.m105925i("MicroMsg.AlbumAdapter", "get header, pos[%d]", Integer.valueOf(i));
            return null;
        }
        int size = i - this.f271550r.size();
        if (size < this.f271541f.size()) {
            return this.f271541f.get(size);
        }
        Log.m105929w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", Integer.valueOf(this.f271541f.size()), Integer.valueOf(size));
        return null;
    }

    public int getItemCount() {
        return this.f271550r.size() + this.f271541f.size();
    }

    public int getItemViewType(int i) {
        if (i < this.f271550r.size()) {
            return this.f271550r.get(i).f271570a;
        }
        return 1;
    }

    /* renamed from: m4 */
    public void mo129051m4(LinkedList<GalleryItem$MediaItem> linkedList) {
        clear();
        this.f271541f.addAll(linkedList);
        notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0409  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.gallery.p473ui.C94049a.C94053j
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 2131306685(0x7f0928bd, float:1.8231576E38)
            r7 = 2131306657(0x7f0928a1, float:1.823152E38)
            if (r3 == 0) goto L_0x002c
            android.view.View r3 = r1.f44854d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            r3.setTag(r7, r2)
            android.view.View r2 = r1.f44854d
            r2.setTag(r6, r5)
            android.view.View r1 = r1.f44854d
            android.view.View$OnClickListener r2 = r0.f271538E
            r1.setOnClickListener(r2)
            goto L_0x0427
        L_0x002c:
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.gallery.p473ui.C94049a.C94051h
            if (r3 == 0) goto L_0x0427
            android.view.View r3 = r1.f44854d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            r3.setTag(r7, r8)
            android.view.View r3 = r1.f44854d
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3.setTag(r6, r9)
            android.view.View r3 = r1.f44854d
            android.view.View$OnClickListener r6 = r0.f271538E
            r3.setOnClickListener(r6)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = r0.mo129050g5(r2)
            java.lang.String r6 = "MicroMsg.AlbumAdapter"
            if (r3 != 0) goto L_0x0058
            java.lang.String r1 = "get item failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            return
        L_0x0058:
            java.lang.String r11 = r3.mo80159e()
            java.lang.String r12 = r3.f162747d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r9 == 0) goto L_0x0079
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r9 == 0) goto L_0x0079
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            r1[r4] = r2
            java.lang.String r2 = "null or nil filepath, poi: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r1)
            return
        L_0x0079:
            com.tencent.mm.plugin.gallery.ui.a$h r1 = (com.tencent.p014mm.plugin.gallery.p473ui.C94049a.C94051h) r1
            com.tencent.mm.ui.widget.MMNumberCheckbox r9 = r1.f271565F
            java.lang.Integer r10 = java.lang.Integer.valueOf(r27)
            r9.setTag(r7, r10)
            com.tencent.mm.ui.widget.MMNumberCheckbox r7 = r1.f271565F
            android.view.View$OnClickListener r9 = r0.f271534A
            r7.setOnClickListener(r9)
            android.widget.ImageView r7 = r1.f271561B
            r7.setVisibility(r4)
            android.widget.TextView r7 = r1.f271562C
            r7.setVisibility(r4)
            android.widget.TextView r7 = r1.f271562C
            android.content.Context r9 = r0.f271540e
            r10 = 2131165591(0x7f070197, float:1.7945403E38)
            int r9 = kg3.C76577a.m92155f(r9, r10)
            float r9 = (float) r9
            r7.setTextSize(r4, r9)
            android.view.View r7 = r1.f271567H
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r9.mo10233c(r5)
            java.lang.Object[] r14 = r9.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/gallery/ui/AlbumAdapter"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r7
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r9.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/gallery/ui/AlbumAdapter"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.widget.ImageView r5 = r1.f271563D
            r7 = 8
            r5.setVisibility(r7)
            android.widget.TextView r5 = r1.f271564E
            r5.setVisibility(r7)
            com.tencent.mm.plugin.gallery.model.n r5 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r5 = r5.f271196f
            int r9 = r3.getType()
            r13 = 2
            r14 = 2131100959(0x7f06051f, float:1.7814314E38)
            r10 = 3
            if (r13 != r9) goto L_0x0183
            android.widget.ImageView r9 = r1.f271561B
            r13 = 2131757103(0x7f10082f, float:1.9145132E38)
            r9.setImageResource(r13)
            android.widget.TextView r9 = r1.f271562C
            r13 = r3
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r13 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r13
            com.tencent.p014mm.plugin.gallery.p473ui.C94049a.C56820m.m65511a(r9, r13)
            boolean r9 = hd0.C98429r0.m127830u()
            if (r9 == 0) goto L_0x0178
            boolean r9 = r0.f271548p
            if (r9 == 0) goto L_0x0178
            if (r5 != r10) goto L_0x0178
            java.lang.String r9 = r3.f162747d
            long r16 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            long r18 = qw1.C101316l.m132908g()
            int r9 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x0163
            android.widget.ImageView r9 = r1.f271563D
            r9.setVisibility(r4)
            android.widget.TextView r9 = r1.f271564E
            r9.setVisibility(r4)
            android.widget.TextView r9 = r1.f271564E
            android.content.Context r13 = r0.f271540e
            r10 = 2131830570(0x7f11272a, float:1.9294141E38)
            java.lang.Object[] r15 = new java.lang.Object[r8]
            long r18 = qw1.C101316l.m132908g()
            java.lang.String r18 = qw1.C101316l.m132906e(r18)
            r15[r4] = r18
            java.lang.String r10 = r13.getString(r10, r15)
            r9.setText(r10)
            android.widget.ImageView r9 = r1.f271560A
            r9.setBackgroundResource(r14)
            android.widget.ImageView r9 = r1.f271560A
            r9.setVisibility(r7)
            com.tencent.mm.ui.widget.MMNumberCheckbox r9 = r1.f271565F
            boolean r10 = r9.isChecked()
            r9.setEnabled(r10)
            goto L_0x019f
        L_0x0163:
            android.widget.TextView r9 = r1.f271564E
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r1.f271563D
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r1.f271560A
            r9.setVisibility(r4)
            com.tencent.mm.ui.widget.MMNumberCheckbox r9 = r1.f271565F
            r9.setEnabled(r8)
            goto L_0x019f
        L_0x0178:
            android.widget.TextView r9 = r1.f271564E
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r1.f271563D
            r9.setVisibility(r7)
            goto L_0x019f
        L_0x0183:
            java.lang.String r9 = r3.f162755o
            java.lang.String r10 = "edit"
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x01a1
            boolean r9 = r0.f271552t
            if (r9 != 0) goto L_0x01a1
            android.widget.ImageView r9 = r1.f271561B
            r10 = 2131756828(0x7f10071c, float:1.9144575E38)
            r9.setImageResource(r10)
            android.widget.TextView r9 = r1.f271562C
            r10 = 4
            r9.setVisibility(r10)
        L_0x019f:
            r15 = 4
            goto L_0x0208
        L_0x01a1:
            java.lang.String r9 = r3.f162755o
            java.lang.String r10 = "image/gif"
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x01ba
            android.widget.ImageView r9 = r1.f271561B
            r10 = 2131233260(0x7f0809ec, float:1.8082652E38)
            r9.setImageResource(r10)
            android.widget.TextView r9 = r1.f271562C
            r15 = 4
            r9.setVisibility(r15)
            goto L_0x0208
        L_0x01ba:
            r15 = 4
            android.widget.ImageView r9 = r1.f271561B
            r9.setVisibility(r15)
            android.widget.TextView r9 = r1.f271562C
            r9.setVisibility(r15)
            android.view.View r9 = r1.f271567H
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r10.mo10233c(r13)
            java.lang.Object[] r18 = r10.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/gallery/ui/AlbumAdapter"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r9
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r10 = r10.mo10231a(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r18 = "com/tencent/mm/plugin/gallery/ui/AlbumAdapter"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0208:
            int r9 = r3.getType()
            if (r9 != r8) goto L_0x0270
            boolean r9 = hd0.C98429r0.m127830u()
            if (r9 == 0) goto L_0x0270
            boolean r9 = r0.f271548p
            if (r9 == 0) goto L_0x0270
            r9 = 3
            if (r5 != r9) goto L_0x0270
            java.lang.String r9 = r3.f162747d
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            r17 = 26214400(0x1900000, double:1.29516345E-316)
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 <= 0) goto L_0x025c
            android.widget.ImageView r9 = r1.f271563D
            r9.setVisibility(r4)
            android.widget.TextView r9 = r1.f271564E
            r9.setVisibility(r4)
            android.widget.TextView r9 = r1.f271564E
            android.content.Context r10 = r0.f271540e
            r13 = 2131830569(0x7f112729, float:1.929414E38)
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r17 = qw1.C101316l.m132906e(r17)
            r15[r4] = r17
            java.lang.String r10 = r10.getString(r13, r15)
            r9.setText(r10)
            android.widget.ImageView r9 = r1.f271560A
            r9.setBackgroundResource(r14)
            android.widget.ImageView r9 = r1.f271560A
            r9.setVisibility(r7)
            com.tencent.mm.ui.widget.MMNumberCheckbox r7 = r1.f271565F
            boolean r9 = r7.isChecked()
            r7.setEnabled(r9)
            goto L_0x0270
        L_0x025c:
            android.widget.TextView r9 = r1.f271564E
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r1.f271563D
            r9.setVisibility(r7)
            android.widget.ImageView r7 = r1.f271560A
            r7.setVisibility(r4)
            com.tencent.mm.ui.widget.MMNumberCheckbox r7 = r1.f271565F
            r7.setEnabled(r8)
        L_0x0270:
            java.util.LinkedList<com.tencent.mm.plugin.gallery.ui.a$k> r7 = r0.f271550r
            int r7 = r7.size()
            int r2 = r2 - r7
            int r2 = r2 + r8
            java.text.SimpleDateFormat r7 = r0.f271544i
            java.util.Date r9 = new java.util.Date
            long r14 = r3.f162752i
            r9.<init>(r14)
            java.lang.String r7 = r7.format(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = ", "
            r9.append(r2)
            r9.append(r7)
            java.lang.String r2 = r9.toString()
            int r7 = r3.getType()
            r9 = 2
            if (r9 != r7) goto L_0x02bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r9 = r0.f271540e
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131821518(0x7f1103ce, float:1.9275781E38)
            java.lang.String r9 = r9.getString(r10)
            r7.append(r9)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            goto L_0x02d9
        L_0x02bd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r9 = r0.f271540e
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131821503(0x7f1103bf, float:1.9275751E38)
            java.lang.String r9 = r9.getString(r10)
            r7.append(r9)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x02d9:
            android.widget.ImageView r7 = r1.f271568z
            r7.setContentDescription(r2)
            r7 = 3
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r4] = r11
            r9[r8] = r12
            r14 = 2
            r9[r14] = r2
            java.lang.String r2 = "thumbFilePath: %s | origFilePath: %s | contentDescription %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r9)
            android.widget.ImageView r9 = r1.f271568z
            int r10 = r3.getType()
            long r13 = r3.f162751h
            long r7 = r3.f162752i
            r15 = -1
            r6 = 0
            r17 = 0
            r2 = 3
            r2 = 2
            r2 = 4
            r16 = r6
            r18 = r7
            ow1.C100562c0.m131592c(r9, r10, r11, r12, r13, r15, r16, r17, r18)
            com.tencent.mm.ui.widget.MMNumberCheckbox r6 = r1.f271565F
            r6.setVisibility(r4)
            if (r5 == 0) goto L_0x0332
            r6 = 5
            if (r6 == r5) goto L_0x0332
            r6 = 10
            if (r6 == r5) goto L_0x0332
            r6 = 11
            if (r6 == r5) goto L_0x0332
            r6 = 24
            if (r6 == r5) goto L_0x0332
            r6 = 31
            if (r5 == r6) goto L_0x0332
            r6 = 27
            if (r5 != r6) goto L_0x0325
            goto L_0x0332
        L_0x0325:
            r6 = 15
            if (r6 != r5) goto L_0x0337
            com.tencent.mm.ui.widget.MMNumberCheckbox r6 = r1.f271565F
            r7 = 2131233456(0x7f080ab0, float:1.808305E38)
            r6.setBackgroundResource(r7)
            goto L_0x0337
        L_0x0332:
            com.tencent.mm.ui.widget.MMNumberCheckbox r6 = r1.f271565F
            r6.setVisibility(r2)
        L_0x0337:
            boolean r6 = r0.f271551s
            r7 = 2131099922(0x7f060112, float:1.781221E38)
            if (r6 == 0) goto L_0x03c3
            r6 = 16
            if (r6 != r5) goto L_0x0388
            int r5 = r3.getType()
            r6 = 2
            if (r5 == r6) goto L_0x0350
            int r5 = r3.getType()
            r6 = 3
            if (r5 != r6) goto L_0x0388
        L_0x0350:
            int r5 = r0.f271539d
            r6 = 1
            if (r5 <= r6) goto L_0x0388
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setVisibility(r4)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x037a
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r0.f271542g
            int r3 = r4.indexOf(r3)
            int r3 = r3 + r6
            r2.setCheckedNumber(r3)
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setEnabled(r6)
            android.widget.ImageView r2 = r1.f271560A
            r2.setBackgroundResource(r7)
            goto L_0x03f0
        L_0x037a:
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setChecked(r4)
            android.widget.ImageView r2 = r1.f271560A
            r5 = 2131100959(0x7f06051f, float:1.7814314E38)
            r2.setBackgroundResource(r5)
            goto L_0x03f0
        L_0x0388:
            r5 = 2131100959(0x7f06051f, float:1.7814314E38)
            int r8 = r3.getType()
            r9 = 2
            if (r8 != r9) goto L_0x0398
            com.tencent.mm.ui.widget.MMNumberCheckbox r3 = r1.f271565F
            r3.setVisibility(r2)
            goto L_0x03f0
        L_0x0398:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x03b8
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r0.f271542g
            int r3 = r4.indexOf(r3)
            r4 = 1
            int r3 = r3 + r4
            r2.setCheckedNumber(r3)
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setEnabled(r4)
            android.widget.ImageView r2 = r1.f271560A
            r2.setBackgroundResource(r7)
            goto L_0x03f0
        L_0x03b8:
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setChecked(r4)
            android.widget.ImageView r2 = r1.f271560A
            r2.setBackgroundResource(r5)
            goto L_0x03f0
        L_0x03c3:
            r5 = 2131100959(0x7f06051f, float:1.7814314E38)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r0.f271542g
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x03e6
            com.tencent.mm.ui.widget.MMNumberCheckbox r4 = r1.f271565F
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r0.f271542g
            int r3 = r5.indexOf(r3)
            r2 = 1
            int r3 = r3 + r2
            r4.setCheckedNumber(r3)
            com.tencent.mm.ui.widget.MMNumberCheckbox r3 = r1.f271565F
            r3.setEnabled(r2)
            android.widget.ImageView r2 = r1.f271560A
            r2.setBackgroundResource(r7)
            goto L_0x03f0
        L_0x03e6:
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            r2.setChecked(r4)
            android.widget.ImageView r2 = r1.f271560A
            r2.setBackgroundResource(r5)
        L_0x03f0:
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0409
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            android.view.ViewParent r3 = r2.getParent()
            android.view.View r3 = (android.view.View) r3
            com.tencent.mm.plugin.gallery.ui.b r4 = new com.tencent.mm.plugin.gallery.ui.b
            r4.<init>(r1, r2, r3)
            r3.post(r4)
            goto L_0x0415
        L_0x0409:
            com.tencent.mm.ui.widget.MMNumberCheckbox r2 = r1.f271565F
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r3 = 0
            r2.setTouchDelegate(r3)
        L_0x0415:
            android.view.View r2 = r1.f44854d
            android.view.View$OnLongClickListener r3 = r0.f271558z
            r2.setOnLongClickListener(r3)
            boolean r2 = r0.f271554v
            if (r2 == 0) goto L_0x0427
            com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout r1 = r1.f271566G
            com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout$a r2 = r0.f271557y
            r1.setItemGestureListener(r2)
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.C94049a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 0 ? new C94051h(LayoutInflater.from(this.f271540e).inflate(C0966R.C0971layout.buv, viewGroup, false)) : new C94053j(LayoutInflater.from(this.f271540e).inflate(C0966R.C0971layout.f6672lg, viewGroup, false));
    }

    /* renamed from: t2 */
    public void mo129052t2(int i) {
        this.f271539d = i;
    }

    /* renamed from: u5 */
    public int mo129053u5() {
        return this.f271541f.size();
    }

    /* renamed from: w4 */
    public ArrayList<GalleryItem$MediaItem> mo129054w4() {
        return this.f271541f;
    }

    /* renamed from: w5 */
    public ArrayList<String> mo129055w5() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<GalleryItem$MediaItem> it = this.f271542g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f162747d);
        }
        return arrayList;
    }

    /* renamed from: y5 */
    public ArrayList<GalleryItem$MediaItem> mo129056y5(int i) {
        ArrayList<GalleryItem$MediaItem> arrayList = new ArrayList<>();
        Iterator<GalleryItem$MediaItem> it = this.f271541f.iterator();
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            if (next.getType() == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
