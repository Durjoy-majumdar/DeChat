package uj3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.chatting.presenter.C97179n;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import hd0.C98408n0;
import hd0.C98410o0;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import p158gt.C98201k;
import p243tn.C14050a;
import p434ig.C98671a;
import p434ig.C98674g;
import p682rz.C101488s;
import p682rz.C101491u;
import p910lj.C76701a;
import s90.C48300n;

/* renamed from: uj3.f */
public class C102039f extends RecyclerView.C16613e {

    /* renamed from: d */
    public Context f300491d;

    /* renamed from: e */
    public List<C102042c> f300492e = null;

    /* renamed from: f */
    public C20937c f300493f = null;

    /* renamed from: g */
    public boolean f300494g = true;

    /* renamed from: h */
    public boolean f300495h = false;

    /* renamed from: i */
    public long f300496i;

    /* renamed from: j */
    public boolean f300497j;

    /* renamed from: n */
    public int f300498n;

    /* renamed from: o */
    public C102041b f300499o;

    /* renamed from: p */
    public SimpleDateFormat f300500p = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: q */
    public boolean f300501q = false;

    /* renamed from: uj3.f$a */
    public class C102040a extends RecyclerView.C16631z {

        /* renamed from: A */
        public ProgressBar f300502A;

        /* renamed from: z */
        public TextView f300503z;

        public C102040a(C102039f fVar, View view) {
            super(view);
            this.f300503z = (TextView) view.findViewById(C0966R.C0970id.f357830bz2);
            this.f300502A = (ProgressBar) view.findViewById(C0966R.C0970id.g2x);
        }
    }

    /* renamed from: uj3.f$b */
    public interface C102041b {
    }

    /* renamed from: uj3.f$d */
    public class C102044d extends RecyclerView.C16631z {

        /* renamed from: A */
        public View f300514A;

        /* renamed from: B */
        public TextView f300515B;

        /* renamed from: C */
        public View f300516C;

        /* renamed from: D */
        public CheckBox f300517D;

        /* renamed from: E */
        public View f300518E;

        /* renamed from: F */
        public ChattingAlbumContainer f300519F;

        /* renamed from: G */
        public TextView f300520G;

        /* renamed from: H */
        public View f300521H;

        /* renamed from: z */
        public ImageView f300523z;

