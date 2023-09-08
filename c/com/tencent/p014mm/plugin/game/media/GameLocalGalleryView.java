package com.tencent.p014mm.plugin.game.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.game.widget.GameGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ly1.C99723d;
import p143ds.C31275q;
import p143ds.C31276r;
import p143ds.C97526j;
import w10.C15032a;

/* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView */
public class GameLocalGalleryView extends FrameLayout implements C93964k.C93967c {

    /* renamed from: q */
    public static final /* synthetic */ int f271697q = 0;

    /* renamed from: d */
    public RecyclerView f271698d;

    /* renamed from: e */
    public C94092f f271699e;

    /* renamed from: f */
    public TextView f271700f;

    /* renamed from: g */
    public Button f271701g;

    /* renamed from: h */
    public int f271702h;

    /* renamed from: i */
    public boolean f271703i;

    /* renamed from: j */
    public boolean f271704j = false;

    /* renamed from: n */
    public boolean f271705n = false;

    /* renamed from: o */
    public int f271706o = 0;

    /* renamed from: p */
    public long f271707p = 0;

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$d */
    public class C4565d extends RecyclerView.C0129l {

        /* renamed from: d */
        public int f19309d = C74942w4.m89784a(MMApplicationContext.getContext(), 3);

        public C4565d(GameLocalGalleryView gameLocalGalleryView) {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            int i = ((GridLayoutManager) recyclerView.getLayoutManager()).f44669w;
            int N0 = recyclerView.mo17029N0(view);
            int i2 = layoutParams.f44673h;
            Log.m105925i("MicroMsg.GameLocalMediaView", "getItemOffsets, spanSize = %d, spanCount = %d, index = %d", Integer.valueOf(layoutParams.f44674i), Integer.valueOf(i), Integer.valueOf(i2));
            if (N0 < i) {
                if (i2 == 0) {
                    rect.set(0, 0, 0, 0);
                } else {
                    rect.set(this.f19309d, 0, 0, 0);
                }
            } else if (i2 == 0) {
                rect.set(0, this.f19309d, 0, 0);
            } else {
                int i3 = this.f19309d;
                rect.set(i3, i3, 0, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$a */
    public class C94088a implements View.OnClickListener {
        public C94088a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ArrayList<GalleryItem$MediaItem> arrayList2 = GameLocalGalleryView.this.f271699e.f271712e;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                Intent intent = new Intent();
                intent.setClassName(GameLocalGalleryView.this.getContext(), "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
                intent.putStringArrayListExtra("preview_image_list", GameLocalGalleryView.this.f271699e.mo129150F4());
                intent.putParcelableArrayListExtra("preview_media_item_list", GameLocalGalleryView.this.f271699e.f271712e);
                intent.putExtra("max_select_count", GameLocalGalleryView.this.f271702h);
                intent.putExtra("send_raw_img", false);
                Context context = GameLocalGalleryView.this.getContext();
                int i = GameLocalGalleryView.f271697q;
                C88144b.m109795m(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("key_game_haowan_text", true);
                ((Activity) GameLocalGalleryView.this.getContext()).setResult(-1, intent2);
                ((Activity) GameLocalGalleryView.this.getContext()).finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$b */
    public class C94089b implements View.OnClickListener {
        public C94089b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ArrayList<GalleryItem$MediaItem> arrayList2 = GameLocalGalleryView.this.f271699e.f271712e;
            ArrayList arrayList3 = new ArrayList();
            Iterator<GalleryItem$MediaItem> it = arrayList2.iterator();
            while (it.hasNext()) {
                GalleryItem$MediaItem next = it.next();
                if (!next.f162755o.equals("edit") || Util.isNullOrNil(next.f162749f)) {
                    arrayList3.add(next.f162747d);
                } else {
                    arrayList3.add(next.f162749f);
                }
            }
            if (!Util.isNullOrNil((List) arrayList3)) {
                GameLocalGalleryView.this.getClass();
                C99723d.m130165g(2);
            }
            Intent intent = new Intent();
            intent.putExtra("CropImage_OutputPath_List", arrayList3);
            ((Activity) GameLocalGalleryView.this.getContext()).setResult(-1, intent);
            ((Activity) GameLocalGalleryView.this.getContext()).finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$c */
    public class C94090c implements C94091e {
        public C94090c() {
        }

        /* renamed from: a */
        public void mo129149a(int i) {
            if (i > 0) {
                GameLocalGalleryView gameLocalGalleryView = GameLocalGalleryView.this;
                gameLocalGalleryView.f271701g.setText(gameLocalGalleryView.getResources().getString(C0966R.string.f_s, new Object[]{Integer.valueOf(i), Integer.valueOf(GameLocalGalleryView.this.f271702h)}));
                GameLocalGalleryView.this.f271701g.setEnabled(true);
                GameLocalGalleryView.this.f271700f.setVisibility(0);
                GameLocalGalleryView gameLocalGalleryView2 = GameLocalGalleryView.this;
                gameLocalGalleryView2.f271700f.setText(gameLocalGalleryView2.getResources().getString(C0966R.string.f_u));
                return;
            }
            GameLocalGalleryView gameLocalGalleryView3 = GameLocalGalleryView.this;
            gameLocalGalleryView3.f271701g.setText(gameLocalGalleryView3.getResources().getString(C0966R.string.f_r));
            GameLocalGalleryView.this.f271701g.setEnabled(false);
            GameLocalGalleryView gameLocalGalleryView4 = GameLocalGalleryView.this;
            if (!gameLocalGalleryView4.f271704j) {
                gameLocalGalleryView4.f271700f.setVisibility(0);
                GameLocalGalleryView gameLocalGalleryView5 = GameLocalGalleryView.this;
                gameLocalGalleryView5.f271700f.setText(gameLocalGalleryView5.getResources().getString(C0966R.string.f_t));
                return;
            }
            gameLocalGalleryView4.f271700f.setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$e */
    public interface C94091e {
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$f */
    public class C94092f extends RecyclerView.C16613e<C94094g> {

        /* renamed from: d */
        public ArrayList<GalleryItem$MediaItem> f271711d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<GalleryItem$MediaItem> f271712e = new ArrayList<>();

        /* renamed from: f */
        public Context f271713f;

        /* renamed from: g */
        public int f271714g;

        /* renamed from: h */
        public int f271715h;

        /* renamed from: i */
        public C94091e f271716i;

        /* renamed from: j */
        public View.OnClickListener f271717j = new C94093a();

        /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$f$a */
        public class C94093a implements View.OnClickListener {
            public C94093a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00f1  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x0157  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x01b5  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0222  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r21) {
                /*
                    r20 = this;
                    r6 = r20
                    r7 = r21
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r0.add(r7)
                    java.lang.Object[] r5 = r0.toArray()
                    r0.clear()
                    java.lang.String r0 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    java.lang.String r1 = "android/view/View$OnClickListener"
                    java.lang.String r2 = "onClick"
                    java.lang.String r3 = "(Landroid/view/View;)V"
                    r4 = r20
                    j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                    r0 = 2131309063(0x7f093207, float:1.82364E38)
                    java.lang.Object r1 = r7.getTag(r0)
                    boolean r1 = r1 instanceof java.lang.Integer
                    java.lang.String r2 = "(Landroid/view/View;)V"
                    java.lang.String r3 = "onClick"
                    java.lang.String r4 = "android/view/View$OnClickListener"
                    java.lang.String r5 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    if (r1 != 0) goto L_0x0039
                    j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                    return
                L_0x0039:
                    java.lang.Object r0 = r7.getTag(r0)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    java.lang.String r1 = "MicroMsg.GameLocalMediaView"
                    if (r0 != 0) goto L_0x004c
                    java.lang.String r0 = "[onClick] null == position!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                    j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                    return
                L_0x004c:
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r8 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r8.f271711d
                    int r0 = r0.intValue()
                    java.lang.Object r0 = r8.get(r0)
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r0
                    if (r0 == 0) goto L_0x0231
                    java.lang.String r8 = r0.f162747d
                    boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                    if (r8 == 0) goto L_0x0066
                    goto L_0x0231
                L_0x0066:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "click Image path:"
                    r8.append(r9)
                    java.lang.String r9 = r0.f162747d
                    r8.append(r9)
                    java.lang.String r8 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r1 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271712e
                    boolean r1 = r1.contains(r0)
                    r8 = 1
                    r9 = 0
                    if (r1 == 0) goto L_0x0092
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r1 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271712e
                    r1.remove(r0)
                    r0 = 0
                L_0x0090:
                    r1 = 1
                    goto L_0x00ee
                L_0x0092:
                    java.lang.Class<ds.j> r1 = p143ds.C97526j.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    ds.j r1 = (p143ds.C97526j) r1
                    ds.l r1 = r1.Ww0()
                    int r1 = r1.mo128905a()
                    r10 = 3
                    if (r1 != r10) goto L_0x00d6
                    java.lang.String r1 = r0.f162755o
                    java.lang.String r10 = "image/gif"
                    boolean r1 = r1.equalsIgnoreCase(r10)
                    if (r1 == 0) goto L_0x00d6
                    java.lang.String r1 = r0.f162747d
                    com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
                    java.lang.Class<bq.z0> r1 = p008bq.C92293z0.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    bq.z0 r1 = (p008bq.C92293z0) r1
                    java.lang.String r10 = r0.f162747d
                    boolean r1 = r1.mo126039l1(r10)
                    if (r1 != 0) goto L_0x00d6
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r0 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    android.content.Context r0 = r0.f271713f
                    r1 = 2131830637(0x7f11276d, float:1.9294277E38)
                    java.lang.String r1 = r0.getString(r1)
                    nj3.C76879j.m92726T(r0, r1)
                    j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                    return
                L_0x00d6:
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r1 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271712e
                    int r1 = r1.size()
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r10 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    int r11 = r10.f271715h
                    if (r1 >= r11) goto L_0x00ec
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r10.f271712e
                    r1.add(r0)
                    r0 = 0
                    r1 = 0
                    goto L_0x00ee
                L_0x00ec:
                    r0 = 1
                    goto L_0x0090
                L_0x00ee:
                    r10 = 2
                    if (r0 == 0) goto L_0x014f
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r0 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    int r11 = r0.f271714g
                    if (r11 != r8) goto L_0x0114
                    android.content.Context r0 = r0.f271713f
                    android.content.res.Resources r11 = r0.getResources()
                    r12 = 2131689486(0x7f0f000e, float:1.9007989E38)
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r13 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    int r13 = r13.f271715h
                    java.lang.Object[] r14 = new java.lang.Object[r8]
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
                    r14[r9] = r15
                    java.lang.String r11 = r11.getQuantityString(r12, r13, r14)
                    nj3.C76879j.m92726T(r0, r11)
                    goto L_0x014f
                L_0x0114:
                    if (r11 != r10) goto L_0x0133
                    android.content.Context r0 = r0.f271713f
                    android.content.res.Resources r11 = r0.getResources()
                    r12 = 2131689489(0x7f0f0011, float:1.9007995E38)
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r13 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    int r13 = r13.f271715h
                    java.lang.Object[] r14 = new java.lang.Object[r8]
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
                    r14[r9] = r15
                    java.lang.String r11 = r11.getQuantityString(r12, r13, r14)
                    nj3.C76879j.m92726T(r0, r11)
                    goto L_0x014f
                L_0x0133:
                    android.content.Context r0 = r0.f271713f
                    android.content.res.Resources r11 = r0.getResources()
                    r12 = 2131689487(0x7f0f000f, float:1.900799E38)
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r13 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    int r13 = r13.f271715h
                    java.lang.Object[] r14 = new java.lang.Object[r8]
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
                    r14[r9] = r15
                    java.lang.String r11 = r11.getQuantityString(r12, r13, r14)
                    nj3.C76879j.m92726T(r0, r11)
                L_0x014f:
                    r0 = 2131309062(0x7f093206, float:1.8236397E38)
                    r11 = 2131309080(0x7f093218, float:1.8236434E38)
                    if (r8 != r1) goto L_0x01b5
                    java.lang.Object r0 = r7.getTag(r0)
                    android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                    r0.setChecked(r9)
                    java.lang.Object r0 = r7.getTag(r11)
                    android.view.View r0 = (android.view.View) r0
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                    r1.mo10233c(r8)
                    java.lang.Object[] r13 = r1.mo10232b()
                    java.lang.String r14 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    java.lang.String r15 = "onClick"
                    java.lang.String r16 = "(Landroid/view/View;)V"
                    java.lang.String r17 = "android/view/View_EXEC_"
                    java.lang.String r18 = "setVisibility"
                    java.lang.String r19 = "(I)V"
                    r12 = r0
                    j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                    java.lang.Object r1 = r1.mo10231a(r9)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r0.setVisibility(r1)
                    java.lang.String r13 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    java.lang.String r14 = "onClick"
                    java.lang.String r15 = "(Landroid/view/View;)V"
                    java.lang.String r16 = "android/view/View_EXEC_"
                    java.lang.String r17 = "setVisibility"
                    java.lang.String r18 = "(I)V"
                    j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                    java.lang.Object r0 = r7.getTag(r11)
                    android.view.View r0 = (android.view.View) r0
                    r1 = 2131100959(0x7f06051f, float:1.7814314E38)
                    r0.setBackgroundResource(r1)
                    goto L_0x021c
                L_0x01b5:
                    java.lang.Object r0 = r7.getTag(r0)
                    android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                    r0.setChecked(r8)
                    java.lang.Object r0 = r7.getTag(r11)
                    android.view.View r0 = (android.view.View) r0
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
                    r1.mo10233c(r12)
                    java.lang.Object[] r13 = r1.mo10232b()
                    java.lang.String r14 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    java.lang.String r15 = "onClick"
                    java.lang.String r16 = "(Landroid/view/View;)V"
                    java.lang.String r17 = "android/view/View_EXEC_"
                    java.lang.String r18 = "setVisibility"
                    java.lang.String r19 = "(I)V"
                    r12 = r0
                    j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                    java.lang.Object r1 = r1.mo10231a(r9)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r0.setVisibility(r1)
                    java.lang.String r13 = "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7"
                    java.lang.String r14 = "onClick"
                    java.lang.String r15 = "(Landroid/view/View;)V"
                    java.lang.String r16 = "android/view/View_EXEC_"
                    java.lang.String r17 = "setVisibility"
                    java.lang.String r18 = "(I)V"
                    j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                    java.lang.Object r0 = r7.getTag(r11)
                    android.view.View r0 = (android.view.View) r0
                    r1 = 2131099922(0x7f060112, float:1.781221E38)
                    r0.setBackgroundResource(r1)
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r0 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView r0 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.this
                    r1 = 0
                    int r7 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.f271697q
                    r0.mo129144c(r8, r10, r1)
                L_0x021c:
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r0 = com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.this
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$e r1 = r0.f271716i
                    if (r1 == 0) goto L_0x022d
                    java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r0.f271712e
                    int r0 = r0.size()
                    com.tencent.mm.plugin.game.media.GameLocalGalleryView$c r1 = (com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94090c) r1
                    r1.mo129149a(r0)
                L_0x022d:
                    j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                    return
                L_0x0231:
                    java.lang.String r0 = "[onClick] null == item!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                    j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94092f.C94093a.onClick(android.view.View):void");
            }
        }

        public C94092f(Context context) {
            this.f271713f = context;
            this.f271711d.add(new GalleryItem$ImageMediaItem());
            Log.m105924i("MicroMsg.GameLocalMediaView", "RecycleViewAdapter");
        }

        /* renamed from: F4 */
        public ArrayList<String> mo129150F4() {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<GalleryItem$MediaItem> it = this.f271712e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f162747d);
            }
            return arrayList;
        }

        public int getItemCount() {
            Log.m105925i("MicroMsg.GameLocalMediaView", "getItemCount, count : %d", Integer.valueOf(this.f271711d.size()));
            return this.f271711d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C94094g gVar = (C94094g) zVar;
            Log.m105924i("MicroMsg.GameLocalMediaView", "onBindViewHolder");
            GalleryItem$MediaItem galleryItem$MediaItem = this.f271711d.get(i2);
            if (galleryItem$MediaItem != null) {
                gVar.f271727z.setVisibility(0);
                if (galleryItem$MediaItem.getType() == 2) {
                    gVar.f271721B.setVisibility(0);
                    ((C31275q) C86312j.m106911c(C31275q.class)).mo57882Lt(gVar.f271722C, (GalleryItem$VideoMediaItem) galleryItem$MediaItem);
                } else {
                    gVar.f271721B.setVisibility(8);
                }
                if (galleryItem$MediaItem.f162755o.equalsIgnoreCase("edit")) {
                    gVar.f271726G.setVisibility(0);
                } else {
                    gVar.f271726G.setVisibility(8);
                }
                String e = galleryItem$MediaItem.mo80159e();
                String str = galleryItem$MediaItem.f162747d;
                if (!Util.isNullOrNil(e) || !Util.isNullOrNil(str)) {
                    if (galleryItem$MediaItem.getType() == 1) {
                        View view = gVar.f271724E;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        gVar.f271723D.setVisibility(0);
                        gVar.f271724E.setTag(C0966R.C0970id.gpz, Integer.valueOf(i));
                    } else {
                        View view3 = gVar.f271724E;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        gVar.f271723D.setVisibility(8);
                    }
                    ImageView imageView = gVar.f271727z;
                    ((C31276r) C86312j.m106911c(C31276r.class)).mo57884o5(gVar.f271720A, galleryItem$MediaItem.getType(), e, str, galleryItem$MediaItem.f162751h, -1, new C94112a(this, imageView), galleryItem$MediaItem.f162752i);
                    if (this.f271712e.contains(galleryItem$MediaItem)) {
                        gVar.f271723D.setChecked(true);
                        gVar.f271725F.setVisibility(0);
                        gVar.f271725F.setBackgroundResource(C0966R.color.f3552xi);
                    } else {
                        gVar.f271723D.setChecked(false);
                        gVar.f271725F.setVisibility(0);
                        gVar.f271725F.setBackgroundResource(C0966R.color.f3599z6);
                    }
                    gVar.f44854d.setOnClickListener(new C94113b(this, galleryItem$MediaItem));
                    return;
                }
                Log.m105920e("MicroMsg.GameLocalMediaView", "null or nil filepath: " + i2);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            Log.m105924i("MicroMsg.GameLocalMediaView", "onCreateViewHolder");
            C94094g gVar = new C94094g(GameLocalGalleryView.this, LayoutInflater.from(this.f271713f).inflate(C0966R.C0971layout.f359815ax3, viewGroup, false));
            gVar.f271724E.setOnClickListener(this.f271717j);
            return gVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView$g */
    public class C94094g extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f271720A;

        /* renamed from: B */
        public RelativeLayout f271721B;

        /* renamed from: C */
        public TextView f271722C;

        /* renamed from: D */
        public CheckBox f271723D;

        /* renamed from: E */
        public View f271724E;

        /* renamed from: F */
        public ImageView f271725F;

        /* renamed from: G */
        public ImageView f271726G;

        /* renamed from: z */
        public ImageView f271727z;

        public C94094g(GameLocalGalleryView gameLocalGalleryView, View view) {
            super(view);
            this.f271727z = (ImageView) view.findViewById(C0966R.C0970id.gqk);
            this.f271720A = (ImageView) view.findViewById(C0966R.C0970id.gqq);
            this.f271721B = (RelativeLayout) view.findViewById(C0966R.C0970id.l6d);
            this.f271722C = (TextView) view.findViewById(C0966R.C0970id.l6f);
            this.f271723D = (CheckBox) view.findViewById(C0966R.C0970id.gpy);
            this.f271724E = view.findViewById(C0966R.C0970id.gpz);
            this.f271725F = (ImageView) view.findViewById(C0966R.C0970id.gqe);
            this.f271724E.setTag(C0966R.C0970id.gpy, this.f271723D);
            this.f271724E.setTag(C0966R.C0970id.gqe, this.f271725F);
            this.f271726G = (ImageView) view.findViewById(C0966R.C0970id.cb4);
        }
    }

    public GameLocalGalleryView(Context context) {
        super(context);
        mo129143b();
    }

    /* renamed from: B3 */
    public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        if (this.f271707p == j) {
            ArrayList arrayList = new ArrayList();
            if (linkedList != null) {
                arrayList.addAll(linkedList);
            }
            C94092f fVar = this.f271699e;
            if (fVar != null) {
                fVar.getClass();
                MMHandlerThread.postToMainThread(new C94116c(fVar, arrayList));
            }
        }
    }

    /* renamed from: a */
    public void mo129142a() {
        C94092f fVar = this.f271699e;
        fVar.f271712e.clear();
        C94091e eVar = fVar.f271716i;
        if (eVar != null) {
            ((C94090c) eVar).mo129149a(fVar.f271712e.size());
        }
        GameLocalGalleryView.this.postDelayed(new C94117d(fVar), 500);
    }

    /* renamed from: b */
    public final void mo129143b() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.axl, this, false);
        this.f271698d = (RecyclerView) inflate.findViewById(C0966R.C0970id.em7);
        this.f271698d.setLayoutManager(new GameGridLayoutManager(getContext(), 4));
        this.f271698d.mo17085h0(new C4565d(this));
        C94092f fVar = new C94092f(getContext());
        this.f271699e = fVar;
        this.f271698d.setAdapter(fVar);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ema);
        this.f271700f = textView;
        textView.setOnClickListener(new C94088a());
        Button button = (Button) inflate.findViewById(C0966R.C0970id.em9);
        this.f271701g = button;
        button.setOnClickListener(new C94089b());
        this.f271699e.f271716i = new C94090c();
        addView(inflate, -1, -1);
    }

    /* renamed from: c */
    public final void mo129144c(int i, int i2, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        C40314g.m43484c(MMApplicationContext.getContext(), 87, 8767, i, i2, this.f271706o, C15032a.m14200a(7, map));
    }

    public void setQueryType(int i) {
        this.f271699e.f271714g = i;
        Class cls = C97526j.class;
        ((C97526j) C86312j.m106911c(cls)).Ww0().mo128903I(i);
        ((C97526j) C86312j.m106911c(cls)).Ww0().mo128904M2(15);
        ((C97526j) C86312j.m106911c(cls)).Ww0().mo128902C5(this);
        this.f271707p = System.currentTimeMillis();
        ((C97526j) C86312j.m106911c(cls)).Ww0().mo128911o1("", this.f271707p);
    }

    public void setSelectLimitCount(int i) {
        this.f271699e.f271715h = i;
        this.f271702h = i;
    }

    public GameLocalGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo129143b();
    }

    public GameLocalGalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo129143b();
    }
}
