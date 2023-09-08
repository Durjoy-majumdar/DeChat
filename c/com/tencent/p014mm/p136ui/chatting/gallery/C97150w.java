package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72932v1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.AssetExtension;
import di3.C86312j;
import eb0.C97621e;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p910lj.C76701a;
import te3.tc4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.w */
public class C97150w extends C97030a implements MTimerHandler.CallBack, C101489t.C77595a, C97621e.C97622a {

    /* renamed from: e */
    public HashMap<String, ImageGalleryVideoHandler$$k> f285085e = new HashMap<>();

    /* renamed from: f */
    public C97621e f285086f;

    /* renamed from: g */
    public boolean f285087g = false;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.w$a */
    public class C97151a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C97087m1 f285088d;

        public C97151a(C97087m1 m1Var) {
            this.f285088d = m1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97087m1 m1Var = this.f285088d;
            m1Var.mo135969e();
            m1Var.f284839f.mo24789e(C97150w.this.f284638d.f284714g.getContext(), true);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C97150w(C97056h hVar) {
        super(hVar);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(this, Looper.getMainLooper());
        this.f285086f = new C97621e();
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap;
        ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k;
        C72963f4 f4Var;
        C98408n0 l;
        String str = aVar.f226215a;
        if (!Util.isNullOrNil(str) && (hashMap = this.f285085e) != null && (imageGalleryVideoHandler$$k = hashMap.get(str)) != null && (f4Var = imageGalleryVideoHandler$$k.f284606a) != null && f4Var.mo108765s2() != null && f4Var.mo108765s2().equals(str) && (l = mo136053l(f4Var)) != null) {
            if (!f4Var.mo100972K3() && l.f288562i != 198) {
                int h = C98429r0.m127817h(l);
                C97087m1 h2 = mo135877h(imageGalleryVideoHandler$$k.f284607b);
                if (this.f284638d.f284714g.mo135768f8() == imageGalleryVideoHandler$$k.f284607b && h2 != null) {
                    h2.mo135969e();
                    h2.f284842i.setVisibility(0);
                    h2.mo135969e();
                    h2.f284842i.setProgress(h);
                } else if (h2 == null) {
                    return;
                }
                h2.mo135970f();
                if (h >= h2.f284842i.getMax() && mo136054m(imageGalleryVideoHandler$$k)) {
                    mo136055n(f4Var, h2);
                }
            } else if (mo136054m(imageGalleryVideoHandler$$k)) {
                C76701a.makeText((Context) this.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
            }
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    /* renamed from: g */
    public boolean mo135842g(C97087m1 m1Var, C72963f4 f4Var, int i) {
        Bitmap decodeFile = BackwardSupportUtil.BitmapFactory.decodeFile(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2()), 1.0f);
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap = this.f285085e;
        if (hashMap != null) {
            hashMap.put(f4Var.mo108765s2(), new ImageGalleryVideoHandler$$k(f4Var, i));
        }
        mo136057p(m1Var, false);
        m1Var.mo135969e();
        View view = (View) m1Var.f284839f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m1Var.mo135969e();
        m1Var.f284840g.setImageBitmap(decodeFile);
        m1Var.mo135969e();
        m1Var.f284840g.setVisibility(0);
        m1Var.mo135969e();
        View view2 = m1Var.f284843j;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
        m1Var.f284843j.setTag(Zd);
        tc4 tc4 = Zd == null ? null : Zd.f288535C;
        if (tc4 == null) {
            m1Var.f284844k.setVisibility(8);
        } else if (Util.isNullOrNil(tc4.f299537d)) {
            Log.m105924i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
            String str = tc4.f299539f;
            String str2 = tc4.f299540g;
            if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
                m1Var.f284844k.setVisibility(8);
            } else {
                m1Var.f284844k.setText(str);
                m1Var.f284844k.setVisibility(0);
                m1Var.f284844k.setTag(f4Var);
            }
        } else {
            m1Var.f284844k.setVisibility(0);
            m1Var.f284844k.setText(this.f284638d.f284714g.getString(C0966R.string.ja6, new Object[]{Integer.valueOf(tc4.f299538e)}));
            String string = this.f284638d.f284714g.getString(C0966R.string.ja6);
            if (tc4.f299538e / 60 > 0) {
                string = string + this.f284638d.f284714g.getString(C0966R.string.ja8, new Object[]{Integer.valueOf(tc4.f299538e / 60)});
            }
            if (tc4.f299538e % 60 > 0) {
                string = string + this.f284638d.f284714g.getString(C0966R.string.ja9, new Object[]{Integer.valueOf(tc4.f299538e % 60)});
            }
            m1Var.f284844k.setText(string + this.f284638d.f284714g.getString(C0966R.string.ja7));
            m1Var.f284844k.setTag(f4Var);
        }
        m1Var.mo135969e();
        if (m1Var.f284839f instanceof VideoSightView) {
            TextView textView = m1Var.f284844k;
            m1Var.mo135969e();
            C72932v1.m85535a(textView, (VideoSightView) m1Var.f284839f);
        }
        return true;
    }

    /* renamed from: k */
    public final void mo136052k(C98408n0 n0Var, C97087m1 m1Var) {
        if (n0Var != null) {
            C98429r0.m127796B(n0Var.mo137700d());
            m1Var.mo135969e();
            m1Var.f284842i.setVisibility(0);
            m1Var.mo135969e();
            m1Var.f284842i.setProgress(C98429r0.m127817h(n0Var));
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(this, Looper.getMainLooper());
        }
    }

    /* renamed from: l */
    public C98408n0 mo136053l(C72963f4 f4Var) {
        return ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
    }

    /* renamed from: m */
    public final boolean mo136054m(ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k) {
        if (imageGalleryVideoHandler$$k == null) {
            return false;
        }
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        int f8 = this.f284638d.f284714g.mo135768f8();
        int i = imageGalleryVideoHandler$$k.f284607b;
        if (f8 == i) {
            C97087m1 h = mo135877h(i);
            if (h == null) {
                return true;
            }
            h.mo135969e();
            h.f284842i.setVisibility(8);
            return true;
        }
        this.f284638d.f284720p.mo135878i(i);
        return false;
    }

    /* renamed from: n */
    public final void mo136055n(C72963f4 f4Var, C97087m1 m1Var) {
        if (!this.f285087g) {
            m1Var.mo135969e();
            View view = m1Var.f284843j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String q = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(f4Var.mo108765s2());
            if (f4Var.mo100972K3()) {
                C76701a.makeText((Context) this.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
            } else if (q == null || !C86013q1.m106450k(q)) {
                C76701a.makeText((Context) this.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
            } else {
                this.f284638d.f284714g.getContext().getWindow().addFlags(128);
                Boolean bool = m1Var.f284837d.get(q);
                if (bool == null || !bool.booleanValue()) {
                    m1Var.mo135969e();
                    ((View) m1Var.f284839f).setTag(q);
                    m1Var.mo135969e();
                    m1Var.f284841h.setVisibility(8);
                    m1Var.mo135969e();
                    m1Var.f284839f.stop();
                    if (this.f284638d.f284714g.mo135773i8(f4Var.getMsgId()) == 3) {
                        m1Var.mo135969e();
                        m1Var.f284839f.setMute(true);
                    } else {
                        m1Var.mo135969e();
                        m1Var.f284839f.setMute(false);
                    }
                    m1Var.mo135969e();
                    if (m1Var.f284839f instanceof VideoSightView) {
                        m1Var.mo135969e();
                        ((VideoSightView) m1Var.f284839f).setIsAdVideo(C97056h.m124950D(f4Var));
                    }
                    m1Var.mo135969e();
                    m1Var.f284839f.setVideoPath(q);
                    m1Var.mo135969e();
                    if (!m1Var.f284839f.mo24789e(this.f284638d.f284714g.getContext(), false)) {
                        m1Var.mo135969e();
                        m1Var.f284841h.setVisibility(0);
                        m1Var.mo135969e();
                        m1Var.f284841h.setOnClickListener(new C97151a(m1Var));
                        m1Var.mo135969e();
                        View view2 = (View) m1Var.f284839f;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m1Var.mo135969e();
                        m1Var.f284840g.setVisibility(0);
                    } else {
                        m1Var.mo135969e();
                        View view3 = (View) m1Var.f284839f;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(0);
                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m1Var.mo135969e();
                        m1Var.f284840g.setVisibility(8);
                    }
                    Log.m105918d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool requestFocus");
                    this.f285086f.mo136891c(this);
                }
                m1Var.mo135969e();
                View view4 = (View) m1Var.f284839f;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: o */
    public void mo136056o() {
        SparseArray<Object> sparseArray = this.f284638d.f293276f;
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (!(sparseArray.get(keyAt) == null || ((View) sparseArray.get(keyAt)).getTag() == null)) {
                C97087m1 m1Var = (C97087m1) ((View) sparseArray.get(keyAt)).getTag();
                if (m1Var.f284838e != null) {
                    m1Var.mo135969e();
                    if (m1Var.f284838e.getVisibility() == 0) {
                        m1Var.mo135969e();
                        m1Var.f284839f.setVideoCallback((C96875r0.C96876a) null);
                        m1Var.mo135969e();
                        if (((View) m1Var.f284839f).getVisibility() == 0) {
                            mo136057p(m1Var, false);
                            m1Var.mo135969e();
                            if (m1Var.f284839f != null) {
                                m1Var.mo135969e();
                                m1Var.f284839f.stop();
                            }
                            Log.m105918d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
                            this.f285086f.mo136889a();
                            this.f284638d.f284714g.getContext().getWindow().clearFlags(128);
                        }
                    }
                }
            }
        }
    }

    public boolean onTimerExpired() {
        C97087m1 v;
        C97056h hVar = this.f284638d;
        if (hVar == null || (v = hVar.mo135934v()) == null || v.f284838e == null) {
            return false;
        }
        v.mo135969e();
        if (v.f284838e.getVisibility() != 0) {
            return false;
        }
        mo136057p(v, true);
        return false;
    }

    /* renamed from: p */
    public void mo136057p(C97087m1 m1Var, boolean z) {
        if (m1Var != null) {
            m1Var.mo135969e();
            m1Var.f284842i.setVisibility(8);
            if (z) {
                m1Var.mo135969e();
                m1Var.f284840g.setVisibility(8);
                m1Var.mo135969e();
                View view = (View) m1Var.f284839f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            m1Var.mo135969e();
            m1Var.f284840g.setVisibility(0);
            m1Var.mo135969e();
            View view3 = (View) m1Var.f284839f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
