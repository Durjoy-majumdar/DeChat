package fe3;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNumberCheckbox;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$TimeMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONObject;
import ow1.C100562c0;
import p645pj.C77092c;
import p851es.C58800a;
import qw1.C101316l;
import qw1.C63341j;
import sx3.C110818d0;
import xb0.C102609h;
import z04.C112551y;
import z51.C39315g;
import zd3.C66788b;

/* renamed from: fe3.b */
public final class C58970b extends C66788b<RecyclerView.C16631z> {

    /* renamed from: d */
    public final FileSelectorUI f168738d;

    /* renamed from: e */
    public final C58972b f168739e;

    /* renamed from: f */
    public int f168740f = 9;

    /* renamed from: g */
    public ArrayList<GalleryItem$MediaItem> f168741g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<GalleryItem$MediaItem> f168742h = new ArrayList<>();

    /* renamed from: i */
    public int f168743i = 10;

    /* renamed from: j */
    public final SimpleDateFormat f168744j = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: n */
    public final View.OnLongClickListener f168745n = new C58979g(this);

    /* renamed from: o */
    public final View.OnClickListener f168746o = new C58980h(this);

    /* renamed from: p */
    public C58973c f168747p;

    /* renamed from: q */
    public final View.OnClickListener f168748q = new C58978f(this);

    /* renamed from: fe3.b$a */
    public static final class C58971a extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f168749A;

        /* renamed from: B */
        public ImageView f168750B;

        /* renamed from: C */
        public TextView f168751C;

        /* renamed from: D */
        public MMNumberCheckbox f168752D;

        /* renamed from: E */
        public TextView f168753E;

        /* renamed from: F */
        public TextView f168754F;

