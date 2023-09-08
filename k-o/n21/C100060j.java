package n21;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.plugin.component.editor.C93065b;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100616a;
import p21.C100630o;
import pb1.C100734q;
import qo3.C77426q;
import qo3.C89779i0;
import t21.C101712a;
import x21.C102538a;
import zt3.C119157j;

/* renamed from: n21.j */
public class C100060j extends C100047f {

    /* renamed from: U */
    public ImageView f293105U;

    /* renamed from: V */
    public ImageView f293106V;

    /* renamed from: W */
    public ImageView f293107W;

    /* renamed from: X */
    public C93065b.C93067b f293108X;

    /* renamed from: Y */
    public C89779i0 f293109Y;

    /* renamed from: Z */
    public View.OnClickListener f293110Z = new C100061a();

    /* renamed from: n21.j$a */
    public class C100061a implements View.OnClickListener {

        /* renamed from: n21.j$a$a */
        public class C100062a implements C93065b.C93067b {

            /* renamed from: a */
            public final /* synthetic */ C100630o f293112a;

            /* renamed from: b */
            public final /* synthetic */ Context f293113b;

            /* renamed from: n21.j$a$a$a */
            public class C100063a implements Runnable {
                public C100063a() {
                }

                public void run() {
                    C77426q qVar = new C77426q(C100062a.this.f293113b);
                    qVar.mo107595g(C100062a.this.f293113b.getString(C0966R.string.f360348c13));
                    qVar.mo107601m(C0966R.string.a18);
                    qVar.mo107589a(false);
                    qVar.mo107603o();
                }
            }

            public C100062a(C100630o oVar, Context context) {
                this.f293112a = oVar;
                this.f293113b = context;
            }

