package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93629k;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93638m;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc1.C99408u;
import nj3.C11184p0;
import nj3.C76879j;
import p159gw.C98250h;
import p910lj.C76701a;
import pb1.C100695a0;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100752x0;
import pb1.C100755z;
import pb1.C100759z0;
import qo3.C47883u;
import qo3.C77426q;
import te3.C101755ad0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101841sc0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n */
public class C93642n extends RecyclerView.C16613e {

    /* renamed from: d */
    public Context f270393d;

    /* renamed from: e */
    public C93650p f270394e;

    /* renamed from: f */
    public List<C93647f> f270395f = null;

    /* renamed from: g */
    public C20937c f270396g = null;

    /* renamed from: h */
    public boolean f270397h = true;

    /* renamed from: i */
    public boolean f270398i;

    /* renamed from: j */
    public C68908e f270399j;

    /* renamed from: n */
    public C93646d f270400n;

    /* renamed from: o */
    public C101811md0 f270401o = new C101811md0();

    /* renamed from: p */
    public Runnable f270402p;

    /* renamed from: q */
    public FavoriteImageServer f270403q;

    /* renamed from: r */
    public C100723m0 f270404r = new C93643a();

    /* renamed from: s */
    public boolean f270405s = false;

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$b */
    public class C68907b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C68909g f198010d;

        public C68907b(C93642n nVar, C68909g gVar) {
            this.f198010d = gVar;
        }