        /* renamed from: uj3.f$d$a */
        public class C102045a implements View.OnClickListener {
            public C102045a(C102039f fVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (view.getTag() == null || !(view.getTag() instanceof Integer)) {
                    Log.m105921e("MicroMsg.MediaHistoryGalleryAdapter", "getTag is %s", view.getTag());
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C102042c F4 = C102039f.this.mo141544F4(((Integer) view.getTag()).intValue());
                if (F4 == null) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C102039f fVar = C102039f.this;
                fVar.getClass();
                if (F4 == null) {
                    Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
                } else {
                    C72963f4 f4Var = F4.f300505b;
                    if (f4Var == null) {
                        Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
                    } else if (f4Var.getContent() == null) {
                        Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg content == null");
                    } else {
                        Context context = fVar.f300491d;
                        C87412m.m108594g(context, "context");
                        Intent intent = new Intent();
                        intent.putExtra("img_gallery_msg_id", f4Var.getMsgId());
                        intent.putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2());
                        intent.putExtra("img_gallery_talker", f4Var.mo108768t());
                        intent.putExtra("img_gallery_chatroom_name", f4Var.mo108768t());
                        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
                        intent.putExtra("img_gallery_back_from_grid", true);
                        intent.putExtra("msg_type", 3);
                        C88144b.m109801s(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: uj3.f$d$b */
        public class C102046b implements View.OnClickListener {
            public C102046b(C102039f fVar) {
            }

            public void onClick(View view) {
                char c;
                int i;
                View view2 = view;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view2);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (view.getTag() == null) {
                    c = 0;
                    i = 1;
                } else if (!(view.getTag() instanceof Integer)) {
                    i = 1;
                    c = 0;
                } else {
                    C102042c F4 = C102039f.this.mo141544F4(((Integer) view.getTag()).intValue());
                    if (F4 == null) {
                        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C102039f fVar = C102039f.this;
                    fVar.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("key_biz_chat_id", fVar.f300496i);
                    intent.putExtra("key_is_biz_chat", fVar.f300495h);
                    intent.putExtra("KOpenArticleSceneFromScene", 140);
                    if (F4 == null) {
                        Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
                    } else {
                        C72963f4 f4Var = F4.f300505b;
                        if (f4Var == null) {
                            Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
                        } else {
                            int i2 = fVar.f300491d.getResources().getConfiguration().orientation;
                            int[] iArr = new int[2];
                            int width = view.getWidth();
                            int height = view.getHeight();
                            view2.getLocationInWindow(iArr);
                            intent.addFlags(536870912);
                            int[] iArr2 = iArr;
                            intent.putExtra("img_gallery_msg_id", f4Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2()).putExtra("img_gallery_talker", f4Var.mo108768t()).putExtra("img_gallery_chatroom_name", f4Var.mo108768t()).putExtra("img_gallery_orientation", i2);
                            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr2[0]).putExtra("img_gallery_top", iArr2[1]).putExtra("img_gallery_enter_from_grid", true);
                            if (C75569c4.m90663I(f4Var)) {
                                intent.putExtra("msg_type", 2);
                            }
                            C88144b.m109801s(fVar.f300491d, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
                            ((Activity) fVar.f300491d).overridePendingTransition(0, 0);
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Object[] objArr = new Object[i];
                objArr[c] = view.getTag();
                Log.m105921e("MicroMsg.MediaHistoryGalleryAdapter", "getTag is %s", objArr);
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: uj3.f$d$c */
        public class C102047c implements View.OnClickListener {
            public C102047c(C102039f fVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z = !C102044d.this.f300517D.isChecked();
                C73708v vVar = C73708v.C73710b.f216437a;
                if (vVar.mo102782f() < 9) {
                    C102044d.this.f300517D.setChecked(z);
                } else if (!z) {
                    C102044d.this.f300517D.setChecked(z);
                }
                if (C102039f.this.f300499o != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    C102042c F4 = C102039f.this.mo141544F4(intValue);
                    C97179n nVar = (C97179n) C102039f.this.f300499o;
                    nVar.getClass();
                    Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", Boolean.valueOf(z), Integer.valueOf(intValue));
                    if (!z || vVar.mo102782f() < 9) {
                        if (z) {
                            vVar.mo102777a(F4.f300505b);
                        } else {
                            vVar.mo102781e(F4.f300505b);
                        }
                        nVar.f285150a.f285110d.mo135859H(vVar.mo102782f());
                    } else {
                        Context context = nVar.f285150a.f285112f;
                        C76701a.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.f6a, new Object[]{9}), 1).show();
                        nVar.f285150a.f285115i.notifyItemChanged(intValue);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C102044d(View view) {
            super(view);
            this.f300523z = (ImageView) view.findViewById(C0966R.C0970id.eqq);
            this.f300514A = view.findViewById(C0966R.C0970id.l7r);
            this.f300516C = view.findViewById(C0966R.C0970id.jl_);
            this.f300515B = (TextView) view.findViewById(C0966R.C0970id.l7o);
            this.f300517D = (CheckBox) view.findViewById(C0966R.C0970id.gpy);
            this.f300518E = view.findViewById(C0966R.C0970id.gpz);
            this.f300520G = (TextView) view.findViewById(C0966R.C0970id.jxz);
            this.f300521H = view.findViewById(C0966R.C0970id.fte);
            if (this.f300519F == null) {
                this.f300519F = new ChattingAlbumContainer(view.getContext(), C102039f.this.f300498n, C76577a.m92151b(view.getContext(), 1));
                ((FrameLayout) view.findViewById(C0966R.C0970id.o8f)).addView(this.f300519F, 0);
                this.f300519F.setOnClickListener(new C102045a(C102039f.this));
            }
            View view2 = this.f300518E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f300517D.setVisibility(8);
            View view4 = this.f300514A;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f300515B.setVisibility(8);
            View view6 = this.f300516C;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f300523z.setOnClickListener(new C102046b(C102039f.this));
            this.f300518E.setOnClickListener(new C102047c(C102039f.this));
        }
    }

    public C102039f(Context context, List<C102042c> list, int i, String str) {
        this.f300492e = list;
        this.f300494g = C97625j3.m125812b().mo105883I();
        this.f300491d = context;
        mo141545G4(context, i);
    }

    /* renamed from: F4 */
    public C102042c mo141544F4(int i) {
        return this.f300492e.get(i);
    }

    /* renamed from: G4 */
    public final void mo141545G4(Context context, int i) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59353i = 1;
        bVar.f59366v = true;
        bVar.f59355k = C76577a.m92145A(context) / i;
        bVar.f59354j = C76577a.m92145A(context) / i;
        bVar.f59361q = C0966R.color.a88;
        this.f300493f = bVar.mo32666a();
        this.f300498n = C76577a.m92145A(context) / i;
    }

    public int getItemCount() {
        return this.f300492e.size();
    }

    public int getItemViewType(int i) {
        return mo141544F4(i).f300506c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        if (list == null || list.size() <= 0 || !(zVar instanceof C102044d)) {
            super.onBindViewHolder(zVar, i, list);
        } else if (((Integer) list.get(0)).intValue() == 0) {
            C102044d dVar = (C102044d) zVar;
            dVar.f300517D.setChecked(false);
            dVar.f300517D.setVisibility(0);
            View view = dVar.f300518E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C102044d dVar2 = (C102044d) zVar;
            dVar2.f300517D.setChecked(false);
            dVar2.f300517D.setVisibility(8);
            View view3 = dVar2.f300518E;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == Integer.MAX_VALUE ? new C102040a(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.au4, viewGroup, false)) : new C102044d(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d5b, viewGroup, false));
    }

    public C102039f(Context context, List<C102042c> list, int i, String str, long j) {
        this.f300492e = list;
        this.f300496i = j;
        this.f300494g = C97625j3.m125812b().mo105883I();
        this.f300495h = true;
        this.f300491d = context;
        mo141545G4(context, i);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        boolean z = this.f300494g;
        if (!z) {
            Log.m105921e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", Boolean.valueOf(z));
            return;
        }
        C102042c F4 = mo141544F4(i2);
        if (zVar2.f44859i == Integer.MAX_VALUE) {
            if (i2 != getItemCount() - 1) {
                if (C74763a.m89510e().mo103933a(new Date(mo141544F4(i2 + 1).f300507d)) == C74763a.m89510e().mo103933a(new Date(F4.f300507d))) {
                    C102040a aVar = (C102040a) zVar2;
                    aVar.f300503z.setVisibility(0);
                    aVar.f300503z.setText(C74763a.m89510e().mo103936d(new Date(F4.f300507d), this.f300491d));
                    if (this.f300497j) {
                        aVar.f300502A.setVisibility(0);
                        return;
                    } else {
                        aVar.f300502A.setVisibility(8);
                        return;
                    }
                }
            }
            ((C102040a) zVar2).f300503z.setVisibility(8);
            return;
        }
        C102044d dVar = (C102044d) zVar2;
        dVar.f300523z.setTag(Integer.valueOf(i));
        dVar.f300518E.setTag(Integer.valueOf(i));
        ChattingAlbumContainer chattingAlbumContainer = dVar.f300519F;
        if (chattingAlbumContainer != null) {
            chattingAlbumContainer.setTag(Integer.valueOf(i));
        }
        if (F4.f300509f) {
            String b = C14050a.m13405b(F4.f300504a);
            C20828a b2 = C20828a.m22825b();
            String str2 = F4.f300504a;
            ImageView imageView = dVar.f300523z;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59350f = b;
            bVar.f59346b = true;
            b2.mo32519h(str2, imageView, bVar.mo32666a());
        } else {
            C20828a.m22825b().mo32519h(F4.f300504a, dVar.f300523z, this.f300493f);
        }
        if (F4.f300508e || F4.f300509f) {
            View view = dVar.f300514A;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar.f300515B.setVisibility(0);
            dVar.f300515B.setText(Util.nullAs(F4.f300512i.f300513a, ""));
        } else {
            dVar.f300515B.setVisibility(8);
            View view3 = dVar.f300514A;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f300501q) {
            View view5 = dVar.f300518E;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar.f300517D.setVisibility(0);
            if (C73708v.C73710b.f216437a.mo102780d(F4.f300505b)) {
                dVar.f300517D.setChecked(true);
            } else {
                dVar.f300517D.setChecked(false);
            }
        } else {
            View view7 = dVar.f300518E;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar.f300517D.setVisibility(8);
        }
        String str3 = (i2 - 1) + ", " + this.f300500p.format(new Date(F4.f300507d));
        if (F4.f300508e) {
            str = this.f300491d.getResources().getString(C0966R.string.f7997yr) + str3;
        } else {
            str = this.f300491d.getResources().getString(C0966R.string.f7984yc) + str3;
        }
        dVar.f300523z.setContentDescription(str);
        if (!F4.f300510g || dVar.f300519F == null) {
            dVar.f300523z.setVisibility(0);
            dVar.f300519F.setVisibility(8);
            View view9 = dVar.f300521H;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        dVar.f300523z.setVisibility(8);
        View view11 = dVar.f300521H;
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(0);
        View view12 = view11;
        C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dVar.f300519F.setVisibility(0);
        dVar.f300519F.mo94180g(F4.f300505b, F4.f300511h);
        dVar.f300520G.setText("(" + F4.f300511h.f289364h.size() + ")");
    }

    /* renamed from: uj3.f$c */
    public static class C102042c {

        /* renamed from: a */
        public String f300504a;

        /* renamed from: b */
        public C72963f4 f300505b;

        /* renamed from: c */
        public int f300506c = 0;

        /* renamed from: d */
        public long f300507d;

        /* renamed from: e */
        public boolean f300508e;

        /* renamed from: f */
        public boolean f300509f = false;

        /* renamed from: g */
        public boolean f300510g;

        /* renamed from: h */
        public C98674g f300511h = new C98674g();

        /* renamed from: i */
        public C102043a f300512i = new C102043a(this);

        /* renamed from: uj3.f$c$a */
        public class C102043a {

            /* renamed from: a */
            public String f300513a;

            public C102043a(C102042c cVar) {
            }
        }

        public C102042c(C72963f4 f4Var) {
            String str;
            C72683d qq;
            C48300n nVar;
            this.f300505b = f4Var;
            String str2 = "";
            if (f4Var == null) {
                Log.m105920e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
            } else {
                String str3 = null;
                if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
                    this.f300508e = true;
                    str2 = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2());
                    C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
                    if (Zd != null) {
                        this.f300512i.f300513a = Util.formatSecToMin(Zd.f288566m);
                    }
                    C102043a aVar = this.f300512i;
                    C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
                    aVar.getClass();
                } else if (f4Var.mo100983V3()) {
                    this.f300509f = true;
                    C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                    if (u != null) {
                        str2 = u.f195646y;
                        C68065f fVar = (C68065f) u.mo93555w(C68065f.class);
                        if (!(fVar == null || (nVar = fVar.f195427l) == null)) {
                            this.f300512i.f300513a = Util.formatSecToMin(nVar.f133371i);
                        }
                    }
                } else if (f4Var.mo101016t3()) {
                    this.f300510g = true;
                    C98671a aVar2 = new C98671a();
                    aVar2.mo141099d(f4Var.getContent());
                    this.f300511h.mo141099d(aVar2.f289309p);
                } else {
                    str2 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).c40(f4Var.mo108765s2(), false, false);
                    if (!Util.isNullOrNil(str2) && !str2.endsWith("hd")) {
                        if (C86013q1.m106450k(str2 + "hd")) {
                            str2 = str2 + "hd";
                        }
                    }
                }
                if (f4Var.mo100961A3()) {
                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                    if (!(u2 == null || (str = u2.f195606o) == null || str.length() <= 0 || (qq = C72709y1.vx0().mo100154qq(u2.f195606o)) == null)) {
                        str3 = qq.field_fileFullPath;
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            }
            this.f300504a = str2;
            this.f300507d = f4Var.getCreateTime();
        }

        public boolean equals(Object obj) {
            C72963f4 f4Var = this.f300505b;
            return (f4Var == null || !(obj instanceof C72963f4) || obj == null) ? super.equals(obj) : f4Var.getMsgId() == ((C72963f4) obj).getMsgId();
        }

        public C102042c(long j) {
            this.f300507d = j;
            this.f300506c = Integer.MAX_VALUE;
        }
    }
}
