package nf2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45821d;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import p243tn.C14050a;
import p248ug.C102027b;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;
import wd3.C22898h;
import wd3.C22906q;
import wd3.C22908r;
import z04.C112551y;

/* renamed from: nf2.d */
public final class C47244d extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final List<C49699hg> f126827d;

    /* renamed from: e */
    public final C13601g f126828e = C36568h.m40985a(C47249d.f126841d);

    /* renamed from: f */
    public boolean f126829f;

    /* renamed from: g */
    public String f126830g = "";

    /* renamed from: h */
    public C32224a<C13598b0> f126831h;

    /* renamed from: nf2.d$a */
    public static final class C47245a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47245a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: nf2.d$b */
    public static final class C47246b extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f126832z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47246b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.aaw);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…rofile_list_no_more_text)");
            this.f126832z = (TextView) findViewById;
        }
    }

    /* renamed from: nf2.d$c */
    public static final class C47247c extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f126833A;

        /* renamed from: B */
        public TextView f126834B;

        /* renamed from: C */
        public View f126835C;

        /* renamed from: D */
        public ViewGroup f126836D;

        /* renamed from: E */
        public MMNeat7extView f126837E;

        /* renamed from: F */
        public final C13601g f126838F;

        /* renamed from: z */
        public ImageView f126839z;

        /* renamed from: nf2.d$c$a */
        public static final class C47248a extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public final /* synthetic */ View f126840d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C47248a(View view) {
                super(0);
                this.f126840d = view;
            }

            public Object invoke() {
                int A = C76577a.m92145A(this.f126840d.getContext());
                int j = C76577a.m92159j(this.f126840d.getContext());
                if (A >= j) {
                    A = j;
                }
                return Integer.valueOf((int) (((float) (A - ((int) (C76577a.m92156g(this.f126840d.getContext()) * ((float) 24))))) / 1.7777778f));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47247c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.aas);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…profile_item_video_image)");
            this.f126839z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.aar);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…e_item_video_duration_tv)");
            this.f126833A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.aaq);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…ofile_item_video_desc_tv)");
            this.f126834B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.aap);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…e_item_video_desc_shadow)");
            this.f126835C = findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.aau);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.…_item_video_title_layout)");
            this.f126836D = (ViewGroup) findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.aav);
            C87412m.m108593f(findViewById6, "itemView.findViewById(R.…file_item_video_title_tv)");
            this.f126837E = (MMNeat7extView) findViewById6;
            this.f126838F = C36568h.m40985a(new C47248a(view));
        }
    }

    /* renamed from: nf2.d$d */
    public static final class C47249d extends C87413o implements C32224a<C45696d> {

        /* renamed from: d */
        public static final C47249d f126841d = new C47249d();

        public C47249d() {
            super(0);
        }

        public Object invoke() {
            return (C45696d) C86709a0.m107533q(C45696d.class);
        }
    }

    public C47244d(List<? extends C49699hg> list) {
        C87412m.m108594g(list, "dataList");
        this.f126827d = list;
    }

    /* renamed from: F4 */
    public final void mo72278F4(boolean z) {
        if (this.f126829f != z) {
            this.f126829f = z;
            notifyItemChanged(this.f126827d.size());
        }
    }

    public int getItemCount() {
        return this.f126827d.size() + 1;
    }

    public int getItemViewType(int i) {
        if (i < this.f126827d.size()) {
            return 0;
        }
        return this.f126829f ? 1 : 2;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        RecyclerView.C16631z zVar2 = zVar;
        C87412m.m108594g(zVar2, "holder");
        if (zVar2 instanceof C47247c) {
            C47247c cVar = (C47247c) zVar2;
            C49699hg hgVar = this.f126827d.get(i);
            C50249le leVar = hgVar.f134607i.f137969e.get(0);
            C50117ke keVar = hgVar.f134607i.f137968d;
            C7007c1.m7256a(cVar.f44854d);
            cVar.f44854d.setOnClickListener(new C47250e(cVar, leVar, keVar));
            boolean z = true;
            if (hgVar.f134602d.f135740e == 49 && ((C45696d) ((C36570n) this.f126828e).getValue()).mo70957E5(16)) {
                C45696d dVar = (C45696d) ((C36570n) this.f126828e).getValue();
                LinkedList<C50249le> linkedList = hgVar.f134607i.f137969e;
                C87412m.m108593f(linkedList, "bizMessage.AppMsg.DetailInfo");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C50249le leVar2 : linkedList) {
                    arrayList.add(C64197v.m75537f(leVar2.f137340h, String.valueOf(leVar2.f137345p)));
                }
                dVar.mo71004o8(arrayList, 126);
            }
            String str2 = leVar.f137317A;
            if (!(str2 == null || C112551y.m153811k(str2))) {
                cVar.f126834B.setVisibility(0);
                View view = cVar.f126835C;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                cVar.f126834B.setText(leVar.f137317A);
            } else {
                cVar.f126834B.setVisibility(8);
                View view3 = cVar.f126835C;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            cVar.f126833A.setText(C92721n.m116876d(leVar.f137355z));
            ImageView imageView = cVar.f126839z;
            int intValue = ((Number) ((C36570n) cVar.f126838F).getValue()).intValue();
            String str3 = leVar.f137317A;
            int i2 = str3 == null || C112551y.m153811k(str3) ? C0966R.C0969drawable.amf : C0966R.C0969drawable.amg;
            imageView.setBackgroundResource(i2);
            String str4 = leVar.f137336d;
            C34825i iVar = str4 == null || str4.length() == 0 ? new C34825i((MMApplicationContext.getResources().getDisplayMetrics().density * 8.0f) + 0.5f, true, true) : new C34825i((MMApplicationContext.getResources().getDisplayMetrics().density * 8.0f) + 0.5f, true, false);
            String[] strArr = {leVar.f137328L, leVar.f137342j, leVar.f137344o};
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    str = null;
                    break;
                }
                str = strArr[i3];
                if (!(str == null || C112551y.m153811k(str))) {
                    break;
                }
                i3++;
            }
            if (str == null) {
                str = "";
            }
            String a = C102027b.m134386a(str, 2, true);
            C87412m.m108593f(a, "getUrl(coverUrl, BizImag…rategy.SCENE_BIZ_PROFILE)");
            C47251f fVar = new C47251f(this);
            C40726l.f109414a.mo63636e(leVar.f137340h, 5);
            imageView.setImageBitmap((Bitmap) null);
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageResource(i2);
            imageView.setTag(a);
            int A = C76577a.m92145A(imageView.getContext()) - ((int) (C76577a.m92156g(imageView.getContext()) * ((float) 24)));
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59344B = String.valueOf("radius:" + iVar.f93582a + "-topRound:" + iVar.f93583b + "-bottomRound:" + iVar.f93584c);
            bVar.f59361q = i2;
            bVar.f59354j = A;
            bVar.f59355k = intValue;
            bVar.f59366v = true;
            bVar.f59369y = new C22908r(3);
            bVar.f59370z = new C22898h(3);
            bVar.f59350f = C14050a.m13405b(a);
            C20937c a2 = bVar.mo32666a();
            C22906q qVar = new C22906q(3, -1, -1, (float[]) null, fVar);
            C46746a.f125826a.mo71977j(imageView, iVar.f93582a, iVar.f93583b, iVar.f93584c);
            C20828a.m22825b().mo32520i(a, imageView, a2, qVar);
            String str5 = leVar.f137336d;
            if (!(str5 == null || str5.length() == 0)) {
                z = false;
            }
            if (z) {
                cVar.f126836D.setVisibility(8);
                cVar.f126837E.setVisibility(8);
                return;
            }
            cVar.f126836D.setVisibility(0);
            cVar.f126837E.setVisibility(0);
            MMNeat7extView mMNeat7extView = cVar.f126837E;
            String str6 = leVar.f137336d;
            C87412m.m108593f(str6, "bizAppMsgDetailInfo.Title");
            String str7 = leVar.f137340h;
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(mMNeat7extView.getContext(), str6);
            C45821d dVar2 = C45821d.f123719a;
            C87412m.m108593f(T1, MimeTypes.BASE_TYPE_TEXT);
            dVar2.mo71288f(T1, mMNeat7extView, false, str7, 4);
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(mMNeat7extView.getContext())));
        } else if (zVar2 instanceof C47245a) {
            C32224a<C13598b0> aVar3 = this.f126831h;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (zVar2 instanceof C47246b) {
            CharSequence text = C112551y.m153811k(this.f126830g) ? zVar2.f44854d.getContext().getText(C0966R.string.apa) : this.f126830g;
            C87412m.m108593f(text, "if (footerWording.isBlan…            footerWording");
            ((C47246b) zVar2).f126832z.setText(text);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7064wz, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C47247c(inflate);
        } else if (i != 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7074xe, viewGroup, false);
            C87412m.m108593f(inflate2, "view");
            return new C47246b(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7059wm, viewGroup, false);
            C87412m.m108593f(inflate3, "view");
            return new C47245a(inflate3);
        }
    }
}