        public void onGlobalLayout() {
            this.f198010d.f198019z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f198010d.f198013C.setLayoutParams(new RelativeLayout.LayoutParams(this.f198010d.f198019z.getWidth(), this.f198010d.f198019z.getHeight()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$e */
    public interface C68908e {
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g */
    public class C68909g extends RecyclerView.C16631z {

        /* renamed from: A */
        public View f198011A;

        /* renamed from: B */
        public TextView f198012B;

        /* renamed from: C */
        public ImageView f198013C;

        /* renamed from: D */
        public View f198014D;

        /* renamed from: E */
        public CheckBox f198015E;

        /* renamed from: F */
        public View f198016F;

        /* renamed from: G */
        public View.OnLongClickListener f198017G = new C68913d();

        /* renamed from: z */
        public ImageView f198019z;

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$a */
        public class C68910a implements View.OnTouchListener {
            public C68910a(C68909g gVar, C93642n nVar) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getAction() == 0) {
                    view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$b */
        public class C68911b implements View.OnClickListener {
            public C68911b(C93642n nVar) {
            }

            public void onClick(View view) {
                C93647f fVar;
                C101841sc0 sc02;
                C101755ad0 ad02;
                View view2 = view;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view2);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Object tag = view2.getTag(C0966R.C0970id.cv8);
                if (tag == null) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C93647f G4 = C93642n.this.mo128565G4(((Integer) tag).intValue());
                if (G4 == null) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C93642n nVar = C93642n.this;
                nVar.getClass();
                Intent intent = new Intent();
                if (G4 == null) {
                    Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
                } else {
                    C93637l lVar = G4.f270412b;
                    if (lVar == null) {
                        Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
                    } else {
                        if (lVar.f270387a != null) {
                            ((C100759z0) C86312j.m106911c(C100759z0.class)).mo61499ni(Long.valueOf(lVar.f270387a.field_localId));
                        }
                        if (lVar.mo128558b()) {
                            C101834rc0 rc02 = lVar.f270388b;
                            if (rc02 == null || (sc02 = rc02.f299296c1) == null || (ad02 = sc02.f299422x) == null) {
                                Log.m105928w("MicroMsg.MediaHistoryGalleryAdapter", "enterGallery favMpMsgItem is null");
                            } else {
                                C99408u.m129726h(nVar.f270393d, ad02, rc02, false);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i = 0;
                            for (C93647f fVar2 : nVar.f270395f) {
                                int i2 = i;
                                long j = fVar2.f270412b.f270387a.field_localId;
                                if (!arrayList2.contains(Long.valueOf(j))) {
                                    arrayList2.add(Long.valueOf(j));
                                    fVar = G4;
                                    if (j == G4.f270412b.f270387a.field_localId) {
                                        i = arrayList2.size() - 1;
                                        G4 = fVar;
                                    }
                                } else {
                                    fVar = G4;
                                }
                                i = i2;
                                G4 = fVar;
                            }
                            int i3 = i;
                            long[] jArr = new long[arrayList2.size()];
                            int i4 = i3 - 20;
                            if (i4 <= 0) {
                                i4 = 0;
                            }
                            int i5 = i3 + 20;
                            if (i5 >= arrayList2.size()) {
                                i5 = arrayList2.size();
                            }
                            while (i4 < i5) {
                                jArr[i4] = ((Long) arrayList2.get(i4)).longValue();
                                i4++;
                            }
                            intent.addFlags(536870912);
                            intent.putExtra("KEY_MEDIA_FAVID_LIST", jArr).putExtra("key_detail_info_id", lVar.f270387a.field_localId).putExtra("key_detail_data_id", lVar.f270388b.f299280T);
                            intent.putExtra("key_detail_fav_scene", nVar.f270401o.f298813d);
                            intent.putExtra("key_detail_fav_sub_scene", nVar.f270401o.f298814e);
                            intent.putExtra("key_detail_fav_index", 0);
                            intent.putExtra("key_detail_fav_query", nVar.f270401o.f298817h);
                            intent.putExtra("key_detail_fav_sessionid", nVar.f270401o.f298816g);
                            intent.putExtra("key_detail_fav_tags", nVar.f270401o.f298818i);
                            C100734q.m131875t0(nVar.f270393d, ".ui.gallery.FavMediaGalleryUI", intent, (Bundle) null);
                            ((Activity) nVar.f270393d).overridePendingTransition(0, 0);
                        }
                    }
                }
                C93646d dVar = C93642n.this.f270400n;
                if (dVar != null) {
                    int intValue = ((Integer) view2.getTag(C0966R.C0970id.cv8)).intValue();
                    C93629k.C93636f fVar3 = ((C93629k) dVar).f270371q;
                    if (fVar3 != null) {
                        fVar3.mo128263j(intValue);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$c */
        public class C68912c implements View.OnClickListener {
            public C68912c(C93642n nVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z = !C68909g.this.f198015E.isChecked();
                C93638m mVar = C93638m.C93640b.f270392a;
                if (mVar.f270389a.size() < 9) {
                    C68909g.this.f198015E.setChecked(z);
                    if (!z) {
                        C68909g.this.f198013C.setVisibility(8);
                    } else {
                        C68909g.this.f198013C.setVisibility(0);
                    }
                } else if (!z) {
                    C68909g.this.f198015E.setChecked(z);
                }
                if (C93642n.this.f270399j != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    C93647f G4 = C93642n.this.mo128565G4(intValue);
                    C93656r rVar = (C93656r) C93642n.this.f270399j;
                    rVar.getClass();
                    Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", Boolean.valueOf(z), Integer.valueOf(intValue));
                    if (!z || mVar.f270389a.size() < 9) {
                        if (z) {
                            C93637l lVar = G4.f270412b;
                            if (lVar != null) {
                                Log.m105925i("MicroMsg.ImageGallerySelectedHandle", "add : %s", lVar);
                                mVar.f270389a.remove(lVar);
                                mVar.f270389a.remove(mVar.mo128562b(lVar.f270388b.f299280T));
                                mVar.f270389a.add(lVar);
                                Iterator<C93638m.C93641c> it = mVar.f270391c.iterator();
                                while (it.hasNext()) {
                                    it.next().mo128563c(lVar, true);
                                }
                            }
                        } else {
                            C93637l lVar2 = G4.f270412b;
                            if (lVar2 != null) {
                                Log.m105925i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", lVar2.f270388b.f299280T);
                                mVar.f270389a.remove(lVar2);
                                mVar.f270389a.remove(mVar.mo128562b(lVar2.f270388b.f299280T));
                                Iterator<C93638m.C93641c> it4 = mVar.f270391c.iterator();
                                while (it4.hasNext()) {
                                    it4.next().mo128563c(lVar2, false);
                                }
                            }
                        }
                        rVar.f270435a.f270418a.mo128543H(mVar.f270389a.size());
                    } else {
                        Context context = rVar.f270435a.f270420c;
                        C76701a.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.cmi, new Object[]{9}), 1).show();
                        rVar.f270435a.f270421d.notifyItemChanged(intValue);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d */
        public class C68913d implements View.OnLongClickListener {

            /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$a */
            public class C68914a implements PopupWindow.OnDismissListener {
                public C68914a() {
                }

                public void onDismiss() {
                    C68909g gVar = C68909g.this;
                    ImageView imageView = gVar.f198013C;
                    if (imageView != null && !C93642n.this.f270405s) {
                        imageView.setVisibility(8);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$b */
            public class C68915b implements View.OnCreateContextMenuListener {

                /* renamed from: d */
                public final /* synthetic */ C93647f f198024d;

                public C68915b(C93647f fVar) {
                    this.f198024d = fVar;
                }

                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    int i;
                    String w = C100734q.m131880w(this.f198024d.f270412b.f270388b);
                    boolean k = C86013q1.m106450k(w);
                    boolean isGif = ImgUtil.isGif(w);
                    boolean z = this.f198024d.f270414d;
                    if (!z && k && !isGif) {
                        contextMenu.add(0, 0, 0, C93642n.this.f270393d.getString(C0966R.string.crb));
                        contextMenu.add(0, 1, 0, C93642n.this.f270393d.getString(C0966R.string.cpw));
                        contextMenu.add(0, 2, 0, C93642n.this.f270393d.getString(C0966R.string.cr5));
                    } else if (!z || !k || isGif) {
                        Log.m105919d("MicroMsg.MediaHistoryGalleryAdapter", "openPopupMenu, isVideo:%s, exist:%s, isGif:%s", Boolean.valueOf(z), Boolean.valueOf(k), Boolean.valueOf(isGif));
                    } else {
                        contextMenu.add(0, 0, 0, C93642n.this.f270393d.getString(C0966R.string.crb));
                        contextMenu.add(0, 2, 0, C93642n.this.f270393d.getString(C0966R.string.iar));
                    }
                    if (k) {
                        C100755z zVar = this.f198024d.f270412b.f270387a;
                        if (zVar != null && ((i = zVar.field_type) == 18 || i == 14)) {
                            contextMenu.add(0, 4, 0, C93642n.this.f270393d.getString(C0966R.string.coq));
                        }
                        contextMenu.add(0, 5, 0, C0966R.string.f360418cn2);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c */
            public class C68916c implements C11184p0 {

                /* renamed from: d */
                public final /* synthetic */ C93647f f198026d;

                /* renamed from: e */
                public final /* synthetic */ int f198027e;

                /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c$a */
                public class C68917a implements C98250h.C98251a {
                    public C68917a() {
                    }

                    /* renamed from: a */
                    public void mo2055a(String str, String str2) {
                        Context context = C93642n.this.f270393d;
                        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}), 1).show();
                    }

                    /* renamed from: b */
                    public void mo2056b(String str, String str2) {
                        Context context = C93642n.this.f270393d;
                        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.cr4), 1).show();
                    }
                }

                /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c$b */
                public class C68918b implements C98250h.C98251a {
                    public C68918b() {
                    }

                    /* renamed from: a */
                    public void mo2055a(String str, String str2) {
                        Log.m105925i("MicroMsg.MediaHistoryGalleryAdapter", "save video now video path %s out path %s", str, str2);
                        Context context = C93642n.this.f270393d;
                        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
                    }

                    /* renamed from: b */
                    public void mo2056b(String str, String str2) {
                        Log.m105921e("MicroMsg.MediaHistoryGalleryAdapter", "FAILURE save video now video path %s out path %s", str, str2);
                        Context context = C93642n.this.f270393d;
                        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.kag), 1).show();
                    }
                }

                /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c$c */
                public class C68919c implements C47883u {
                    public C68919c(C68916c cVar) {
                    }

                    /* renamed from: a */
                    public void mo353a(boolean z, String str) {
                    }
                }

                /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c$d */
                public class C68920d implements C47883u {
                    public C68920d() {
                    }

                    /* renamed from: a */
                    public void mo353a(boolean z, String str) {
                        C68916c cVar = C68916c.this;
                        C93642n.m118315F4(C93642n.this, cVar.f198027e, cVar.f198026d);
                    }
                }

                /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$g$d$c$e */
                public class C68921e implements DialogInterface.OnClickListener {

                    /* renamed from: d */
                    public final /* synthetic */ C100755z f198032d;

                    public C68921e(C100755z zVar) {
                        this.f198032d = zVar;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C100734q.m131858l(this.f198032d, C93642n.this.f270402p, 7);
                        C68916c cVar = C68916c.this;
                        C93646d dVar = C93642n.this.f270400n;
                        if (dVar != null) {
                            int i2 = cVar.f198027e;
                            C93629k.C93636f fVar = ((C93629k) dVar).f270371q;
                            if (fVar != null) {
                                fVar.mo128261T2(i2, 1);
                            }
                        }
                    }
                }

                public C68916c(C93647f fVar, int i) {
                    this.f198026d = fVar;
                    this.f198027e = i;
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int i2;
                    Class cls = C98250h.class;
                    String w = C100734q.m131880w(this.f198026d.f270412b.f270388b);
                    int itemId = menuItem.getItemId();
                    if (itemId == 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f198026d.f270412b);
                        C93642n.this.f270394e.mo128544I(arrayList);
                    } else if (itemId == 1) {
                        C100695a0.m131729d(this.f198026d.f270412b.f270387a.field_localId, 0, 0, -1);
                        C100734q.m131873s0(w, C93642n.this.f270393d);
                        C93646d dVar = C93642n.this.f270400n;
                        if (dVar != null) {
                            int i3 = this.f198027e;
                            C93629k.C93636f fVar = ((C93629k) dVar).f270371q;
                            if (fVar != null) {
                                fVar.mo128262a4(i3);
                            }
                        }
                    } else if (itemId == 2) {
                        C93646d dVar2 = C93642n.this.f270400n;
                        if (dVar2 != null) {
                            int i4 = this.f198027e;
                            C93629k.C93636f fVar2 = ((C93629k) dVar2).f270371q;
                            if (fVar2 != null) {
                                fVar2.mo128265u2(i4);
                            }
                        }
                        if (Util.isNullOrNil(w)) {
                            Log.m105928w("MicroMsg.MediaHistoryGalleryAdapter", "save image fail, path is null");
                        } else if (!this.f198026d.f270414d) {
                            ((C98250h) C86312j.m106911c(cls)).mo137346Zv(C93642n.this.f270393d, w, new C68917a());
                        } else {
                            ((C98250h) C86312j.m106911c(cls)).mo137342Lm(C93642n.this.f270393d, w, new C68918b());
                        }
                    } else if (itemId == 4) {
                        C93642n.m118315F4(C93642n.this, this.f198027e, this.f198026d);
                    } else if (itemId == 5) {
                        C100755z zVar = this.f198026d.f270412b.f270387a;
                        if (zVar == null || !((i2 = zVar.field_type) == 18 || i2 == 14)) {
                            Context context = C93642n.this.f270393d;
                            C76879j.m92708B(context, context.getString(C0966R.string.cn4), "", C93642n.this.f270393d.getString(C0966R.string.f7944x1), C93642n.this.f270393d.getString(C0966R.string.bj_), new C68921e(zVar), (DialogInterface.OnClickListener) null, C0966R.color.a_3);
                            return;
                        }
                        C77426q qVar = new C77426q(C93642n.this.f270393d);
                        qVar.mo107595g(C93642n.this.f270393d.getString(C0966R.string.cn6));
                        qVar.mo107598j(C93642n.this.f270393d.getString(C0966R.string.f360416cn0));
                        qVar.mo107602n(C93642n.this.f270393d.getString(C0966R.string.coq));
                        qVar.mo107591c(new C68919c(this), new C68920d());
                        qVar.mo107603o();
                    }
                }
            }

            public C68913d() {
            }

            /* renamed from: a */
            public void mo94812a(View view, int i, int i2) {
                int intValue = ((Integer) view.getTag(C0966R.C0970id.cv8)).intValue();
                C93647f G4 = C93642n.this.mo128565G4(intValue);
                if (G4 != null) {
                    C78253a aVar = new C78253a(C93642n.this.f270393d);
                    C68909g.this.f198013C.setVisibility(0);
                    aVar.f229227C = new C68914a();
                    aVar.mo108273h(view, new C68915b(G4), new C68916c(G4, intValue), i, i2);
                }
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                if (C93642n.this.f270405s) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
                if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                    int[] iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
                    mo94812a(view, iArr[0], iArr[1]);
                } else {
                    mo94812a(view, 0, 0);
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C68909g(View view) {
            super(view);
            this.f198019z = (ImageView) view.findViewById(C0966R.C0970id.eqq);
            this.f198011A = view.findViewById(C0966R.C0970id.l7r);
            this.f198014D = view.findViewById(C0966R.C0970id.jl_);
            this.f198012B = (TextView) view.findViewById(C0966R.C0970id.l7o);
            this.f198013C = (ImageView) view.findViewById(C0966R.C0970id.eqt);
            this.f198015E = (CheckBox) view.findViewById(C0966R.C0970id.gpy);
            View findViewById = view.findViewById(C0966R.C0970id.gpz);
            this.f198016F = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198015E.setVisibility(8);
            View view3 = this.f198011A;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198012B.setVisibility(8);
            View view4 = this.f198014D;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198019z.setOnTouchListener(new C68910a(this, C93642n.this));
            this.f198019z.setOnClickListener(new C68911b(C93642n.this));
            this.f198019z.setOnLongClickListener(this.f198017G);
            this.f198016F.setOnClickListener(new C68912c(C93642n.this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$a */
    public class C93643a implements C100723m0 {

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$a$a */
        public class C93644a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f270407d;

            public C93644a(int i) {
                this.f270407d = i;
            }

            public void run() {
                Log.m105925i("MicroMsg.MediaHistoryGalleryAdapter", "notifyIndex :%s", Integer.valueOf(this.f270407d));
                C93642n.this.notifyItemChanged(this.f270407d);
            }
        }

        public C93643a() {
        }

        /* renamed from: R4 */
        public void mo128275R4(C100746u uVar) {
            String str;
            for (int i = 0; i < C93642n.this.f270395f.size(); i++) {
                C93647f fVar = C93642n.this.f270395f.get(i);
                String str2 = fVar.f270412b.f270388b.f299280T;
                String str3 = uVar.field_dataId;
                if (str3 == null || !str3.endsWith("_t")) {
                    str = str3;
                } else {
                    String[] split = str3.split("_");
                    str = (split == null || split.length != 2) ? "" : split[0];
                }
                if (str2 != null && str != null && str2.equals(str) && uVar.mo140168o2()) {
                    Log.m105925i("MicroMsg.MediaHistoryGalleryAdapter", "sameDataId, filedDataId:%s, truePath:%s", str3, C86013q1.m106448i(fVar.f270411a, false));
                    MMHandlerThread.postToMainThread(new C93644a(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$c */
    public class C93645c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ProgressBar f270409A;

        /* renamed from: z */
        public TextView f270410z;

        public C93645c(C93642n nVar, View view) {
            super(view);
            this.f270410z = (TextView) view.findViewById(C0966R.C0970id.f357830bz2);
            this.f270409A = (ProgressBar) view.findViewById(C0966R.C0970id.g2x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$d */
    public interface C93646d {
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$f */
    public static class C93647f {

        /* renamed from: a */
        public String f270411a;

        /* renamed from: b */
        public C93637l f270412b;

        /* renamed from: c */
        public long f270413c;

        /* renamed from: d */
        public boolean f270414d;

        /* renamed from: e */
        public boolean f270415e;

        /* renamed from: f */
        public C93648a f270416f = new C93648a(this);

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.n$f$a */
        public class C93648a {

            /* renamed from: a */
            public String f270417a;

            public C93648a(C93647f fVar) {
            }
        }

        public C93647f(C93637l lVar) {
            String str;
            this.f270412b = lVar;
            if (lVar == null) {
                Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
                str = "";
            } else {
                str = lVar.mo128557a();
            }
            this.f270411a = str;
            this.f270413c = lVar.f270387a.field_updateTime;
            if (lVar.mo128560d() || lVar.mo128559c()) {
                this.f270414d = true;
                this.f270416f.f270417a = Util.formatSecToMin(lVar.f270388b.f299338y);
            }
            if (lVar.mo128558b()) {
                this.f270415e = true;
            }
        }

        public boolean equals(Object obj) {
            C93637l lVar = this.f270412b;
            return (lVar == null || !(obj instanceof C93637l) || obj == null) ? super.equals(obj) : lVar.f270388b.f299280T.equals(((C93637l) obj).f270388b.f299280T);
        }
    }

    public C93642n(Context context, List<C93647f> list, int i, C93650p pVar, FavoriteImageServer favoriteImageServer, Runnable runnable) {
        this.f270395f = list;
        this.f270397h = C86709a0.m107535s().mo121147n();
        this.f270393d = context;
        this.f270394e = pVar;
        this.f270403q = favoriteImageServer;
        this.f270402p = runnable;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59353i = 1;
        bVar.f59366v = true;
        bVar.f59355k = C76577a.m92145A(context) / i;
        bVar.f59354j = C76577a.m92145A(context) / i;
        bVar.f59361q = C0966R.color.a88;
        this.f270396g = bVar.mo32666a();
    }

    /* renamed from: F4 */
    public static void m118315F4(C93642n nVar, int i, C93647f fVar) {
        C93629k.C93636f fVar2;
        C93646d dVar = nVar.f270400n;
        if (!(dVar == null || (fVar2 = ((C93629k) dVar).f270371q) == null)) {
            fVar2.mo128255G5(i);
        }
        nVar.f270401o.f298815f = nVar.getItemCount() - i;
        C93637l lVar = fVar.f270412b;
        lVar.f270387a.f295175T0 = lVar.f270388b.f299280T;
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(nVar.f270393d, fVar.f270412b.f270387a, nVar.f270401o);
    }

    /* renamed from: G4 */
    public C93647f mo128565G4(int i) {
        if (i < 0) {
            return null;
        }
        return this.f270395f.get(i);
    }

    public int getItemCount() {
        return this.f270395f.size();
    }

    public int getItemViewType(int i) {
        mo128565G4(i).getClass();
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        if (list == null || list.size() <= 0 || !(zVar instanceof C68909g)) {
            super.onBindViewHolder(zVar, i, list);
        } else if (((Integer) list.get(0)).intValue() == 0) {
            C68909g gVar = (C68909g) zVar;
            gVar.f198015E.setChecked(false);
            gVar.f198015E.setVisibility(0);
            View view = gVar.f198016F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C68909g gVar2 = (C68909g) zVar;
            gVar2.f198015E.setChecked(false);
            gVar2.f198015E.setVisibility(8);
            View view3 = gVar2.f198016F;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == Integer.MAX_VALUE ? new C93645c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a6l, viewGroup, false)) : new C68909g(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a6m, viewGroup, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r0.f270397h
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 1
            java.lang.String r7 = "MicroMsg.MediaHistoryGalleryAdapter"
            if (r3 != 0) goto L_0x0020
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1[r4] = r2
            java.lang.String r2 = "[onBindViewHolder] isSDCardAvailable:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r1)
            return
        L_0x0020:
            com.tencent.mm.plugin.fav.ui.gallery.n$f r3 = r0.mo128565G4(r2)
            int r8 = r1.f44859i
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 8
            if (r8 != r9) goto L_0x0092
            com.tencent.mm.plugin.fav.ui.gallery.n$c r1 = (com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n.C93645c) r1
            int r5 = r23.getItemCount()
            int r5 = r5 - r6
            if (r2 == r5) goto L_0x008b
            int r2 = r2 + r6
            com.tencent.mm.plugin.fav.ui.gallery.n$f r2 = r0.mo128565G4(r2)
            long r5 = r2.f270413c
            java.util.Date r2 = new java.util.Date
            r2.<init>(r5)
            com.tencent.mm.ui.gridviewheaders.a r5 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
            long r5 = r5.mo103933a(r2)
            long r7 = r3.f270413c
            java.util.Date r2 = new java.util.Date
            r2.<init>(r7)
            com.tencent.mm.ui.gridviewheaders.a r7 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
            long r7 = r7.mo103933a(r2)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x005e
            goto L_0x008b
        L_0x005e:
            android.widget.TextView r2 = r1.f270410z
            r2.setVisibility(r4)
            android.widget.TextView r2 = r1.f270410z
            long r5 = r3.f270413c
            java.util.Date r3 = new java.util.Date
            r3.<init>(r5)
            com.tencent.mm.ui.gridviewheaders.a r5 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
            android.content.Context r6 = r0.f270393d
            java.lang.String r3 = r5.mo103936d(r3, r6)
            r2.setText(r3)
            boolean r2 = r0.f270398i
            if (r2 == 0) goto L_0x0084
            android.widget.ProgressBar r1 = r1.f270409A
            r1.setVisibility(r4)
            goto L_0x02dd
        L_0x0084:
            android.widget.ProgressBar r1 = r1.f270409A
            r1.setVisibility(r10)
            goto L_0x02dd
        L_0x008b:
            android.widget.TextView r1 = r1.f270410z
            r1.setVisibility(r10)
            goto L_0x02dd
        L_0x0092:
            com.tencent.mm.plugin.fav.ui.gallery.n$g r1 = (com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n.C68909g) r1
            android.widget.ImageView r8 = r1.f198019z
            r9 = 2131302147(0x7f091703, float:1.8222372E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r25)
            r8.setTag(r9, r11)
            android.view.View r8 = r1.f198016F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r8.setTag(r2)
            boolean r2 = r3.f270415e
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x00f3
            com.tencent.mm.plugin.fav.ui.gallery.l r2 = r3.f270412b
            java.lang.String r2 = r2.mo128557a()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x00d8
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r7 = r3.f270411a
            android.widget.ImageView r9 = r1.f198019z
            hc0.c$b r11 = new hc0.c$b
            r11.<init>()
            r11.f59366v = r6
            r12 = 2131101283(0x7f060663, float:1.7814971E38)
            r11.f59361q = r12
            hc0.c r11 = r11.mo32666a()
            r2.mo32519h(r7, r9, r11)
            goto L_0x0157
        L_0x00d8:
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r12 = r0.f270403q
            android.widget.ImageView r13 = r1.f198019z
            com.tencent.mm.plugin.fav.ui.gallery.l r2 = r3.f270412b
            te3.rc0 r14 = r2.f270388b
            pb1.z r15 = r2.f270387a
            r16 = 2131101283(0x7f060663, float:1.7814971E38)
            hc0.c r2 = r0.f270396g
            int r7 = r2.f59325i
            int r2 = r2.f59326j
            r17 = r7
            r18 = r2
            r12.mo128331e(r13, r14, r15, r16, r17, r18)
            goto L_0x0157
        L_0x00f3:
            com.tencent.mm.plugin.fav.ui.gallery.l r2 = r3.f270412b
            if (r2 != 0) goto L_0x00fe
            java.lang.String r2 = "[getImagePath] msg is null !"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            r2 = r8
            goto L_0x0102
        L_0x00fe:
            java.lang.String r2 = r2.mo128557a()
        L_0x0102:
            r3.f270411a = r2
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0118
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r7 = r3.f270411a
            android.widget.ImageView r9 = r1.f198019z
            hc0.c r11 = r0.f270396g
            r2.mo32519h(r7, r9, r11)
            goto L_0x0157
        L_0x0118:
            boolean r2 = r3.f270414d
            if (r2 == 0) goto L_0x0137
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r11 = r0.f270403q
            android.widget.ImageView r12 = r1.f198019z
            com.tencent.mm.plugin.fav.ui.gallery.l r2 = r3.f270412b
            te3.rc0 r13 = r2.f270388b
            pb1.z r14 = r2.f270387a
            r15 = 2131101283(0x7f060663, float:1.7814971E38)
            hc0.c r2 = r0.f270396g
            int r7 = r2.f59325i
            int r2 = r2.f59326j
            r16 = r7
            r17 = r2
            r11.mo128331e(r12, r13, r14, r15, r16, r17)
            goto L_0x0157
        L_0x0137:
            android.widget.ImageView r2 = r1.f198019z
            r17 = 2131101283(0x7f060663, float:1.7814971E38)
            com.tencent.mm.plugin.fav.ui.gallery.l r7 = r3.f270412b
            te3.rc0 r9 = r7.f270388b
            pb1.z r7 = r7.f270387a
            r20 = 0
            hc0.c r11 = r0.f270396g
            int r12 = r11.f59325i
            int r11 = r11.f59326j
            r16 = r2
            r18 = r9
            r19 = r7
            r21 = r12
            r22 = r11
            com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118077d(r16, r17, r18, r19, r20, r21, r22)
        L_0x0157:
            boolean r2 = r3.f270414d
            if (r2 == 0) goto L_0x01ae
            android.view.View r2 = r1.f198011A
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r12 = r7.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r12 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.TextView r2 = r1.f198012B
            r2.setVisibility(r4)
            android.widget.TextView r2 = r1.f198012B
            com.tencent.mm.plugin.fav.ui.gallery.n$f$a r7 = r3.f270416f
            java.lang.String r7 = r7.f270417a
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r8)
            r2.setText(r7)
            goto L_0x01f7
        L_0x01ae:
            android.widget.TextView r2 = r1.f198012B
            r2.setVisibility(r10)
            android.view.View r2 = r1.f198011A
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo10233c(r8)
            java.lang.Object[] r12 = r7.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r12 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x01f7:
            android.widget.ImageView r2 = r1.f198019z
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            com.tencent.mm.plugin.fav.ui.gallery.n$b r7 = new com.tencent.mm.plugin.fav.ui.gallery.n$b
            r7.<init>(r0, r1)
            r2.addOnGlobalLayoutListener(r7)
            boolean r2 = r0.f270405s
            if (r2 == 0) goto L_0x0291
            android.view.View r2 = r1.f198016F
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r12 = r7.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r5 = r7.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.CheckBox r2 = r1.f198015E
            r2.setVisibility(r4)
            com.tencent.mm.plugin.fav.ui.gallery.m r2 = com.tencent.p014mm.plugin.fav.p047ui.gallery.C93638m.C93640b.f270392a
            com.tencent.mm.plugin.fav.ui.gallery.l r3 = r3.f270412b
            if (r3 != 0) goto L_0x0256
            r2.getClass()
            goto L_0x0278
        L_0x0256:
            java.util.ArrayList<com.tencent.mm.plugin.fav.ui.gallery.l> r2 = r2.f270389a
            java.util.Iterator r2 = r2.iterator()
        L_0x025c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0278
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.fav.ui.gallery.l r5 = (com.tencent.p014mm.plugin.fav.p047ui.gallery.C93637l) r5
            te3.rc0 r5 = r5.f270388b
            java.lang.String r5 = r5.f299280T
            te3.rc0 r7 = r3.f270388b
            java.lang.String r7 = r7.f299280T
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x025c
            r2 = 1
            goto L_0x0279
        L_0x0278:
            r2 = 0
        L_0x0279:
            if (r2 == 0) goto L_0x0286
            android.widget.ImageView r2 = r1.f198013C
            r2.setVisibility(r4)
            android.widget.CheckBox r1 = r1.f198015E
            r1.setChecked(r6)
            goto L_0x02dd
        L_0x0286:
            android.widget.ImageView r2 = r1.f198013C
            r2.setVisibility(r10)
            android.widget.CheckBox r1 = r1.f198015E
            r1.setChecked(r4)
            goto L_0x02dd
        L_0x0291:
            android.widget.ImageView r2 = r1.f198013C
            r2.setVisibility(r10)
            android.view.View r2 = r1.f198016F
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.CheckBox r1 = r1.f198015E
            r1.setVisibility(r10)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }
}
