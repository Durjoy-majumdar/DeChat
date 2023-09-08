package wr1;

import a11.C39478b;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import qo3.C77389a;
import qo3.C77398g;
import tl3.C78039a;
import wd3.C65953v0;
import z51.C79305f;

/* renamed from: wr1.f */
public class C66184f {

    /* renamed from: a */
    public static int[] f190204a = {C0966R.C0970id.koo, C0966R.C0970id.kop, C0966R.C0970id.koq, C0966R.C0970id.kor, C0966R.C0970id.kos, C0966R.C0970id.kot, C0966R.C0970id.kou, C0966R.C0970id.kov, C0966R.C0970id.kow};

    /* renamed from: wr1.f$a */
    public static class C66185a {

        /* renamed from: a */
        public Context f190205a;

        /* renamed from: b */
        public final C77398g.C77402i f190206b;

        /* renamed from: c */
        public C77398g f190207c;

        /* renamed from: d */
        public String f190208d = null;

        /* renamed from: e */
        public DialogInterface.OnDismissListener f190209e;

        /* renamed from: wr1.f$a$a */
        public class C66186a implements C77398g.C77402i.C63298d {
            public C66186a() {
            }

            /* renamed from: a */
            public CharSequence mo88206a(Context context, CharSequence charSequence, float f) {
                return ((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(C66185a.this.f190205a, charSequence);
            }
        }

        public C66185a(Context context) {
            this.f190205a = context;
            C77398g.C77402i iVar = new C77398g.C77402i(context);
            this.f190206b = iVar;
            C77389a aVar = iVar.f225714b;
            aVar.f225668y = false;
            aVar.f225669z = false;
            aVar.f225656m = new C66186a();
        }

        /* renamed from: a */
        public C66185a mo90280a(C65953v0 v0Var) {
            C77398g a = this.f190206b.mo107548a();
            this.f190207c = a;
            DialogInterface.OnDismissListener onDismissListener = this.f190209e;
            if (onDismissListener != null) {
                a.setOnDismissListener(onDismissListener);
            }
            Context context = this.f190205a;
            C77398g gVar = this.f190207c;
            String str = this.f190208d;
            if (Util.isNullOrNil(str) || str.length() == 0) {
                str = context.getResources().getString(C0966R.string.bjd);
            }
            if (Util.isNullOrNil((String) null)) {
                String string = context.getResources().getString(C0966R.string.f7926wf);
                gVar.mo107542x(str, true, new C66182d(gVar, v0Var));
                gVar.mo107539t(string, true, new C66183e(gVar, v0Var));
                return this;
            }
            throw null;
        }

        /* renamed from: b */
        public C66185a mo90281b(Boolean bool) {
            this.f190206b.f225714b.f225649f = bool.booleanValue();
            if (bool.booleanValue()) {
                this.f190206b.f225714b.f225647d = this.f190205a.getString(C0966R.string.bja);
            }
            return this;
        }

        /* renamed from: c */
        public C66185a mo90282c(Object obj) {
            Context context = this.f190205a;
            C77398g.C77402i iVar = this.f190206b;
            if (obj != null) {
                List<String> stringsToList = obj instanceof String ? Util.stringsToList(((String) obj).split(",")) : obj instanceof List ? (List) obj : null;
                if (!Util.isNullOrNil((List) stringsToList)) {
                    if (stringsToList.size() == 1) {
                        String str = (String) stringsToList.get(0);
                        Class cls = C39478b.class;
                        Class cls2 = C79305f.class;
                        C76577a.m92151b(context, (int) (C76577a.m92165p(context) * 20.0f));
                        SpannableString M = ((C79305f) C86312j.m106911c(cls2)).mo109310M(context, context.getString(C0966R.string.i4c).toString());
                        C77389a aVar = iVar.f225714b;
                        aVar.f225644a = M;
                        aVar.f225634Q = 3;
                        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
                        C76577a.m92151b(context, (int) (C76577a.m92165p(context) * 14.0f));
                        if (C72996z1.m85820U5(str)) {
                            String string = context.getString(C0966R.string.iiy, new Object[]{Integer.valueOf(((C39478b) C86312j.m106911c(cls)).mo62080p1(str))});
                            SpannableString M2 = ((C79305f) C86312j.m106911c(cls2)).mo109310M(context, (displayName + string).toString());
                            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7140zi, (ViewGroup) null);
                            GridView gridView = (GridView) inflate.findViewById(C0966R.C0970id.b0w);
                            ArrayList arrayList = new ArrayList();
                            List<String> k5 = ((C39478b) C86312j.m106911c(cls)).mo62079k5(str);
                            iVar.mo107549b(str, M2, Boolean.TRUE, new C66179a(inflate, arrayList, str, k5), new C66180b());
                            gridView.setAdapter(new C66187g(context, k5, arrayList));
                            gridView.setSelector(new ColorDrawable(context.getResources().getColor(C0966R.color.ahf)));
                            if (k5 != null) {
                                if (k5.size() > 16) {
                                    gridView.setLayoutParams(new LinearLayout.LayoutParams(-1, C76577a.m92157h(context, C0966R.dimen.f3692bl)));
                                    gridView.setPadding(C76577a.m92157h(context, C0966R.dimen.f3688bh), 0, C76577a.m92157h(context, C0966R.dimen.f3688bh), 0);
                                } else {
                                    gridView.setPadding(0, 0, 0, C76577a.m92157h(context, C0966R.dimen.f3685be));
                                }
                            }
                            iVar.f225714b.f225629L = inflate;
                        } else {
                            iVar.mo107549b(str, ((C79305f) C86312j.m106911c(cls2)).mo109310M(context, displayName.toString()), Boolean.FALSE, (C77398g.C77402i.C63297c) null, new C66181c());
                        }
                    } else {
                        View inflate2 = View.inflate(context, C0966R.C0971layout.f7048w3, (ViewGroup) null);
                        int i = 0;
                        for (String str2 : stringsToList) {
                            if (i <= 8 && inflate2 != null) {
                                ImageView imageView = (ImageView) inflate2.findViewById(C66184f.f190204a[i]);
                                if (str2 != null) {
                                    imageView.setVisibility(0);
                                    C78039a.m94189a(imageView, str2);
                                    i++;
                                }
                            }
                        }
                        iVar.f225714b.f225628K = inflate2;
                        String string2 = context.getString(C0966R.string.f361055gy0);
                        C77389a aVar2 = iVar.f225714b;
                        aVar2.f225644a = string2;
                        aVar2.f225634Q = 3;
                    }
                }
            }
            this.f190206b.f225714b.f225618A = true;
            return this;
        }
    }
}