        /* renamed from: z */
        public ImageView f168755z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58971a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.gqq);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.media_thumb)");
            this.f168755z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.gqe);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.media_mask)");
            this.f168749A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.kzf);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.type_mask_iv)");
            this.f168750B = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.kzh);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.type_mask_tv)");
            this.f168751C = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.gpy);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.media_cbx)");
            this.f168752D = (MMNumberCheckbox) findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.f358730gq3);
            C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.media_desc_tv)");
            this.f168753E = (TextView) findViewById6;
            View findViewById7 = view.findViewById(C0966R.C0970id.gqp);
            C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.media_size_tv)");
            this.f168754F = (TextView) findViewById7;
        }
    }

    /* renamed from: fe3.b$b */
    public interface C58972b {
        /* renamed from: a */
        void mo84204a(int i, int i2, int i3, int i4);
    }

    /* renamed from: fe3.b$c */
    public interface C58973c {
        /* renamed from: a */
        void mo84205a(int i, View view, int i2);

        /* renamed from: b */
        void mo84206b(int i, boolean z);
    }

    /* renamed from: fe3.b$d */
    public static final class C58974d implements Runnable {

        /* renamed from: h */
        public static final C58975a f168756h = new C58975a((C8480h) null);

        /* renamed from: i */
        public static final HashMap<TextView, C58974d> f168757i = new HashMap<>();

        /* renamed from: d */
        public WeakReference<TextView> f168758d;

        /* renamed from: e */
        public final GalleryItem$VideoMediaItem f168759e;

        /* renamed from: f */
        public final C58976b f168760f;

        /* renamed from: g */
        public boolean f168761g;

        /* renamed from: fe3.b$d$a */
        public static final class C58975a {
            public C58975a(C8480h hVar) {
            }

            /* renamed from: a */
            public final void mo84211a(TextView textView, int i) {
                if (textView != null) {
                    if (i < 0) {
                        textView.setText("--:--");
                        return;
                    }
                    int round = Math.round(((float) i) / 1000.0f);
                    String valueOf = String.valueOf(round % 60);
                    if (valueOf.length() < 2) {
                        valueOf = '0' + valueOf;
                    }
                    textView.setText((round / 60) + XVFSFile.PATH_SEPARATOR_CHAR + valueOf);
                }
            }
        }

        /* renamed from: fe3.b$d$b */
        public interface C58976b {
            /* renamed from: a */
            void mo84212a(C58974d dVar, int i);
        }

        public C58974d(TextView textView, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, C58976b bVar, C8480h hVar) {
            this.f168758d = new WeakReference<>(textView);
            this.f168759e = galleryItem$VideoMediaItem;
            this.f168760f = bVar;
        }

        /* renamed from: a */
        public final void mo84207a() {
            if (this.f168759e != null) {
                long currentTicks = Util.currentTicks();
                try {
                    String e = this.f168759e.mo80159e();
                    C87412m.m108593f(e, "mediaItem.thumbPath");
                    String simpleMp4InfoVFS = SightVideoJNI.getSimpleMp4InfoVFS(e);
                    C87412m.m108593f(simpleMp4InfoVFS, "getSimpleMp4InfoVFS(path)");
                    Log.m105919d("MicroMsg.AlbumAdapter", "get simple mp4 info %s", simpleMp4InfoVFS);
                    JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
                    this.f168759e.f162766w = jSONObject.getInt("videoDuration");
                    this.f168759e.f162767x = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
                    this.f168759e.f162768y = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                    this.f168759e.f162769z = jSONObject.getInt("videoBitrate");
                    this.f168759e.f162762B = jSONObject.getInt("videoFPS");
                    this.f168759e.f162763C = SightVideoJNI.getMp4RotateVFS(e);
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f168759e;
                    galleryItem$VideoMediaItem.f162761A = 0;
                    galleryItem$VideoMediaItem.f162764u = C63341j.m74673a(jSONObject.getString("videoType"));
                    this.f168759e.f162765v = C63341j.m74673a(jSONObject.getString("audioType"));
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.AlbumAdapter", e2, "loadItemFromSimpleMP4Info fail", new Object[0]);
                }
                Log.m105919d("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info mediaItem: %s", this.f168759e);
                Log.m105925i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C58974d)) {
                return false;
            }
            return C87412m.m108589b(this.f168759e, ((C58974d) obj).f168759e);
        }

        public int hashCode() {
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f168759e;
            if (galleryItem$VideoMediaItem != null) {
                return galleryItem$VideoMediaItem.hashCode();
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a6, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a7, code lost:
            r21 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02aa, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ab, code lost:
            r9 = "MicroMsg.AlbumAdapter";
            r17 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ef, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01dc, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01dd, code lost:
            r21 = r12;
            r22 = r13;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x02a6 A[ExcHandler: all (th java.lang.Throwable), PHI: r12 
          PHI: (r12v2 oj.b) = (r12v0 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b) binds: [B:38:0x016a, B:43:0x017c, B:52:0x019c, B:53:?, B:47:0x018f, B:48:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x016a] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02de  */
        /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r1 = r23
                java.lang.Class<h81.h> r2 = h81.C32735h.class
                boolean r0 = r1.f168761g
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f168759e
                gy3.C87412m.m108591d(r0)
                java.lang.String r0 = r0.mo80159e()
                java.lang.String r3 = "mediaItem!!.thumbPath"
                gy3.C87412m.m108593f(r0, r3)
                di3.d r4 = di3.C86312j.m106911c(r2)
                h81.h r4 = (h81.C32735h) r4
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_album_device_configuration
                java.lang.String r6 = ""
                java.lang.String r4 = r4.Y60(r5, r6)
                java.lang.String r5 = "getService(IExptService:…device_configuration, \"\")"
                gy3.C87412m.m108593f(r4, r5)
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                java.lang.String r7 = "MicroMsg.AlbumAdapter"
                r8 = 2
                r9 = 1
                r10 = 0
                if (r5 == 0) goto L_0x0037
                goto L_0x0127
            L_0x0037:
                java.lang.Object[] r5 = new java.lang.Object[r9]
                r5[r10] = r4
                java.lang.String r11 = "devices configuration: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r5)
                r5 = 4
                java.lang.Object[] r11 = new java.lang.Object[r5]
                int r12 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r10] = r12
                java.lang.String r12 = android.os.Build.MANUFACTURER
                r11[r9] = r12
                java.lang.String r12 = android.os.Build.BRAND
                r11[r8] = r12
                java.lang.String r12 = p156gj.C87203t.m108275k()
                r13 = 3
                r11[r13] = r12
                java.lang.String r12 = "android version: %s, manufacturer: %s, brand: %s, model: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011c }
                r11.<init>(r4)     // Catch:{ JSONException -> 0x011c }
                java.lang.String r4 = "devices"
                java.lang.String r4 = r11.optString(r4)     // Catch:{ JSONException -> 0x011c }
                java.lang.String r12 = "`object`.optString(\"devices\")"
                gy3.C87412m.m108593f(r4, r12)     // Catch:{ JSONException -> 0x011c }
                java.lang.String r12 = "maxsize"
                int r11 = r11.optInt(r12)     // Catch:{ JSONException -> 0x011c }
                org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x011c }
                r12.<init>(r4)     // Catch:{ JSONException -> 0x011c }
                int r4 = r12.length()     // Catch:{ JSONException -> 0x011c }
                r14 = 0
            L_0x007f:
                if (r14 >= r4) goto L_0x0126
                org.json.JSONObject r15 = r12.optJSONObject(r14)     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = "array.optJSONObject(i)"
                gy3.C87412m.m108593f(r15, r5)     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x011c }
                java.lang.String r8 = "brand"
                java.lang.String r8 = r15.optString(r8)     // Catch:{ JSONException -> 0x011c }
                boolean r8 = z04.C112551y.m153809i(r5, r8, r9)     // Catch:{ JSONException -> 0x011c }
                if (r8 == 0) goto L_0x0113
                java.lang.String r8 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011c }
                java.lang.String r10 = "model"
                java.lang.String r10 = r15.optString(r10)     // Catch:{ JSONException -> 0x011c }
                boolean r8 = z04.C112551y.m153809i(r8, r10, r9)     // Catch:{ JSONException -> 0x011c }
                if (r8 == 0) goto L_0x0113
                long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ JSONException -> 0x011c }
                if (r11 == 0) goto L_0x00d0
                int r8 = r11 * 1024
                int r8 = r8 * 1024
                long r9 = (long) r8     // Catch:{ JSONException -> 0x011c }
                int r8 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x00d0
                java.lang.String r4 = "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s"
                java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x011c }
                java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ JSONException -> 0x011c }
                r9 = 0
                r5[r9] = r8     // Catch:{ JSONException -> 0x011c }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x011c }
                r9 = 1
                r5[r9] = r8     // Catch:{ JSONException -> 0x011c }
                r8 = 2
                r5[r8] = r0     // Catch:{ JSONException -> 0x011c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r5)     // Catch:{ JSONException -> 0x011c }
                goto L_0x0126
            L_0x00d0:
                java.lang.String r8 = "androidVersion"
                int r8 = r15.optInt(r8)     // Catch:{ JSONException -> 0x011c }
                r9 = -1
                if (r9 != r8) goto L_0x00f1
                java.lang.String r0 = "hit devices all version, manufacturer: %s, brand: %s, model: %s"
                java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x011c }
                r8 = 0
                r4[r8] = r5     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x011c }
                r8 = 1
                r4[r8] = r5     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011c }
                r8 = 2
                r4[r8] = r5     // Catch:{ JSONException -> 0x011c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)     // Catch:{ JSONException -> 0x011c }
            L_0x00ef:
                r10 = 1
                goto L_0x0127
            L_0x00f1:
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x011c }
                if (r9 != r8) goto L_0x0113
                java.lang.String r0 = "hit devices, version: %s, manufacturer: %s, brand: %s, model: %s"
                r8 = 4
                java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ JSONException -> 0x011c }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x011c }
                r9 = 0
                r4[r9] = r8     // Catch:{ JSONException -> 0x011c }
                r8 = 1
                r4[r8] = r5     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x011c }
                r8 = 2
                r4[r8] = r5     // Catch:{ JSONException -> 0x011c }
                java.lang.String r5 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011c }
                r4[r13] = r5     // Catch:{ JSONException -> 0x011c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)     // Catch:{ JSONException -> 0x011c }
                goto L_0x00ef
            L_0x0113:
                r8 = 4
                int r14 = r14 + 1
                r5 = 4
                r8 = 2
                r9 = 1
                r10 = 0
                goto L_0x007f
            L_0x011c:
                r0 = move-exception
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r4 = "parse json error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r5)
            L_0x0126:
                r10 = 0
            L_0x0127:
                if (r10 == 0) goto L_0x012e
                r23.mo84207a()
                goto L_0x02d9
            L_0x012e:
                di3.d r0 = di3.C86312j.m106911c(r2)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_album_get_video_info
                r4 = 0
                int r0 = r0.mo58779Qe(r2, r4)
                r2 = 1
                if (r0 != r2) goto L_0x0140
                r0 = 1
                goto L_0x0141
            L_0x0140:
                r0 = 0
            L_0x0141:
                if (r0 == 0) goto L_0x0148
                r23.mo84207a()
                goto L_0x02d9
            L_0x0148:
                java.lang.String r0 = "frame-rate"
                java.lang.String r2 = "i-frame-interval"
                java.lang.String r4 = "bitrate"
                java.lang.String r5 = "width"
                java.lang.String r8 = "height"
                java.lang.String r9 = "durationUs"
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                oj.b r12 = new oj.b
                r12.<init>()
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r13 = r1.f168759e
                gy3.C87412m.m108591d(r13)
                java.lang.String r13 = r13.mo80159e()
                gy3.C87412m.m108593f(r13, r3)
                r12.mo161392k(r13)     // Catch:{ Exception -> 0x02aa, all -> 0x02a6 }
                int r3 = r12.mo161385d()     // Catch:{ Exception -> 0x02aa, all -> 0x02a6 }
                r14 = 0
                r16 = r6
                r17 = r10
                r15 = r14
                r6 = 0
            L_0x0178:
                java.lang.String r10 = "mime"
                if (r6 >= r3) goto L_0x01e3
                android.media.MediaFormat r11 = r12.mo161386e(r6)     // Catch:{ Exception -> 0x01dc, all -> 0x02a6 }
                r19 = r3
                java.lang.String r3 = "extractor.getTrackFormat(i)"
                gy3.C87412m.m108593f(r11, r3)     // Catch:{ Exception -> 0x01dc, all -> 0x02a6 }
                boolean r3 = r11.containsKey(r10)     // Catch:{ Exception -> 0x01dc, all -> 0x02a6 }
                if (r3 != 0) goto L_0x019c
                java.lang.String r3 = "find video mime : not found."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r3)     // Catch:{ Exception -> 0x0198, all -> 0x02a6 }
                r21 = r12
                r22 = r13
                r12 = 0
                goto L_0x01d3
            L_0x0198:
                r0 = move-exception
                r9 = r7
                goto L_0x02ae
            L_0x019c:
                java.lang.String r3 = r11.getString(r10)     // Catch:{ Exception -> 0x01dc, all -> 0x02a6 }
                r20 = r11
                java.lang.String r11 = "find video mime : %s"
                r21 = r12
                r22 = r13
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x02a3 }
                r12 = 0
                r13[r12] = r3     // Catch:{ Exception -> 0x02a3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r13)     // Catch:{ Exception -> 0x02a3 }
                if (r3 != 0) goto L_0x01b4
                goto L_0x01d3
            L_0x01b4:
                java.lang.String r11 = "video/"
                boolean r11 = z04.C112551y.m153819s(r3, r11, r12)     // Catch:{ Exception -> 0x02a3 }
                if (r11 == 0) goto L_0x01c2
                if (r14 != 0) goto L_0x01ce
                r14 = r20
                goto L_0x01ce
            L_0x01c2:
                java.lang.String r11 = "audio/"
                boolean r3 = z04.C112551y.m153819s(r3, r11, r12)     // Catch:{ Exception -> 0x02a3 }
                if (r3 == 0) goto L_0x01ce
                if (r15 != 0) goto L_0x01ce
                r15 = r20
            L_0x01ce:
                if (r15 == 0) goto L_0x01d3
                if (r14 == 0) goto L_0x01d3
                goto L_0x01e7
            L_0x01d3:
                int r6 = r6 + 1
                r3 = r19
                r12 = r21
                r13 = r22
                goto L_0x0178
            L_0x01dc:
                r0 = move-exception
                r21 = r12
                r22 = r13
                goto L_0x02a4
            L_0x01e3:
                r21 = r12
                r22 = r13
            L_0x01e7:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a3 }
                if (r3 == 0) goto L_0x0281
                if (r14 == 0) goto L_0x026c
                boolean r6 = r14.containsKey(r9)     // Catch:{ Exception -> 0x02a3 }
                if (r6 != 0) goto L_0x01f6
                r9 = r7
                r6 = 0
                goto L_0x0200
            L_0x01f6:
                long r11 = r14.getLong(r9)     // Catch:{ Exception -> 0x02a3 }
                r6 = 1000(0x3e8, float:1.401E-42)
                r9 = r7
                long r6 = (long) r6
                long r11 = r11 / r6
                int r6 = (int) r11     // Catch:{ Exception -> 0x02a1 }
            L_0x0200:
                r3.f162766w = r6     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r6 = r14.containsKey(r8)     // Catch:{ Exception -> 0x02a1 }
                if (r6 != 0) goto L_0x020c
                r6 = 0
                goto L_0x0210
            L_0x020c:
                int r6 = r14.getInteger(r8)     // Catch:{ Exception -> 0x02a1 }
            L_0x0210:
                r3.f162767x = r6     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r6 = r14.containsKey(r5)     // Catch:{ Exception -> 0x02a1 }
                if (r6 != 0) goto L_0x021c
                r5 = 0
                goto L_0x0220
            L_0x021c:
                int r5 = r14.getInteger(r5)     // Catch:{ Exception -> 0x02a1 }
            L_0x0220:
                r3.f162768y = r5     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r5 = r14.containsKey(r10)     // Catch:{ Exception -> 0x02a1 }
                if (r5 != 0) goto L_0x022d
                r5 = r16
                goto L_0x0231
            L_0x022d:
                java.lang.String r5 = r14.getString(r10)     // Catch:{ Exception -> 0x02a1 }
            L_0x0231:
                r3.f162764u = r5     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r5 = r14.containsKey(r4)     // Catch:{ Exception -> 0x02a1 }
                if (r5 != 0) goto L_0x023d
                r4 = 0
                goto L_0x0241
            L_0x023d:
                int r4 = r14.getInteger(r4)     // Catch:{ Exception -> 0x02a1 }
            L_0x0241:
                r3.f162769z = r4     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r4 = r14.containsKey(r2)     // Catch:{ Exception -> 0x02a1 }
                if (r4 != 0) goto L_0x024d
                r2 = 0
                goto L_0x0251
            L_0x024d:
                int r2 = r14.getInteger(r2)     // Catch:{ Exception -> 0x02a1 }
            L_0x0251:
                r3.f162761A = r2     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r3 = r14.containsKey(r0)     // Catch:{ Exception -> 0x02a1 }
                if (r3 != 0) goto L_0x025d
                r0 = 0
                goto L_0x0261
            L_0x025d:
                int r0 = r14.getInteger(r0)     // Catch:{ Exception -> 0x02a1 }
            L_0x0261:
                r2.f162762B = r0     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                int r2 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r22)     // Catch:{ Exception -> 0x02a1 }
                r0.f162763C = r2     // Catch:{ Exception -> 0x02a1 }
                goto L_0x026d
            L_0x026c:
                r9 = r7
            L_0x026d:
                if (r15 == 0) goto L_0x0282
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                boolean r2 = r15.containsKey(r10)     // Catch:{ Exception -> 0x02a1 }
                if (r2 != 0) goto L_0x027a
                r6 = r16
                goto L_0x027e
            L_0x027a:
                java.lang.String r6 = r15.getString(r10)     // Catch:{ Exception -> 0x02a1 }
            L_0x027e:
                r0.f162765v = r6     // Catch:{ Exception -> 0x02a1 }
                goto L_0x0282
            L_0x0281:
                r9 = r7
            L_0x0282:
                java.lang.String r0 = "loadItemFromExtractor mediaItem: %s"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02a1 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f168759e     // Catch:{ Exception -> 0x02a1 }
                r4 = 0
                r3[r4] = r2     // Catch:{ Exception -> 0x02a1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r3)     // Catch:{ Exception -> 0x02a1 }
                java.lang.String r0 = "mediaItem format:%s, videoPath:%s"
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02a1 }
                r3[r4] = r14     // Catch:{ Exception -> 0x02a1 }
                r2 = 1
                r3[r2] = r22     // Catch:{ Exception -> 0x02a1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r3)     // Catch:{ Exception -> 0x02a1 }
                r21.mo161388g()
                r4 = 1
                goto L_0x02c7
            L_0x02a1:
                r0 = move-exception
                goto L_0x02b2
            L_0x02a3:
                r0 = move-exception
            L_0x02a4:
                r9 = r7
                goto L_0x02b2
            L_0x02a6:
                r0 = move-exception
                r21 = r12
                goto L_0x0305
            L_0x02aa:
                r0 = move-exception
                r9 = r7
                r17 = r10
            L_0x02ae:
                r21 = r12
                r22 = r13
            L_0x02b2:
                java.lang.String r2 = "Video extractor init failed. video path = [%s] e = [%s]"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0304 }
                r4 = 0
                r3[r4] = r22     // Catch:{ all -> 0x0304 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0304 }
                r4 = 1
                r3[r4] = r0     // Catch:{ all -> 0x0304 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r2, r3)     // Catch:{ all -> 0x0304 }
                r21.mo161388g()
            L_0x02c7:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = "loadItemFromExtractor used %sms"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            L_0x02d9:
                boolean r0 = r1.f168761g
                if (r0 == 0) goto L_0x02de
                goto L_0x0303
            L_0x02de:
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                boolean r0 = gy3.C87412m.m108589b(r0, r2)
                if (r0 == 0) goto L_0x02fb
                fe3.b$d$b r0 = r1.f168760f
                if (r0 == 0) goto L_0x0303
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f168759e
                gy3.C87412m.m108591d(r2)
                int r2 = r2.f162766w
                r0.mo84212a(r1, r2)
                goto L_0x0303
            L_0x02fb:
                fe3.d r0 = new fe3.d
                r0.<init>(r1)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            L_0x0303:
                return
            L_0x0304:
                r0 = move-exception
            L_0x0305:
                r21.mo161388g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fe3.C58970b.C58974d.run():void");
        }
    }

    /* renamed from: fe3.b$e */
    public static final class C58977e extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f168762z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58977e(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f358474fc2);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_title)");
            this.f168762z = (TextView) findViewById;
        }
    }

    /* renamed from: fe3.b$f */
    public static final class C58978f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58970b f168763d;

        public C58978f(C58970b bVar) {
            this.f168763d = bVar;
        }

        public final void onClick(View view) {
            C58973c cVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag(C0966R.C0970id.fbj);
            int intValue = tag instanceof Integer ? ((Number) tag).intValue() : -1;
            Object tag2 = view.getTag(C0966R.C0970id.fc6);
            int intValue2 = tag2 instanceof Integer ? ((Number) tag2).intValue() : -1;
            if (!(intValue == -1 || intValue2 == -1 || (cVar = this.f168763d.f168747p) == null || cVar == null)) {
                cVar.mo84205a(intValue, view, intValue2);
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fe3.b$g */
    public static final class C58979g implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58970b f168764d;

        public C58979g(C58970b bVar) {
            this.f168764d = bVar;
        }

        public boolean onLongClick(View view) {
            GalleryItem$MediaItem g5;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C87412m.m108594g(view, "v");
            Object tag = view.getTag(C0966R.C0970id.fbj);
            C87412m.m108593f(tag, "v.getTag(com.tencent.mm.…llery.R.id.item_position)");
            if ((tag instanceof Integer) && (g5 = this.f168764d.mo84200g5(((Number) tag).intValue())) != null) {
                ClipboardHelper.setText(this.f168764d.f168738d, "media info", g5.toString());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: fe3.b$h */
    public static final class C58980h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58970b f168765d;

        /* renamed from: fe3.b$h$a */
        public static final class C58981a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f168766d;

            public C58981a(View view) {
                this.f168766d = view;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C87412m.m108594g(dialogInterface, "dialog");
                View view = this.f168766d;
                if (view instanceof MMNumberCheckbox) {
                    ((MMNumberCheckbox) view).setChecked(false);
                }
            }
        }

        /* renamed from: fe3.b$h$b */
        public static final class C58982b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f168767d;

            public C58982b(View view) {
                this.f168767d = view;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C87412m.m108594g(dialogInterface, "dialog");
                View view = this.f168767d;
                if (view instanceof MMNumberCheckbox) {
                    ((MMNumberCheckbox) view).setChecked(false);
                }
            }
        }

        public C58980h(C58970b bVar) {
            this.f168765d = bVar;
        }

        public void onClick(View view) {
            boolean z;
            int i;
            int i2;
            int i3;
            GalleryItem$MediaItem galleryItem$MediaItem;
            boolean z2;
            int i4;
            int i5;
            View view2 = view;
            Class cls = C60200t1.class;
            Class cls2 = C32735h.class;
            Class cls3 = C39315g.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view2, "v");
            Object tag = view2.getTag(C0966R.C0970id.fbj);
            C87412m.m108593f(tag, "v.getTag(com.tencent.mm.…llery.R.id.item_position)");
            if (!(tag instanceof Integer)) {
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int intValue = ((Number) tag).intValue();
            GalleryItem$MediaItem g5 = this.f168765d.mo84200g5(intValue);
            if (g5 == null || Util.isNullOrNil(g5.f162747d)) {
                Log.m105920e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
                this.f168765d.notifyItemChanged(intValue);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("MicroMsg.AlbumAdapter", "click image path:" + g5.f162747d);
            if (this.f168765d.f168742h.contains(g5)) {
                i2 = this.f168765d.f168742h.indexOf(g5);
                this.f168765d.mo84203y5(g5);
                C58973c cVar = this.f168765d.f168747p;
                if (cVar != null) {
                    cVar.mo84206b(intValue, false);
                }
                i3 = intValue;
                i = 1;
                z = false;
            } else if (C93958f.m118750j().f271196f != 3 || !C112551y.m153809i(g5.f162755o, "image/gif", true) || ((C39315g) C86312j.m106911c(cls3)).getProvider().mo138026l1(g5.f162747d)) {
                this.f168765d.getClass();
                if (!Util.isNullOrNil((String) null)) {
                    this.f168765d.getClass();
                    if (C87412m.m108589b((Object) null, "album_business_byp") && C112551y.m153809i(g5.f162755o, "image/gif", true) && !((C39315g) C86312j.m106911c(cls3)).getProvider().mo138007N1(g5.f162747d)) {
                        FileSelectorUI fileSelectorUI = this.f168765d.f168738d;
                        C76879j.m92726T(fileSelectorUI, fileSelectorUI.getString(C0966R.string.f5e));
                        this.f168765d.notifyItemChanged(intValue);
                        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                long l = C86013q1.m106451l(g5.f162747d);
                long i6 = C77092c.m93047i();
                if (l > i6) {
                    FileSelectorUI fileSelectorUI2 = this.f168765d.f168738d;
                    C76912y0.makeText((Context) fileSelectorUI2, (CharSequence) fileSelectorUI2.getString(C0966R.string.cvh, new Object[]{Util.getSizeKB(i6)}), 0).show();
                    this.f168765d.notifyItemChanged(intValue);
                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (g5 instanceof GalleryItem$VideoMediaItem) {
                    if (C93958f.m118750j().f271196f == 25) {
                        this.f168765d.getClass();
                        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android;
                        int Qe = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(cVar2, 300);
                        int Y5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83778Y5();
                        if (Qe < Y5) {
                            Qe = Y5;
                        }
                        long j = (long) Qe;
                        this.f168765d.getClass();
                        int Qe2 = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(cVar2, 300);
                        int Y52 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83778Y5() - 1;
                        if (Qe2 < Y52) {
                            Qe2 = Y52;
                        }
                        long j2 = (long) Qe2;
                        GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) g5;
                        if (galleryItem$VideoMediaItem.f162766w < C102609h.Fx0().mo142238c6().f267171i * 1000) {
                            FileSelectorUI fileSelectorUI3 = this.f168765d.f168738d;
                            C76879j.m92713G(fileSelectorUI3, fileSelectorUI3.getResources().getString(C0966R.string.f6x, new Object[]{Integer.valueOf(C102609h.Fx0().mo142238c6().f267171i)}), "", false, new C58981a(view2));
                            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        i5 = intValue;
                        galleryItem$MediaItem = g5;
                        if (((long) galleryItem$VideoMediaItem.f162766w) > j * ((long) 1000)) {
                            FileSelectorUI fileSelectorUI4 = this.f168765d.f168738d;
                            C76879j.m92713G(fileSelectorUI4, fileSelectorUI4.getResources().getString(C0966R.string.f6y, new Object[]{Long.valueOf(j2)}), "", false, new C58982b(view2));
                            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    } else {
                        i5 = intValue;
                        galleryItem$MediaItem = g5;
                    }
                    this.f168765d.getClass();
                    if (!Util.isNullOrNil((String) null)) {
                        this.f168765d.getClass();
                        if (C87412m.m108589b((Object) null, "album_business_bubble_media_by_coordinate")) {
                            int i7 = ((GalleryItem$VideoMediaItem) galleryItem$MediaItem).f162766w;
                            C58970b bVar = this.f168765d;
                            if (i7 >= (bVar.f168743i * 1000) + 500) {
                                FileSelectorUI fileSelectorUI5 = bVar.f168738d;
                                C76879j.m92726T(fileSelectorUI5, fileSelectorUI5.getResources().getString(C0966R.string.f6y, new Object[]{Integer.valueOf(this.f168765d.f168743i)}));
                                this.f168765d.notifyItemChanged(i5);
                                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                return;
                            }
                        }
                    }
                    i3 = i5;
                } else {
                    galleryItem$MediaItem = g5;
                    i3 = intValue;
                }
                int K7 = this.f168765d.f168738d.mo135135K7() + this.f168765d.f168742h.size();
                C58970b bVar2 = this.f168765d;
                if (K7 < bVar2.f168740f) {
                    bVar2.f168742h.add(galleryItem$MediaItem);
                    C58973c cVar3 = this.f168765d.f168747p;
                    if (cVar3 != null) {
                        cVar3.mo84206b(i3, true);
                    }
                    i2 = this.f168765d.f168742h.size() - 1;
                    i4 = 0;
                    z2 = false;
                } else {
                    i4 = 1;
                    i2 = -1;
                    z2 = true;
                }
                this.f168765d.notifyItemChanged(i3);
                z = z2;
                i = i4;
            } else {
                C101316l.m132914m(13459, C86013q1.m106451l(g5.f162747d) + ",1,,0");
                FileSelectorUI fileSelectorUI6 = this.f168765d.f168738d;
                C76879j.m92726T(fileSelectorUI6, fileSelectorUI6.getString(C0966R.string.f68));
                this.f168765d.notifyItemChanged(intValue);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!z) {
                C58970b bVar3 = this.f168765d;
                C58972b bVar4 = bVar3.f168739e;
                if (bVar4 != null) {
                    bVar4.mo84204a(bVar3.f168742h.size(), i3, i2, i);
                }
            } else {
                C58970b bVar5 = this.f168765d;
                FileSelectorUI fileSelectorUI7 = bVar5.f168738d;
                C76912y0.makeText((Context) fileSelectorUI7, (CharSequence) fileSelectorUI7.getString(C0966R.string.cvi, new Object[]{Integer.valueOf(bVar5.f168740f)}), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C58970b(FileSelectorUI fileSelectorUI, C58972b bVar) {
        C87412m.m108594g(fileSelectorUI, "mContext");
        this.f168738d = fileSelectorUI;
        this.f168739e = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: F4 */
    public boolean mo84197F4(int i) {
        return getItemViewType(i) == 2;
    }

    /* renamed from: G4 */
    public final ArrayList<GalleryItem$MediaItem> mo84198G4(List<? extends GalleryItem$MediaItem> list) {
        ArrayList<GalleryItem$MediaItem> arrayList = new ArrayList<>();
        if (list != null) {
            for (GalleryItem$MediaItem galleryItem$MediaItem : list) {
                if (5 != galleryItem$MediaItem.getType()) {
                    arrayList.add(galleryItem$MediaItem);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: O4 */
    public final ArrayList<GalleryItem$MediaItem> mo84199O4(List<? extends GalleryItem$MediaItem> list) {
        ArrayList<GalleryItem$MediaItem> arrayList = new ArrayList<>();
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) list.get(i);
            String a = C72715f.m85108a(this.f168738d, galleryItem$MediaItem.f162752i);
            C87412m.m108593f(a, "anotherFormatTimeInList(…, mediaItem.generateDate)");
            if (!C87412m.m108589b(str, a)) {
                GalleryItem$TimeMediaItem galleryItem$TimeMediaItem = new GalleryItem$TimeMediaItem();
                galleryItem$TimeMediaItem.f162753j = a;
                arrayList.add(galleryItem$TimeMediaItem);
                str = a;
            }
            galleryItem$MediaItem.f162753j = a;
            arrayList.add(galleryItem$MediaItem);
        }
        return arrayList;
    }

    /* renamed from: g5 */
    public final GalleryItem$MediaItem mo84200g5(int i) {
        if (i < this.f168741g.size()) {
            return this.f168741g.get(i);
        }
        Log.m105929w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", Integer.valueOf(this.f168741g.size()), Integer.valueOf(i));
        return null;
    }

    public int getItemCount() {
        return this.f168741g.size();
    }

    public int getItemViewType(int i) {
        return 5 == this.f168741g.get(i).getType() ? 2 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        String str2;
        String str3;
        C58974d dVar;
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        C87412m.m108594g(zVar2, "holder");
        if (zVar2 instanceof C58971a) {
            zVar2.f44854d.setTag(C0966R.C0970id.fbj, Integer.valueOf(i));
            zVar2.f44854d.setTag(C0966R.C0970id.fc6, 1);
            zVar2.f44854d.setOnClickListener(this.f168748q);
            GalleryItem$MediaItem g5 = mo84200g5(i2);
            if (g5 == null) {
                Log.m105920e("MicroMsg.AlbumAdapter", "get item failed");
                return;
            }
            String e = g5.mo80159e();
            C87412m.m108593f(e, "item.thumbPath");
            String str4 = g5.f162747d;
            C87412m.m108593f(str4, "item.originalPath");
            if (!Util.isNullOrNil(e) || !Util.isNullOrNil(str4)) {
                C58971a aVar = (C58971a) zVar2;
                aVar.f168752D.setTag(C0966R.C0970id.fbj, Integer.valueOf(i));
                aVar.f168752D.setOnClickListener(this.f168746o);
                aVar.f168750B.setVisibility(0);
                aVar.f168751C.setVisibility(0);
                if (2 == g5.getType()) {
                    aVar.f168750B.setImageResource(C0966R.raw.video_icon_in_gird);
                    C58974d.C58975a aVar2 = C58974d.f168756h;
                    TextView textView = aVar.f168751C;
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) g5;
                    if (textView != null) {
                        HashMap<TextView, C58974d> hashMap = C58974d.f168757i;
                        if (hashMap.containsKey(textView) && (dVar = hashMap.get(textView)) != null) {
                            if (!C87412m.m108589b(dVar.f168759e, galleryItem$VideoMediaItem)) {
                                WeakReference<TextView> weakReference = dVar.f168758d;
                                C87412m.m108591d(weakReference);
                                if (C87412m.m108589b(textView, weakReference.get())) {
                                    dVar.f168758d = new WeakReference<>((Object) null);
                                    dVar.f168761g = true;
                                }
                            }
                        }
                        int i3 = galleryItem$VideoMediaItem.f162766w;
                        if (i3 >= 0) {
                            Log.m105925i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", Integer.valueOf(i3), galleryItem$VideoMediaItem);
                            aVar2.mo84211a(textView, galleryItem$VideoMediaItem.f162766w);
                            hashMap.remove(textView);
                        } else {
                            textView.setText("");
                            C58974d dVar2 = new C58974d(textView, galleryItem$VideoMediaItem, new C58983c(), (C8480h) null);
                            C93958f.m118753m().mo128894b(dVar2);
                            hashMap.put(textView, dVar2);
                        }
                    } else {
                        Log.m105920e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
                    }
                } else if (C112551y.m153809i(g5.f162755o, "edit", true)) {
                    aVar.f168750B.setImageResource(C0966R.raw.photo_edit_mark);
                    aVar.f168751C.setVisibility(4);
                } else if (C112551y.m153809i(g5.f162755o, "image/gif", true)) {
                    aVar.f168750B.setImageResource(C0966R.C0969drawable.c3n);
                    aVar.f168751C.setVisibility(4);
                } else {
                    aVar.f168750B.setVisibility(4);
                    aVar.f168751C.setVisibility(4);
                }
                String format = this.f168744j.format(new Date(g5.f162752i));
                C87412m.m108593f(format, "mDateFormat.format(Date(item.generateDate))");
                String str5 = (i2 + 1) + ", " + format;
                if (2 == g5.getType()) {
                    str3 = "视频 " + str5;
                } else {
                    str3 = "图片" + str5;
                }
                aVar.f168755z.setContentDescription(str3);
                Log.m105919d("MicroMsg.AlbumAdapter", "thumbFilePath: %s | origFilePath: %s | contentDescription %s", e, str4, str3);
                str2 = "get item failed";
                str = "MicroMsg.AlbumAdapter";
                String str6 = str4;
                C58971a aVar3 = aVar;
                C100562c0.m131592c(aVar.f168755z, g5.getType(), e, str4, g5.f162751h, -1, (C58800a) null, (C93974o.C93980f) null, g5.f162752i);
                aVar3.f168752D.setVisibility(0);
                if (this.f168742h.contains(g5)) {
                    aVar3.f168752D.setCheckedNumber(this.f168742h.indexOf(g5) + 1);
                    aVar3.f168749A.setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_5);
                } else {
                    aVar3.f168752D.setChecked(false);
                    aVar3.f168749A.setBackgroundResource(C0966R.color.f3599z6);
                }
                if (aVar3.f168752D.getVisibility() == 0) {
                    MMNumberCheckbox mMNumberCheckbox = aVar3.f168752D;
                    C87412m.m108594g(mMNumberCheckbox, "delegate");
                    ViewParent parent = mMNumberCheckbox.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    view.post(new C8017a(mMNumberCheckbox, view));
                } else {
                    MMNumberCheckbox mMNumberCheckbox2 = aVar3.f168752D;
                    C87412m.m108594g(mMNumberCheckbox2, "delegate");
                    ViewParent parent2 = mMNumberCheckbox2.getParent();
                    C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
                    ((View) parent2).setTouchDelegate((TouchDelegate) null);
                }
                TextView textView2 = aVar3.f168753E;
                if (textView2 != null) {
                    Uri n = C116299g2.m163858n(str6);
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
                    textView2.setText(path2);
                }
                TextView textView3 = aVar3.f168754F;
                if (textView3 != null) {
                    textView3.setText(Util.getSizeKB(C86013q1.m106451l(str6)));
                }
                aVar3.f44854d.setOnLongClickListener(this.f168745n);
            } else {
                Log.m105921e("MicroMsg.AlbumAdapter", "null or nil filepath, poi: %s.", Integer.valueOf(i));
                return;
            }
        } else {
            str2 = "get item failed";
            str = "MicroMsg.AlbumAdapter";
        }
        if (zVar2 instanceof C58977e) {
            zVar2.f44854d.setTag(C0966R.C0970id.fbj, Integer.valueOf(i));
            zVar2.f44854d.setTag(C0966R.C0970id.fc6, 2);
            GalleryItem$MediaItem g54 = mo84200g5(i2);
            if (g54 == null) {
                Log.m105920e(str, str2);
                return;
            }
            ((C58977e) zVar2).f168762z.setText(g54.f162753j);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(this.f168738d).inflate(C0966R.C0971layout.a86, viewGroup, false);
            C87412m.m108593f(inflate, "from(mContext).inflate(R…edia_item, parent, false)");
            return new C58971a(inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(this.f168738d).inflate(C0966R.C0971layout.a86, viewGroup, false);
            C87412m.m108593f(inflate2, "from(mContext).inflate(R…edia_item, parent, false)");
            return new C58971a(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(this.f168738d).inflate(C0966R.C0971layout.a87, viewGroup, false);
            C87412m.m108593f(inflate3, "from(mContext).inflate(R…time_item, parent, false)");
            return new C58977e(inflate3);
        }
    }

    /* renamed from: u5 */
    public final int mo84201u5() {
        return this.f168741g.size();
    }

    /* renamed from: w5 */
    public final ArrayList<String> mo84202w5() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<GalleryItem$MediaItem> it = this.f168742h.iterator();
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            C87412m.m108593f(next, "mSelectMediaItems");
            arrayList.add(next.f162747d);
        }
        return arrayList;
    }

    /* renamed from: y5 */
    public final void mo84203y5(GalleryItem$MediaItem galleryItem$MediaItem) {
        if (C110818d0.m150903D(this.f168742h, galleryItem$MediaItem)) {
            ArrayList arrayList = new ArrayList();
            int size = this.f168742h.size();
            for (int P = C110818d0.m150918P(this.f168742h, galleryItem$MediaItem); P < size; P++) {
                GalleryItem$MediaItem galleryItem$MediaItem2 = this.f168742h.get(P);
                C87412m.m108593f(galleryItem$MediaItem2, "mSelectMediaItems[i]");
                int indexOf = this.f168741g.indexOf(galleryItem$MediaItem2);
                if (indexOf != -1) {
                    arrayList.add(Integer.valueOf(indexOf));
                }
            }
            C24564k0.m30737a(this.f168742h).remove(galleryItem$MediaItem);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C87412m.m108593f(next, "notifiedItems");
                notifyItemChanged(((Number) next).intValue());
            }
        }
    }
}