            /* renamed from: a */
            public void mo127454a(C93062a aVar, C93062a.C93064b bVar) {
                C93062a.C93064b bVar2 = C93062a.C93064b.OUT_OF_DATE;
                C93062a.C93064b bVar3 = C93062a.C93064b.ERR;
                C93062a.C93064b bVar4 = C93062a.C93064b.SUCC;
                if (bVar == bVar4 || bVar == bVar3 || bVar == bVar2) {
                    C100060j.this.f293109Y.dismiss();
                    C93065b bVar5 = C93065b.f268104d;
                    ((ArrayList) bVar5.f268105a).remove(C100060j.this.f293108X);
                }
                if (bVar == bVar4) {
                    Intent intent = new Intent();
                    intent.putExtra("key_detail_info_id", 0);
                    intent.putExtra("key_detail_fav_path", this.f293112a.f294813r);
                    intent.putExtra("key_detail_fav_thumb_path", this.f293112a.f294827s);
                    intent.putExtra("key_detail_fav_video_duration", this.f293112a.f294828t);
                    intent.putExtra("key_detail_data_id", this.f293112a.f294795a);
                    intent.putExtra("key_detail_statExtStr", "");
                    intent.putExtra("key_detail_fav_video_show_download_status", false);
                    C100734q.m131877u0((Activity) C100060j.this.f293079B.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, (Bundle) null);
                } else if (bVar == bVar3 || bVar == bVar2) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C100063a());
                }
            }
        }

        /* renamed from: n21.j$a$b */
        public class C100064b implements DialogInterface.OnCancelListener {
            public C100064b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                C93065b bVar = C93065b.f268104d;
                bVar.mo127513e(C100060j.this.f293078A.f294795a);
                ((ArrayList) bVar.f268105a).remove(C100060j.this.f293108X);
            }
        }

        public C100061a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorUI editorUI = (EditorUI) C100060j.this.f293067z.f268166b;
            editorUI.getClass();
            C102538a aVar = editorUI.f268045g;
            if (aVar != null) {
                aVar.mo142159d((C101712a) null);
            }
            Context context = C100060j.this.f293079B.getContext();
            C100630o oVar = (C100630o) C100060j.this.f293078A;
            if (Util.isNullOrNil(oVar.f294813r)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C86013q1.m106450k(oVar.f294813r)) {
                C93065b bVar = C93065b.f268104d;
                C100060j jVar = C100060j.this;
                C100062a aVar2 = new C100062a(oVar, context);
                jVar.f293108X = aVar2;
                bVar.mo127510b(aVar2);
                C100060j jVar2 = C100060j.this;
                jVar2.f293109Y = C89779i0.m112248e(jVar2.f293079B.getContext(), context.getString(C0966R.string.f7955xd), true, 3, new C100064b());
                bVar.mo127511c(new C93062a(oVar.f294808m, false, C93062a.C93063a.TYPE_FILE, -1));
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                Intent intent = new Intent();
                intent.putExtra("key_detail_info_id", 0);
                intent.putExtra("key_detail_fav_path", oVar.f294813r);
                intent.putExtra("key_detail_fav_thumb_path", oVar.f294827s);
                intent.putExtra("key_detail_fav_video_duration", oVar.f294828t);
                intent.putExtra("key_detail_data_id", oVar.f294795a);
                intent.putExtra("key_detail_statExtStr", "");
                intent.putExtra("key_detail_fav_video_show_download_status", false);
                C100734q.m131877u0((Activity) C100060j.this.f293079B.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public C100060j(View view, C93083b bVar) {
        super(view, bVar);
        this.f293105U = (ImageView) view.findViewById(C0966R.C0970id.k17);
        MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.f359492l70);
        this.f293106V = (ImageView) view.findViewById(C0966R.C0970id.l7k);
        this.f293105U.setImageResource(C0966R.raw.shortvideo_play_btn);
        this.f293107W = (ImageView) view.findViewById(C0966R.C0970id.l6d);
        this.f293087J.setVisibility(8);
        this.f293082E.setVisibility(8);
        this.f293107W.setVisibility(8);
        this.f293086I.setTag(this);
        this.f293086I.setOnClickListener(this.f293110Z);
    }

    /* renamed from: y */
    public int mo139367y() {
        return 6;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        C100630o oVar = (C100630o) aVar;
        Bitmap f = C93088r.m117436f(oVar.f294827s, (String) null);
        if (f == null && C86013q1.m106450k(oVar.f294813r) && (f = C93693r.m118401b(oVar.f294813r)) != null) {
            try {
                if (C86013q1.m106450k(oVar.f294827s)) {
                    C86013q1.m106447h(oVar.f294827s);
                }
                BitmapUtil.saveBitmapToImage(f, 60, Bitmap.CompressFormat.JPEG, oVar.f294827s, false);
            } catch (Exception unused) {
            }
        }
        if (f != null) {
            ViewGroup.LayoutParams layoutParams = this.f293106V.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f293106V.setLayoutParams(layoutParams);
            this.f293106V.setImageBitmap(f);
            this.f293106V.setBackground((Drawable) null);
        } else {
            DisplayMetrics displayMetrics = this.f293106V.getResources().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams2 = this.f293106V.getLayoutParams();
            int i3 = displayMetrics.widthPixels - ((int) ((displayMetrics.density * 40.0f) + 0.5f));
            layoutParams2.width = i3;
            layoutParams2.height = (i3 * 52) / 68;
            this.f293106V.setLayoutParams(layoutParams2);
            if (Util.isNullOrNil(oVar.f294808m.f299309j) || Util.isNullOrNil(oVar.f294808m.f299305h)) {
                Log.m105920e("MicroMsg.EditorVideoItemHolder", "data key or url null!!!");
            } else {
                Log.m105918d("MicroMsg.EditorVideoItemHolder", "local data not exist, gen cdnInfo.");
                C93065b.f268104d.mo127511c(new C93062a(oVar.f294808m, false, C93062a.C93063a.TYPE_THUMB, i));
            }
        }
        if (aVar.f294802h) {
            this.f293107W.setVisibility(0);
        } else {
            this.f293107W.setVisibility(8);
        }
        super.mo139368z(aVar, i, i2);
    }
}
