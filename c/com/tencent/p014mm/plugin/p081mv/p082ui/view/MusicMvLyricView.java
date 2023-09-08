package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.C103834d;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C99101e;
import kg3.C76577a;
import kotlin.Metadata;
import ma2.C61453s;
import ma2.C61454t;
import ma2.C99819r;
import n60.C100075f;
import p853i4.C60244h;
import r60.C101350i;
import rx3.C13598b0;
import ub2.C65269d;
import ub2.C65300n0;
import ub2.C65302o0;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\b<=>\f?@ABB!\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:B\u0019\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b9\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006C"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView;", "Landroid/widget/RelativeLayout;", "Landroidx/transition/AutoTransition;", "getTransition", "", "visibility", "Lrx3/b0;", "setVisibility", "Lma2/s;", "lyricObj", "setLyricObj", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "e", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getLyricRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setLyricRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "lyricRv", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$h;", "u", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$h;", "getEventListener", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$h;", "setEventListener", "(Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$h;)V", "eventListener", "", "C", "Z", "isShowLyricPrelude", "()Z", "setShowLyricPrelude", "(Z)V", "", "G", "[I", "getFirstVisibleItemPos", "()[I", "setFirstVisibleItemPos", "([I)V", "firstVisibleItemPos", "H", "getLastVisibleItemPos", "setLastVisibleItemPos", "lastVisibleItemPos", "I", "getShowPreludeLenNum", "()I", "setShowPreludeLenNum", "(I)V", "showPreludeLenNum", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "c", "d", "f", "g", "h", "i", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView */
public final class MusicMvLyricView extends RelativeLayout {

    /* renamed from: J */
    public static final int f163579J = C76577a.m92151b(MMApplicationContext.getContext(), 20);

    /* renamed from: K */
    public static final int f163580K = C76577a.m92151b(MMApplicationContext.getContext(), C0947jz.f2205e);

    /* renamed from: L */
    public static final int f163581L = C76577a.m92151b(MMApplicationContext.getContext(), 24);

    /* renamed from: M */
    public static final float f163582M = 0.4f;

    /* renamed from: A */
    public boolean f163583A;

    /* renamed from: B */
    public long f163584B;

    /* renamed from: C */
    public boolean f163585C;

    /* renamed from: D */
    public boolean f163586D;

    /* renamed from: E */
    public Future<?> f163587E;

    /* renamed from: F */
    public C54256s f163588F;

    /* renamed from: G */
    public int[] f163589G;

    /* renamed from: H */
    public int[] f163590H;

    /* renamed from: I */
    public int f163591I;

    /* renamed from: d */
    public ArrayList<C57106f> f163592d;

    /* renamed from: e */
    public WxRecyclerView f163593e;

    /* renamed from: f */
    public WxRecyclerAdapter<C57106f> f163594f;

    /* renamed from: g */
    public LinearLayoutManager f163595g;

    /* renamed from: h */
    public View f163596h;

    /* renamed from: i */
    public LinearLayout f163597i;

    /* renamed from: j */
    public TextView f163598j;

    /* renamed from: n */
    public TextView f163599n;

    /* renamed from: o */
    public MMRoundCornerImageView f163600o;

    /* renamed from: p */
    public FrameLayout f163601p;

    /* renamed from: q */
    public final LyricFadeLayout f163602q;

    /* renamed from: r */
    public final AccelerateDecelerateInterpolator f163603r;

    /* renamed from: s */
    public C61453s f163604s;

    /* renamed from: t */
    public List<C57105e> f163605t;

    /* renamed from: u */
    public C57108h f163606u;

    /* renamed from: v */
    public int f163607v;

    /* renamed from: w */
    public boolean f163608w;

    /* renamed from: x */
    public final C57109i f163609x;

    /* renamed from: y */
    public boolean f163610y;

    /* renamed from: z */
    public boolean f163611z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$a */
    public static final class C57100a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricView f163612d;

        public C57100a(MusicMvLyricView musicMvLyricView) {
            this.f163612d = musicMvLyricView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMvLyricView.m65825a(this.f163612d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$b */
    public final class C57101b extends C57103d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57101b(MusicMvLyricView musicMvLyricView, Context context) {
            super(musicMvLyricView, context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 25.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$c */
    public final class C57102c extends C57103d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57102c(MusicMvLyricView musicMvLyricView, Context context) {
            super(musicMvLyricView, context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 0.1f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: l */
        public int mo10339l(int i) {
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$d */
    public class C57103d extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ MusicMvLyricView f163613n;

        /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$d$a */
        public static final class C57104a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvLyricView f163614d;

            public C57104a(MusicMvLyricView musicMvLyricView) {
                this.f163614d = musicMvLyricView;
            }

            public final void run() {
                MusicMvLyricView musicMvLyricView = this.f163614d;
                musicMvLyricView.mo80575h(musicMvLyricView.f163607v);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57103d(MusicMvLyricView musicMvLyricView, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            this.f163613n = musicMvLyricView;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            MusicMvLyricView musicMvLyricView = this.f163613n;
            if (musicMvLyricView.f163608w) {
                WxRecyclerView lyricRv = musicMvLyricView.getLyricRv();
                int height = lyricRv != null ? lyricRv.getHeight() : 0;
                int top = view.getTop();
                int bottom = view.getBottom();
                int b = C76577a.m92151b(this.f163613n.getContext(), 75);
                if (top < b) {
                    int i = b - top;
                    aVar.mo17388b(0, -i, mo10339l(i), this.f152290i);
                    Log.m105924i("MicroMsg.MusicMvCommentView", "11");
                } else if (height - bottom < b) {
                    int i2 = (height - b) - bottom;
                    aVar.mo17388b(0, -i2, mo10339l(i2), this.f152290i);
                    Log.m105924i("MicroMsg.MusicMvCommentView", "12");
                    MusicMvLyricView musicMvLyricView2 = this.f163613n;
                    if (!musicMvLyricView2.f163611z) {
                        musicMvLyricView2.postDelayed(new C57104a(musicMvLyricView2), 200);
                    }
                }
            } else if (!musicMvLyricView.f163610y) {
                int[] iArr = new int[2];
                WxRecyclerView lyricRv2 = musicMvLyricView.getLyricRv();
                if (lyricRv2 != null) {
                    lyricRv2.getLocationInWindow(iArr);
                }
                int height2 = (((int) (((float) this.f163613n.getHeight()) * 0.73f)) - iArr[1]) - view.getTop();
                int i3 = MusicMvLyricView.f163579J;
                int i4 = height2 + MusicMvLyricView.f163579J;
                aVar.mo17388b(0, -i4, mo10339l(i4), this.f152290i);
                Log.m105924i("MicroMsg.MusicMvCommentView", "13");
            } else {
                int[] iArr2 = new int[2];
                WxRecyclerView lyricRv3 = musicMvLyricView.getLyricRv();
                if (lyricRv3 != null) {
                    lyricRv3.getLocationInWindow(iArr2);
                }
                int height3 = (((int) (((float) this.f163613n.getHeight()) * MusicMvLyricView.f163582M)) - iArr2[1]) - view.getTop();
                int i5 = MusicMvLyricView.f163579J;
                int i6 = height3 + MusicMvLyricView.f163579J;
                aVar.mo17388b(0, -i6, mo10339l(i6), this.f152290i);
                Log.m105924i("MicroMsg.MusicMvCommentView", "14");
                MusicMvLyricView musicMvLyricView3 = this.f163613n;
                if (!musicMvLyricView3.f163611z) {
                    musicMvLyricView3.mo80569g();
                }
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 300.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$e */
    public static final class C57105e implements Comparable<C57105e> {

        /* renamed from: d */
        public long f163615d;

        /* renamed from: e */
        public String f163616e;

        /* renamed from: f */
        public boolean f163617f;

        public C57105e(long j, String str, boolean z) {
            C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
            this.f163615d = j;
            this.f163616e = str;
            this.f163617f = z;
        }

        public int compareTo(Object obj) {
            C57105e eVar = (C57105e) obj;
            C87412m.m108594g(eVar, "entry");
            return (int) (this.f163615d - eVar.f163615d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f */
    public static final class C57106f implements C9493c {

        /* renamed from: d */
        public final C57105e f163618d;

        public C57106f(C57105e eVar) {
            C87412m.m108594g(eVar, "lyricInfo");
            this.f163618d = eVar;
        }

        /* renamed from: c */
        public int mo75c() {
            return 7;
        }

        public long getItemId() {
            return (long) this.f163618d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$g */
    public final class C57107g extends C60896i<C57106f> {
        public C57107g() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f359908bj3;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C57106f fVar = (C57106f) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(fVar, "item");
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.gjv);
            if (textView != null) {
                textView.setText(fVar.f163618d.f163616e);
            }
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.gjv);
            if (textView2 != null) {
                textView2.setContentDescription(fVar.f163618d.f163616e);
            }
            oVar.mo85812D(C0966R.C0970id.bdr).setOnClickListener(new C57133c(MusicMvLyricView.this));
            TextPaint paint = ((TextView) oVar.mo85812D(C0966R.C0970id.gjv)).getPaint();
            Rect rect = C85875k4.f250155a;
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
            if (fVar.f163618d.f163617f) {
                TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.gjv);
                if (textView3 != null) {
                    textView3.setTextColor(MusicMvLyricView.this.getContext().getResources().getColor(C0966R.color.f2975b6));
                    return;
                }
                return;
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.gjv);
            if (textView4 != null) {
                textView4.setTextColor(MusicMvLyricView.this.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$h */
    public interface C57108h {
        /* renamed from: a */
        void mo80588a(int i, long j);

        /* renamed from: b */
        void mo80589b(boolean z);

        /* renamed from: c */
        void mo80590c(int i);

        /* renamed from: d */
        void mo80591d();

        /* renamed from: e */
        void mo80592e();
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$i */
    public static final class C57109i {

        /* renamed from: a */
        public String f163620a;

        /* renamed from: b */
        public String f163621b;

        /* renamed from: c */
        public String f163622c;

        public C57109i() {
            this((String) null, (String) null, (String) null, 7, (C8480h) null);
        }

        public C57109i(String str, String str2, String str3, int i, C8480h hVar) {
            str = (i & 1) != 0 ? "" : str;
            str2 = (i & 2) != 0 ? "" : str2;
            str3 = (i & 4) != 0 ? "" : str3;
            C87412m.m108594g(str, "songName");
            C87412m.m108594g(str2, "singer");
            C87412m.m108594g(str3, "albumUrl");
            this.f163620a = str;
            this.f163621b = str2;
            this.f163622c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C57109i)) {
                return false;
            }
            C57109i iVar = (C57109i) obj;
            return C87412m.m108589b(this.f163620a, iVar.f163620a) && C87412m.m108589b(this.f163621b, iVar.f163621b) && C87412m.m108589b(this.f163622c, iVar.f163622c);
        }

        public int hashCode() {
            return (((this.f163620a.hashCode() * 31) + this.f163621b.hashCode()) * 31) + this.f163622c.hashCode();
        }

        public String toString() {
            return "SongInfo(songName=" + this.f163620a + ", singer=" + this.f163621b + ", albumUrl=" + this.f163622c + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$j */
    public static final class C57110j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricView f163623d;

        public C57110j(MusicMvLyricView musicMvLyricView) {
            this.f163623d = musicMvLyricView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$bindSongInfoData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMvLyricView.m65825a(this.f163623d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$bindSongInfoData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$k */
    public static final class C57111k extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f163624d;

        /* renamed from: e */
        public final /* synthetic */ MMRoundCornerImageView f163625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57111k(String str, MMRoundCornerImageView mMRoundCornerImageView) {
            super(2);
            this.f163624d = str;
            this.f163625e = mMRoundCornerImageView;
        }

        public Object invoke(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            C87412m.m108594g((C101350i) obj, "vieweWakHolder");
            StringBuilder sb = new StringBuilder();
            sb.append("loadBitmap finished:");
            sb.append(bitmap);
            sb.append(", size:[");
            Integer num = null;
            sb.append(bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null);
            sb.append(',');
            if (bitmap != null) {
                num = Integer.valueOf(bitmap.getHeight());
            }
            sb.append(num);
            sb.append("], url:");
            sb.append(this.f163624d);
            Log.m105924i("MicroMsg.MusicMvCommentView", sb.toString());
            if (bitmap != null) {
                this.f163625e.setImageBitmap(bitmap);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$l */
    public static final class C57112l extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricView f163626d;

        /* renamed from: e */
        public final /* synthetic */ View f163627e;

        public C57112l(MusicMvLyricView musicMvLyricView, View view) {
            this.f163626d = musicMvLyricView;
            this.f163627e = view;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MusicMvLyricView musicMvLyricView = this.f163626d;
            if (!musicMvLyricView.f163611z) {
                musicMvLyricView.f163611z = true;
                WxRecyclerView wxRecyclerView = musicMvLyricView.f163593e;
                if (wxRecyclerView != null) {
                    wxRecyclerView.setFadingEdgeLength(0);
                }
                musicMvLyricView.f163602q.setFade(true);
            }
            View view = this.f163627e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$doInFadingAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$doInFadingAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f163627e.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$m */
    public static final class C57113m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricView f163628d;

        public C57113m(MusicMvLyricView musicMvLyricView) {
            this.f163628d = musicMvLyricView;
        }

        public final void run() {
            int i;
            RecyclerView.C16631z I0;
            int i2;
            RecyclerView.C16631z I02;
            MusicMvLyricView musicMvLyricView = this.f163628d;
            int i3 = musicMvLyricView.f163607v;
            LinearLayoutManager linearLayoutManager = musicMvLyricView.f163595g;
            Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.mo16957C()) : null;
            C87412m.m108592e(valueOf, "null cannot be cast to non-null type kotlin.Int");
            int intValue = valueOf.intValue();
            int i4 = 0;
            if (intValue >= 0 && (i2 = i3 - intValue) > 0) {
                int i5 = i3 - 1;
                int i6 = 0;
                while (intValue < i5) {
                    WxRecyclerView wxRecyclerView = musicMvLyricView.f163593e;
                    i6++;
                    musicMvLyricView.mo80566d((wxRecyclerView == null || (I02 = wxRecyclerView.mo17023I0(intValue)) == null) ? null : I02.f44854d, ((float) i6) / ((float) i2));
                    intValue++;
                }
            }
            LinearLayoutManager linearLayoutManager2 = musicMvLyricView.f163595g;
            Integer valueOf2 = linearLayoutManager2 != null ? Integer.valueOf(linearLayoutManager2.mo16957C()) : null;
            C87412m.m108592e(valueOf2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = valueOf2.intValue();
            if (intValue2 >= 0 && (i = intValue2 - i3) > 0) {
                while (true) {
                    i3++;
                    if (i3 < intValue2) {
                        WxRecyclerView wxRecyclerView2 = musicMvLyricView.f163593e;
                        i4++;
                        float f = (float) i;
                        musicMvLyricView.mo80566d((wxRecyclerView2 == null || (I0 = wxRecyclerView2.mo17023I0(i3)) == null) ? null : I0.f44854d, (f - ((float) i4)) / f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$n */
    public static final class C57114n extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricView f163629d;

        public C57114n(MusicMvLyricView musicMvLyricView) {
            this.f163629d = musicMvLyricView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerView.C16631z I0;
            View view;
            RecyclerView.C16631z I02;
            View view2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                Future<?> future = this.f163629d.f163587E;
                if (future != null) {
                    future.cancel(false);
                }
                this.f163629d.mo80568f();
                MusicMvLyricView musicMvLyricView = this.f163629d;
                if (musicMvLyricView.f163586D) {
                    musicMvLyricView.f163586D = false;
                }
            }
            MusicMvLyricView musicMvLyricView2 = this.f163629d;
            if (!musicMvLyricView2.f163608w && i == 1) {
                musicMvLyricView2.f163608w = true;
                C57108h eventListener = musicMvLyricView2.getEventListener();
                if (eventListener != null) {
                    eventListener.mo80591d();
                }
            }
            LinearLayoutManager linearLayoutManager = this.f163629d.f163595g;
            if (linearLayoutManager != null) {
                int C = linearLayoutManager.mo16957C();
                MusicMvLyricView musicMvLyricView3 = this.f163629d;
                WxRecyclerView lyricRv = musicMvLyricView3.getLyricRv();
                if (!(lyricRv == null || (I02 = lyricRv.mo17023I0(C)) == null || (view2 = I02.f44854d) == null)) {
                    view2.getLocationOnScreen(musicMvLyricView3.getFirstVisibleItemPos());
                }
            }
            LinearLayoutManager linearLayoutManager2 = this.f163629d.f163595g;
            if (linearLayoutManager2 != null) {
                int E = linearLayoutManager2.mo16959E();
                MusicMvLyricView musicMvLyricView4 = this.f163629d;
                WxRecyclerView lyricRv2 = musicMvLyricView4.getLyricRv();
                if (!(lyricRv2 == null || (I0 = lyricRv2.mo17023I0(E)) == null || (view = I0.f44854d) == null)) {
                    view.getLocationOnScreen(musicMvLyricView4.getLastVisibleItemPos());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View findViewById;
        C87412m.m108594g(context, "context");
        this.f163592d = new ArrayList<>();
        this.f163603r = new AccelerateDecelerateInterpolator();
        this.f163605t = new ArrayList();
        this.f163607v = -1;
        this.f163609x = new C57109i((String) null, (String) null, (String) null, 7, (C8480h) null);
        this.f163610y = true;
        this.f163586D = true;
        this.f163589G = new int[2];
        this.f163590H = new int[2];
        C57114n nVar = new C57114n(this);
        this.f163596h = View.inflate(context, C0966R.C0971layout.bj4, this);
        View findViewById2 = findViewById(C0966R.C0970id.ogz);
        C87412m.m108593f(findViewById2, "findViewById(R.id.lyric_fade_layout)");
        this.f163602q = (LyricFadeLayout) findViewById2;
        Log.m105924i("MicroMsg.MusicMvCommentView", "prepareViews");
        this.f163594f = new WxRecyclerAdapter<>(new MusicMvLyricView$prepareViews$1(this), this.f163592d, true);
        View view = this.f163596h;
        WxRecyclerView wxRecyclerView = view != null ? (WxRecyclerView) view.findViewById(C0966R.C0970id.gjx) : null;
        this.f163593e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f163594f);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.f163595g = linearLayoutManager;
        WxRecyclerView wxRecyclerView2 = this.f163593e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(linearLayoutManager);
        }
        WxRecyclerView wxRecyclerView3 = this.f163593e;
        if (wxRecyclerView3 != null) {
            Context context2 = getContext();
            C87412m.m108593f(context2, "context");
            WxRecyclerView wxRecyclerView4 = this.f163593e;
            C87412m.m108591d(wxRecyclerView4);
            wxRecyclerView3.mo17085h0(new C65269d(context2, wxRecyclerView4));
        }
        WxRecyclerView wxRecyclerView5 = this.f163593e;
        if (wxRecyclerView5 != null) {
            wxRecyclerView5.mo17043c(nVar);
        }
        WxRecyclerAdapter<C57106f> wxRecyclerAdapter = this.f163594f;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C65300n0(this);
        }
        View view2 = this.f163596h;
        if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.a37)) == null)) {
            findViewById.setOnClickListener(new C65302o0(this));
        }
        setTag(this);
        View findViewById3 = findViewById(C0966R.C0970id.oip);
        C87412m.m108593f(findViewById3, "findViewById(R.id.song_info_ll)");
        this.f163597i = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.jy4);
        C87412m.m108593f(findViewById4, "findViewById(R.id.song_name_tv)");
        this.f163598j = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.jln);
        C87412m.m108593f(findViewById5, "findViewById(R.id.singer_tv)");
        this.f163599n = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.bv8);
        C87412m.m108593f(findViewById6, "findViewById(R.id.cover_iv)");
        this.f163600o = (MMRoundCornerImageView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.oik);
        C87412m.m108593f(findViewById7, "findViewById(R.id.sing_info_scene_root)");
        this.f163601p = (FrameLayout) findViewById7;
        this.f163597i.setOnClickListener(new C57100a(this));
        this.f163598j.setTextColor(-1);
        setClickable(true);
    }

    /* renamed from: a */
    public static final void m65825a(MusicMvLyricView musicMvLyricView) {
        musicMvLyricView.f163610y = !musicMvLyricView.f163610y;
        StringBuilder sb = new StringBuilder();
        sb.append("translateViewMode: current view mode is: ");
        sb.append(musicMvLyricView.f163610y ? "small" : "big");
        sb.append(" mode");
        Log.m105924i("MicroMsg.MusicMvCommentView", sb.toString());
        WxRecyclerView wxRecyclerView = musicMvLyricView.f163593e;
        if (wxRecyclerView != null) {
            wxRecyclerView.mo17155w1();
        }
        if (musicMvLyricView.f163610y) {
            musicMvLyricView.mo80567e();
        } else {
            C103834d.m138409c(C60244h.m70515b(musicMvLyricView.f163601p, C0966R.C0971layout.d_o, musicMvLyricView.getContext()), musicMvLyricView.getTransition());
            C57108h hVar = musicMvLyricView.f163606u;
            if (hVar != null) {
                hVar.mo80589b(false);
            }
            C57108h hVar2 = musicMvLyricView.f163606u;
            if (hVar2 != null) {
                hVar2.mo80590c(52);
            }
            musicMvLyricView.mo80568f();
        }
        musicMvLyricView.f163586D = true;
        musicMvLyricView.mo80564b();
    }

    private final AutoTransition getTransition() {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.mo145347T(C0966R.C0970id.oip);
        autoTransition.mo145349V(200);
        autoTransition.mo145350W(this.f163603r);
        return autoTransition;
    }

    /* renamed from: b */
    public final void mo80564b() {
        View findViewById = findViewById(C0966R.C0970id.oip);
        C87412m.m108593f(findViewById, "findViewById(R.id.song_info_ll)");
        this.f163597i = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.jy4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.song_name_tv)");
        this.f163598j = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.jln);
        C87412m.m108593f(findViewById3, "findViewById(R.id.singer_tv)");
        this.f163599n = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.bv8);
        C87412m.m108593f(findViewById4, "findViewById(R.id.cover_iv)");
        this.f163600o = (MMRoundCornerImageView) findViewById4;
        this.f163597i.setOnClickListener(new C57110j(this));
        this.f163598j.setText(this.f163609x.f163620a);
        this.f163599n.setText(this.f163609x.f163621b);
        String str = this.f163609x.f163622c;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            C100075f.C100076a aVar = new C100075f.C100076a();
            String b = C61454t.f174766a.mo86430b(str);
            C87412m.m108594g(b, "_path");
            aVar.f293178d = b;
            aVar.f293176b = true;
            aVar.f293175a = true;
            C100075f a = aVar.mo139398a();
            MMRoundCornerImageView mMRoundCornerImageView = this.f163600o;
            if (!(str == null || mMRoundCornerImageView == null)) {
                C99101e.f290571b.mo138473h(str, mMRoundCornerImageView, a, new C57111k(str, mMRoundCornerImageView));
            }
        }
        if (!this.f163610y) {
            int dimensionPixelOffset = getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv) * 2);
            if (((int) this.f163598j.getPaint().measureText(this.f163609x.f163620a)) >= dimensionPixelOffset) {
                this.f163598j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.f163598j.setSingleLine(true);
                this.f163598j.setSelected(true);
                this.f163598j.setFocusable(true);
            }
            String str2 = this.f163609x.f163621b;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z && ((int) this.f163599n.getPaint().measureText(this.f163609x.f163621b)) >= dimensionPixelOffset) {
                this.f163599n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.f163599n.setSingleLine(true);
                this.f163599n.setSelected(true);
                this.f163599n.setFocusable(true);
            }
            ViewGroup.LayoutParams layoutParams = this.f163600o.getLayoutParams();
            layoutParams.height = dimensionPixelOffset;
            layoutParams.width = dimensionPixelOffset;
            this.f163600o.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = (r1 = r1.getData()).get(r4);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80565c(int r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L_0x0026
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f> r1 = r3.f163594f
            if (r1 == 0) goto L_0x0018
            java.util.List r1 = r1.getData()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r1.get(r4)
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView.C57106f) r1
            if (r1 == 0) goto L_0x0018
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$e r1 = r1.f163618d
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            if (r1 != 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            r2 = 0
            r1.f163617f = r2
        L_0x001f:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f> r1 = r3.f163594f
            if (r1 == 0) goto L_0x0026
            r1.notifyItemChanged(r4)
        L_0x0026:
            boolean r4 = r3.f163585C
            if (r4 != 0) goto L_0x0044
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f> r4 = r3.f163594f
            if (r4 == 0) goto L_0x003e
            java.util.List r4 = r4.getData()
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r4.get(r5)
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView.C57106f) r4
            if (r4 == 0) goto L_0x003e
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$e r0 = r4.f163618d
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r4 = 1
            r0.f163617f = r4
        L_0x0044:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$f> r4 = r3.f163594f
            if (r4 == 0) goto L_0x004b
            r4.notifyItemChanged(r5)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView.mo80565c(int, int):void");
    }

    /* renamed from: d */
    public final void mo80566d(View view, float f) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new C57112l(this, view));
            ofFloat.start();
        }
    }

    /* renamed from: e */
    public final void mo80567e() {
        C103834d.m138409c(C60244h.m70515b(this.f163601p, C0966R.C0971layout.d_p, getContext()), getTransition());
        C57108h hVar = this.f163606u;
        if (hVar != null) {
            hVar.mo80589b(true);
        }
        C57108h hVar2 = this.f163606u;
        if (hVar2 != null) {
            hVar2.mo80590c(53);
        }
        mo80569g();
    }

    /* renamed from: f */
    public final void mo80568f() {
        if (this.f163611z) {
            this.f163611z = false;
            WxRecyclerView wxRecyclerView = this.f163593e;
            if (wxRecyclerView != null) {
                wxRecyclerView.setFadingEdgeLength(f163581L);
            }
            this.f163602q.setFade(false);
        }
    }

    /* renamed from: g */
    public final void mo80569g() {
        mo80568f();
        Future<?> future = this.f163587E;
        if (future != null) {
            future.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        C57113m mVar = new C57113m(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f163587E = jVar.mo183892w(mVar, 2000, false);
    }

    public final C57108h getEventListener() {
        return this.f163606u;
    }

    public final int[] getFirstVisibleItemPos() {
        return this.f163589G;
    }

    public final int[] getLastVisibleItemPos() {
        return this.f163590H;
    }

    public final WxRecyclerView getLyricRv() {
        return this.f163593e;
    }

    public final int getShowPreludeLenNum() {
        return this.f163591I;
    }

    /* renamed from: h */
    public final void mo80575h(int i) {
        WxRecyclerView wxRecyclerView = this.f163593e;
        if (wxRecyclerView != null) {
            wxRecyclerView.mo17155w1();
        }
        this.f163608w = false;
        Log.m105924i("MicroMsg.MusicMvCommentView", "scrollToCenterAndEnterImmersive :" + i);
        int[] iArr = new int[2];
        WxRecyclerView wxRecyclerView2 = this.f163593e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.getLocationInWindow(iArr);
        }
        int height = ((int) (((float) getHeight()) * f163582M)) - iArr[1];
        LinearLayoutManager linearLayoutManager = this.f163595g;
        if (linearLayoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(height));
            aVar.mo10233c(Integer.valueOf(i));
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView", "scrollToCenterAndEnterImmersive", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView", "scrollToCenterAndEnterImmersive", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        mo80569g();
    }

    public void onVisibilityChanged(View view, int i) {
        C87412m.m108594g(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (C87412m.m108589b(view, this) && i == 8) {
            WxRecyclerView wxRecyclerView = this.f163593e;
            RecyclerView.C0129l T0 = wxRecyclerView != null ? wxRecyclerView.mo17033T0(0) : null;
            C87412m.m108592e(T0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
            C65269d dVar = (C65269d) T0;
            if (dVar.f187909q) {
                Log.m105924i(C65269d.f187898y, "stopAnim");
            }
            dVar.f187909q = false;
            dVar.f187900e.invalidate();
        }
    }

    public final void setEventListener(C57108h hVar) {
        this.f163606u = hVar;
    }

    public final void setFirstVisibleItemPos(int[] iArr) {
        C87412m.m108594g(iArr, "<set-?>");
        this.f163589G = iArr;
    }

    public final void setLastVisibleItemPos(int[] iArr) {
        C87412m.m108594g(iArr, "<set-?>");
        this.f163590H = iArr;
    }

    public final void setLyricObj(C61453s sVar) {
        List<C57106f> data;
        List<C57106f> data2;
        this.f163604s = sVar;
        StringBuilder sb = new StringBuilder();
        sb.append("sentenceSize:");
        RecyclerView.C0129l lVar = null;
        sb.append(sVar != null ? Integer.valueOf(sVar.mo86427b()) : null);
        Log.m105924i("MicroMsg.MusicMvCommentView", sb.toString());
        C61453s sVar2 = this.f163604s;
        if (sVar2 == null) {
            Log.m105920e("MicroMsg.MusicMvCommentView", "null == lyricObj, maybe you not setLyricObj, check ！！！");
            return;
        }
        ((ArrayList) this.f163605t).clear();
        WxRecyclerAdapter<C57106f> wxRecyclerAdapter = this.f163594f;
        if (!(wxRecyclerAdapter == null || (data2 = wxRecyclerAdapter.getData()) == null)) {
            data2.clear();
        }
        int b = sVar2.mo86427b();
        for (int i = 0; i < b; i++) {
            C99819r.C61452a a = sVar2.mo86426a(i);
            C87412m.m108593f(a, "lyricObj.getSentence(i)");
            if (!a.mo86424a()) {
                long j = a.f174760b;
                String str = a.f174761c;
                C87412m.m108593f(str, "sentence.content");
                C57105e eVar = new C57105e(j, str, false);
                C57106f fVar = new C57106f(eVar);
                ((ArrayList) this.f163605t).add(eVar);
                WxRecyclerAdapter<C57106f> wxRecyclerAdapter2 = this.f163594f;
                if (!(wxRecyclerAdapter2 == null || (data = wxRecyclerAdapter2.getData()) == null)) {
                    data.add(fVar);
                }
            }
        }
        WxRecyclerAdapter<C57106f> wxRecyclerAdapter3 = this.f163594f;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyDataSetChanged();
        }
        this.f163584B = 0;
        WxRecyclerAdapter<C57106f> wxRecyclerAdapter4 = this.f163594f;
        C87412m.m108591d(wxRecyclerAdapter4);
        if (wxRecyclerAdapter4.getData().size() > 0) {
            WxRecyclerAdapter<C57106f> wxRecyclerAdapter5 = this.f163594f;
            C87412m.m108591d(wxRecyclerAdapter5);
            this.f163584B = wxRecyclerAdapter5.getData().get(0).f163618d.f163615d;
            Log.m105924i("MicroMsg.MusicMvCommentView", "preludeLen:" + this.f163584B + " ms");
            WxRecyclerView wxRecyclerView = this.f163593e;
            if (wxRecyclerView != null) {
                lVar = wxRecyclerView.mo17033T0(0);
            }
            C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
            ((C65269d) lVar).mo89398m(0);
        }
    }

    public final void setLyricRv(WxRecyclerView wxRecyclerView) {
        this.f163593e = wxRecyclerView;
    }

    public final void setShowLyricPrelude(boolean z) {
        this.f163585C = z;
    }

    public final void setShowPreludeLenNum(int i) {
        this.f163591I = i;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.f163608w = false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvLyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
