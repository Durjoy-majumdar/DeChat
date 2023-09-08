package wd3;

import a11.C39478b;
import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C75339i;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import i61.C98602h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;
import p248ug.C52556a;
import p248ug.C52573x;
import p248ug.C78161w;
import p629ny.C76979h;
import qo3.C77389a;
import qo3.C77398g;
import sb0.C48334c;
import sb0.C48353j;
import tl3.C78039a;
import u61.C101964h;
import v51.C102151n;
import z51.C39315g;
import z51.C79305f;
import zc3.C39343a;

/* renamed from: wd3.u */
public class C78575u {

    /* renamed from: a */
    public static int[] f230189a = {C0966R.C0970id.koo, C0966R.C0970id.kop, C0966R.C0970id.koq, C0966R.C0970id.kor, C0966R.C0970id.kos, C0966R.C0970id.kot, C0966R.C0970id.kou, C0966R.C0970id.kov, C0966R.C0970id.kow};

    /* renamed from: wd3.u$a */
    public class C78576a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65953v0 f230190d;

        /* renamed from: e */
        public final /* synthetic */ View f230191e;

        /* renamed from: f */
        public final /* synthetic */ C76901s0 f230192f;

        public C78576a(C65953v0 v0Var, View view, C76901s0 s0Var) {
            this.f230190d = v0Var;
            this.f230191e = view;
            this.f230192f = s0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65953v0 v0Var = this.f230190d;
            if (v0Var != null) {
                v0Var.mo23a(true, C78575u.m94932a(this.f230191e), C78575u.m94933b(this.f230191e));
            }
            this.f230192f.dismiss();
            this.f230192f.setFocusable(false);
            this.f230192f.setTouchable(false);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wd3.u$b */
    public class C78577b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65953v0 f230193d;

        /* renamed from: e */
        public final /* synthetic */ C76901s0 f230194e;

        public C78577b(C65953v0 v0Var, C76901s0 s0Var) {
            this.f230193d = v0Var;
            this.f230194e = s0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65953v0 v0Var = this.f230193d;
            if (v0Var != null) {
                v0Var.mo23a(false, (String) null, 0);
            }
            this.f230194e.dismiss();
            this.f230194e.setFocusable(false);
            this.f230194e.setTouchable(false);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wd3.u$c */
    public class C78578c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77398g f230195d;

        /* renamed from: e */
        public final /* synthetic */ C65953v0 f230196e;

        public C78578c(C77398g gVar, C65953v0 v0Var) {
            this.f230195d = gVar;
            this.f230196e = v0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f230195d.dismiss();
            C65953v0 v0Var = this.f230196e;
            if (v0Var != null) {
                String g = this.f230195d.mo107527g();
                EditText editText = this.f230195d.f225701r;
                v0Var.mo23a(true, g, editText instanceof PasterEditText ? ((PasterEditText) editText).getPasterLen() : 0);
            }
        }
    }

    /* renamed from: wd3.u$d */
    public class C78579d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77398g f230197d;

        /* renamed from: e */
        public final /* synthetic */ C65953v0 f230198e;

        public C78579d(C77398g gVar, C65953v0 v0Var) {
            this.f230197d = gVar;
            this.f230198e = v0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f230197d.dismiss();
            C65953v0 v0Var = this.f230198e;
            if (v0Var != null) {
                v0Var.mo23a(false, (String) null, 0);
            }
        }
    }

    /* renamed from: wd3.u$e */
    public class C78580e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65953v0 f230199d;

        /* renamed from: e */
        public final /* synthetic */ View f230200e;

        /* renamed from: f */
        public final /* synthetic */ C76901s0 f230201f;

        public C78580e(C65953v0 v0Var, View view, C76901s0 s0Var) {
            this.f230199d = v0Var;
            this.f230200e = view;
            this.f230201f = s0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65953v0 v0Var = this.f230199d;
            if (v0Var != null) {
                v0Var.mo23a(true, C78575u.m94932a(this.f230200e), C78575u.m94933b(this.f230200e));
            }
            this.f230201f.dismiss();
            this.f230201f.setFocusable(false);
            this.f230201f.setTouchable(false);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wd3.u$f */
    public class C78581f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65953v0 f230202d;

        /* renamed from: e */
        public final /* synthetic */ View f230203e;

        public C78581f(C65953v0 v0Var, View view) {
            this.f230202d = v0Var;
            this.f230203e = view;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C65953v0 v0Var = this.f230202d;
            if (v0Var != null) {
                v0Var.mo23a(true, C78575u.m94932a(this.f230203e), C78575u.m94933b(this.f230203e));
            }
        }
    }

    /* renamed from: wd3.u$g */
    public class C78582g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65953v0 f230204d;

        public C78582g(C65953v0 v0Var) {
            this.f230204d = v0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C65953v0 v0Var = this.f230204d;
            if (v0Var != null) {
                v0Var.mo23a(false, (String) null, 0);
            }
        }
    }

    /* renamed from: wd3.u$h */
    public static class C78583h {

        /* renamed from: a */
        public Context f230205a;

        /* renamed from: b */
        public final C77398g.C77402i f230206b;

        /* renamed from: c */
        public C77398g f230207c;

        /* renamed from: d */
        public String f230208d = null;

        /* renamed from: e */
        public DialogInterface.OnDismissListener f230209e;

        /* renamed from: wd3.u$h$a */
        public class C78584a implements C77398g.C77402i.C63298d {
            public C78584a() {
            }

            /* renamed from: a */
            public CharSequence mo88206a(Context context, CharSequence charSequence, float f) {
                return ((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(C78583h.this.f230205a, charSequence);
            }
        }

        public C78583h(Context context) {
            this.f230205a = context;
            C77398g.C77402i iVar = new C77398g.C77402i(context);
            this.f230206b = iVar;
            C77389a aVar = iVar.f225714b;
            aVar.f225668y = false;
            aVar.f225669z = false;
            aVar.f225656m = new C78584a();
        }

        /* renamed from: a */
        public C78583h mo108563a(C65953v0 v0Var) {
            C77398g a = this.f230206b.mo107548a();
            this.f230207c = a;
            DialogInterface.OnDismissListener onDismissListener = this.f230209e;
            if (onDismissListener != null) {
                a.setOnDismissListener(onDismissListener);
            }
            C78575u.m94936e(this.f230205a, this.f230207c, this.f230208d, (String) null, v0Var, v0Var);
            return this;
        }

        /* renamed from: b */
        public C78583h mo108564b(C77398g.C77402i.C77404b bVar) {
            this.f230206b.f225714b.f225655l = bVar;
            return this;
        }

        /* renamed from: c */
        public C78583h mo108565c(View view) {
            this.f230206b.f225714b.f225627J = view;
            return this;
        }

        /* renamed from: d */
        public C78583h mo108566d(Bitmap bitmap, int i) {
            C77389a aVar = this.f230206b.f225714b;
            aVar.f225658o = bitmap;
            aVar.f225619B = true;
            aVar.f225635R = i;
            aVar.f225618A = false;
            aVar.f225623F = new C15154y(bitmap);
            return this;
        }

        /* renamed from: e */
        public C78583h mo108567e(String str) {
            Context context = this.f230205a;
            C77398g.C77402i iVar = this.f230206b;
            Class cls = C39315g.class;
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.bbx, (ViewGroup) null);
            AbsEmojiView absEmojiView = (AbsEmojiView) inflate.findViewById(C0966R.C0970id.c6m);
            if (absEmojiView == null) {
                Log.m105920e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
            } else if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
            } else {
                EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(str);
                if (str.indexOf(47) == -1) {
                    C39343a cm = ((C39315g) C86312j.m106911c(cls)).mo58035cm();
                    C102151n.m134591a();
                    ((C98602h) cm).getClass();
                    str = EmojiLogic.m117486q(C101964h.m134224f(), "", str);
                }
                if (G != null) {
                    absEmojiView.setEmojiInfo(G);
                } else {
                    absEmojiView.setImageFilePath(str);
                }
                C77389a aVar = iVar.f225714b;
                aVar.f225627J = inflate;
                aVar.f225633P = 1;
            }
            this.f230206b.f225714b.f225618A = false;
            return this;
        }

        /* renamed from: f */
        public C78583h mo108568f(EmojiInfo emojiInfo, String str) {
            Context context = this.f230205a;
            C77398g.C77402i iVar = this.f230206b;
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.bbx, (ViewGroup) null);
            EmojiStatusView emojiStatusView = (EmojiStatusView) inflate.findViewById(C0966R.C0970id.c6m);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cfu);
            if (emojiStatusView == null) {
                Log.m105920e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
            } else if (emojiInfo == null) {
                Log.m105920e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
            } else {
                if (!TextUtils.isEmpty(str)) {
                    textView.setVisibility(0);
                    textView.setText(String.format(context.getResources().getString(C0966R.string.j8p), new Object[]{str}));
                }
                emojiStatusView.setEmojiInfo(emojiInfo);
                C77389a aVar = iVar.f225714b;
                aVar.f225627J = inflate;
                aVar.f225633P = 1;
            }
            this.f230206b.f225714b.f225618A = false;
            return this;
        }

        /* renamed from: g */
        public C78583h mo108569g(Boolean bool) {
            this.f230206b.f225714b.f225649f = bool.booleanValue();
            if (bool.booleanValue()) {
                this.f230206b.f225714b.f225647d = this.f230205a.getString(C0966R.string.bja);
            }
            return this;
        }

        /* renamed from: h */
        public C78583h mo108570h(boolean z) {
            this.f230206b.f225714b.f225618A = z;
            return this;
        }

        /* renamed from: i */
        public C78583h mo108571i(String str) {
            Context context = this.f230205a;
            C76577a.m92151b(context, (int) (C76577a.m92165p(context) * 14.0f));
            if (!Util.isNullOrNil(str)) {
                this.f230206b.f225714b.f225661r = ((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(this.f230205a, str.toString());
            }
            return this;
        }

        /* renamed from: j */
        public C78583h mo108572j(int i) {
            this.f230206b.f225714b.f225632O = i;
            return this;
        }

        /* renamed from: k */
        public C78583h mo108573k(int i) {
            this.f230208d = this.f230205a.getResources().getString(i);
            return this;
        }

        /* renamed from: l */
        public void mo108574l() {
            this.f230207c.show();
        }

        /* renamed from: m */
        public C78583h mo108575m(String str) {
            this.f230206b.f225714b.f225659p = str;
            return this;
        }

        /* renamed from: n */
        public C78583h mo108576n(int i) {
            this.f230206b.f225714b.f225636S = i;
            return this;
        }

        /* renamed from: o */
        public C78583h mo108577o(String str) {
            Context context = this.f230205a;
            C76577a.m92151b(context, (int) (C76577a.m92165p(context) * 20.0f));
            if (!Util.isNullOrNil(str)) {
                this.f230206b.f225714b.f225644a = ((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(this.f230205a, str.toString());
            }
            return this;
        }

        /* renamed from: p */
        public C78583h mo108578p(Object obj) {
            C78575u.m94940i(this.f230205a, this.f230206b, obj);
            this.f230206b.f225714b.f225618A = true;
            return this;
        }
    }

    /* renamed from: a */
    public static String m94932a(View view) {
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.blm);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    /* renamed from: b */
    public static int m94933b(View view) {
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.blm);
        if (editText instanceof PasterEditText) {
            return ((PasterEditText) editText).getPasterLen();
        }
        return 0;
    }

    /* renamed from: c */
    public static View m94934c(Context context, int i) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
    }

    /* renamed from: d */
    public static void m94935d(View view, C65953v0 v0Var, C76901s0 s0Var) {
        ((Button) view.findViewById(C0966R.C0970id.bl7)).setOnClickListener(new C78576a(v0Var, view, s0Var));
        Button button = (Button) view.findViewById(C0966R.C0970id.bl8);
        if (button != null) {
            button.setOnClickListener(new C78577b(v0Var, s0Var));
        }
    }

    /* renamed from: e */
    public static void m94936e(Context context, C77398g gVar, String str, String str2, C65953v0 v0Var, C65953v0 v0Var2) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            str = context.getResources().getString(C0966R.string.bjd);
        }
        if (Util.isNullOrNil(str2) || str2.length() == 0) {
            str2 = context.getResources().getString(C0966R.string.f7926wf);
        }
        gVar.mo107542x(str, true, new C78578c(gVar, v0Var));
        gVar.mo107539t(str2, true, new C78579d(gVar, v0Var2));
    }

    /* renamed from: f */
    public static void m94937f(MMActivityController mMActivityController, C77398g.C77402i iVar, C65953v0 v0Var, View view, String str) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            str = mMActivityController.mo177096t().getResources().getString(C0966R.string.bjd);
        }
        C77389a aVar = iVar.f225714b;
        aVar.f225663t = str;
        aVar.f225620C = new C78581f(v0Var, view);
        iVar.mo107551d(C0966R.string.f7926wf);
        iVar.f225714b.f225621D = new C78582g(v0Var);
    }

    /* renamed from: g */
    public static void m94938g(View view, boolean z) {
        EditText editText;
        if (view != null && (editText = (EditText) view.findViewById(C0966R.C0970id.blm)) != null) {
            editText.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: h */
    public static void m94939h(View view, int i, String str, boolean z, int i2) {
        TextView textView = (TextView) view.findViewById(i);
        Assert.assertTrue(textView != null);
        if (!z || !Util.isNullOrNil(str)) {
            textView.setText(str);
        } else {
            textView.setVisibility(i2);
        }
    }

    /* renamed from: i */
    public static void m94940i(Context context, C77398g.C77402i iVar, Object obj) {
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
                        String string = context.getString(C0966R.string.iiu, new Object[]{Integer.valueOf(((C39478b) C86312j.m106911c(cls)).mo62080p1(str))});
                        SpannableString M2 = ((C79305f) C86312j.m106911c(cls2)).mo109310M(context, (displayName + string).toString());
                        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7140zi, (ViewGroup) null);
                        GridView gridView = (GridView) inflate.findViewById(C0966R.C0970id.b0w);
                        ArrayList arrayList = new ArrayList();
                        List<String> k5 = ((C39478b) C86312j.m106911c(cls)).mo62079k5(str);
                        iVar.mo107549b(str, M2, Boolean.TRUE, new C65952v(inflate, arrayList, str, k5), new C78588z());
                        gridView.setAdapter(new C65950l0(context, k5, arrayList));
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
                        return;
                    }
                    iVar.mo107549b(str, ((C79305f) C86312j.m106911c(cls2)).mo109310M(context, displayName.toString()), Boolean.FALSE, (C77398g.C77402i.C63297c) null, new C78544a0());
                    return;
                }
                View inflate2 = View.inflate(context, C0966R.C0971layout.f7048w3, (ViewGroup) null);
                int i = 0;
                for (String str2 : stringsToList) {
                    if (i <= 8 && inflate2 != null) {
                        ImageView imageView = (ImageView) inflate2.findViewById(f230189a[i]);
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

    /* renamed from: j */
    public static void m94941j(MMActivityController mMActivityController, C76901s0 s0Var) {
        try {
            if (!mMActivityController.mo177096t().isFinishing()) {
                s0Var.setInputMethodMode(1);
                s0Var.setSoftInputMode(16);
                s0Var.setFocusable(true);
                s0Var.setTouchable(true);
                s0Var.showAtLocation(mMActivityController.mo177096t().getWindow().getDecorView(), 17, 0, 0);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMConfirmDialog", "show dialog fail: %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.MMConfirmDialog", e, "", new Object[0]);
        }
    }

    /* renamed from: k */
    public static C77398g m94942k(MMActivityController mMActivityController, String str, View view, String str2, C15153w0 w0Var) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        AppCompatActivity t = mMActivityController.mo177096t();
        C77389a aVar = new C77389a();
        aVar.f225668y = false;
        aVar.f225669z = false;
        AppCompatActivity t2 = mMActivityController.mo177096t();
        aVar.f225644a = str;
        aVar.f225630M = t2.getResources().getColor(C0966R.color.a7f);
        aVar.f225631N = 2;
        if (Util.isNullOrNil(str2) || str2.length() == 0) {
            str2 = mMActivityController.mo177096t().getResources().getString(C0966R.string.bjd);
        }
        aVar.f225663t = str2;
        aVar.f225620C = new C15150s(w0Var);
        aVar.f225664u = C0086a.m38a(t).getString(C0966R.string.f7926wf);
        aVar.f225621D = new C15151t(w0Var);
        aVar.f225627J = view;
        C77398g gVar = new C77398g(t, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.mo107543y(mMActivityController.mo177096t().getResources().getColor(C0966R.color.f3154h3));
        gVar.show();
        return gVar;
    }

    /* renamed from: l */
    public static C77398g m94943l(MMActivityController mMActivityController, String str, String str2, String str3, String str4, boolean z, String str5, C65953v0 v0Var) {
        String str6 = str;
        String str7 = str3;
        String str8 = str4;
        if ((str6 == null || str.length() == 0) && (str7 == null || str3.length() == 0)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        View inflate = View.inflate(mMActivityController.mo177096t(), C0966R.C0971layout.f7042vx, (ViewGroup) null);
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        C77389a aVar = iVar.f225714b;
        aVar.f225668y = false;
        aVar.f225669z = false;
        AppCompatActivity t = mMActivityController.mo177096t();
        iVar.f225714b.f225644a = str6;
        int color = t.getResources().getColor(C0966R.color.a7f);
        C77389a aVar2 = iVar.f225714b;
        aVar2.f225630M = color;
        aVar2.f225631N = 2;
        m94938g(inflate, z);
        MMActivityController mMActivityController2 = mMActivityController;
        m94937f(mMActivityController, iVar, v0Var, inflate, str5);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bll);
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(mMActivityController.mo177096t(), str7, textView.getTextSize()));
        if (str8 == null || str4.length() == 0) {
            View findViewById = inflate.findViewById(C0966R.C0970id.blg);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/pluginsdk/ui/applet/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/pluginsdk/ui/applet/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((TextView) inflate.findViewById(C0966R.C0970id.blg)).setText(str8);
        }
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(mMActivityController.mo177096t(), 120.0f);
        CdnImageView cdnImageView = (CdnImageView) inflate.findViewById(C0966R.C0970id.bln);
        if (cdnImageView != null) {
            cdnImageView.mo100288c(str2, fromDPToPix, fromDPToPix, -1);
        }
        iVar.f225714b.f225627J = inflate;
        C77398g a = iVar.mo107548a();
        a.show();
        return a;
    }

    /* renamed from: m */
    public static C77398g m94944m(MMActivityController mMActivityController, String str, byte[] bArr, String str2, String str3, boolean z, String str4, C65953v0 v0Var) {
        return m94945n(mMActivityController, str, bArr, str2, str3, z, str4, v0Var, mMActivityController.mo177096t().getResources().getString(C0966R.string.a3w));
    }

    /* renamed from: n */
    public static C77398g m94945n(MMActivityController mMActivityController, String str, byte[] bArr, String str2, String str3, boolean z, String str4, C65953v0 v0Var, String str5) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            m94940i(mMActivityController.mo177096t(), iVar, Util.stringsToList(string.split(",")));
        }
        iVar.f225714b.f225618A = true;
        C77389a aVar = iVar.f225714b;
        aVar.f225661r = str5 + str;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str4, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: o */
    public static C77398g m94946o(MMActivityController mMActivityController, String str, String str2, boolean z, String str3, C65953v0 v0Var) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem2 fail, message is empty");
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            m94940i(mMActivityController.mo177096t(), iVar, Util.stringsToList(string.split(",")));
        }
        C77389a aVar = iVar.f225714b;
        aVar.f225618A = true;
        aVar.f225661r = str;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str3, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: p */
    public static C77398g m94947p(MMActivityController mMActivityController, String str, String str2, boolean z, C65953v0 v0Var) {
        return m94946o(mMActivityController, str, str2, z, "", v0Var);
    }

    /* renamed from: q */
    public static C77398g m94948q(MMActivityController mMActivityController, String str, String str2, boolean z, String str3, C65953v0 v0Var) {
        if (str == null || !C86013q1.m106450k(str)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, img does not exist");
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            m94940i(mMActivityController.mo177096t(), iVar, Util.stringsToList(string.split(",")));
        }
        C77389a aVar = iVar.f225714b;
        aVar.f225618A = true;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        if (!Util.isNullOrNil(str)) {
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str);
            int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
            if (bitmapNative != null) {
                if (exifOrientation != 0) {
                    bitmapNative = BitmapUtil.rotate(bitmapNative, (float) exifOrientation);
                }
                C77389a aVar2 = iVar.f225714b;
                aVar2.f225658o = bitmapNative;
                aVar2.f225619B = true;
                aVar2.f225635R = 3;
                aVar2.f225623F = new C78587x(bitmapNative);
                aVar2.f225618A = false;
            }
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str3, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: r */
    public static C77398g m94949r(MMActivityController mMActivityController, byte[] bArr, String str, boolean z, String str2, C65953v0 v0Var) {
        if (bArr == null || bArr.length == 0) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, imgData is null");
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            m94940i(mMActivityController.mo177096t(), iVar, Util.stringsToList(string.split(",")));
        }
        C77389a aVar = iVar.f225714b;
        aVar.f225618A = true;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        if (bArr.length > 0) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            Exif exif = new Exif();
            exif.parseFrom(bArr);
            int orientationInDegree = exif.getOrientationInDegree();
            if (decodeByteArray != null) {
                if (orientationInDegree != 0) {
                    decodeByteArray = BitmapUtil.rotate(decodeByteArray, (float) orientationInDegree);
                }
                C77389a aVar2 = iVar.f225714b;
                aVar2.f225658o = decodeByteArray;
                aVar2.f225619B = true;
                aVar2.f225635R = 3;
                aVar2.f225623F = new C78587x(decodeByteArray);
                aVar2.f225618A = false;
            }
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str2, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: s */
    public static C77398g m94950s(MMActivityController mMActivityController, byte[] bArr, String str, boolean z, C65953v0 v0Var) {
        return m94949r(mMActivityController, bArr, str, z, "", v0Var);
    }

    /* renamed from: t */
    public static C77398g m94951t(MMActivityController mMActivityController, int i, String str, String str2, String str3, boolean z, String str4, C65953v0 v0Var) {
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            m94940i(mMActivityController.mo177096t(), iVar, Util.stringsToList(string.split(",")));
        }
        iVar.f225714b.f225618A = true;
        String str5 = (i == C0966R.raw.app_attach_file_icon_file ? mMActivityController.mo177096t().getResources().getString(C0966R.string.f8007z3) : i == C0966R.raw.app_attach_file_icon_music ? mMActivityController.mo177096t().getResources().getString(C0966R.string.a0s) : i == C0966R.raw.app_attach_file_icon_video ? mMActivityController.mo177096t().getResources().getString(C0966R.string.f360103a43) : mMActivityController.mo177096t().getResources().getString(C0966R.string.f7571k0)) + str;
        C77389a aVar = iVar.f225714b;
        aVar.f225661r = str5;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str4, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: u */
    public static C77398g m94952u(MMActivityController mMActivityController, int i, String str, String str2, String str3, boolean z, C65953v0 v0Var) {
        return m94951t(mMActivityController, i, str, str2, str3, z, "", v0Var);
    }

    /* renamed from: v */
    public static C77398g m94953v(MMActivityController mMActivityController, byte[] bArr, String str, String str2, String str3, boolean z, int i, String str4, C65953v0 v0Var) {
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        ArrayList<String> arrayList = null;
        String string = mMActivityController.mo177096t().getIntent().getExtras().getString("Select_Conv_User", (String) null);
        if (string != null) {
            arrayList = Util.stringsToList(string.split(","));
        }
        m94940i(mMActivityController.mo177096t(), iVar, arrayList);
        iVar.f225714b.f225618A = true;
        StringBuffer stringBuffer = new StringBuffer(i != 1 ? i != 2 ? mMActivityController.mo177096t().getResources().getString(C0966R.string.f7571k0) : mMActivityController.mo177096t().getResources().getString(C0966R.string.a0s) : mMActivityController.mo177096t().getResources().getString(C0966R.string.f360103a43));
        stringBuffer.append(str);
        String stringBuffer2 = stringBuffer.toString();
        C77389a aVar = iVar.f225714b;
        aVar.f225661r = stringBuffer2;
        aVar.f225668y = false;
        aVar.f225669z = false;
        if (z) {
            aVar.f225649f = true;
        }
        C77398g a = iVar.mo107548a();
        m94936e(mMActivityController.mo177096t(), a, str4, (String) null, v0Var, v0Var);
        a.show();
        return a;
    }

    /* renamed from: w */
    public static C77398g m94954w(MMActivityController mMActivityController, byte[] bArr, String str, String str2, String str3, boolean z, int i, C65953v0 v0Var) {
        return m94953v(mMActivityController, bArr, str, str2, str3, z, i, "", v0Var);
    }

    /* renamed from: x */
    public static C76901s0 m94955x(MMActivityController mMActivityController, long j, String str, String str2, String str3, String str4, C65953v0 v0Var) {
        String str5;
        String str6;
        String str7;
        C65953v0 v0Var2 = v0Var;
        Class cls = C76979h.class;
        View c = m94934c(mMActivityController.mo177096t(), C0966R.C0971layout.f7045w0);
        C76901s0 s0Var = new C76901s0(c, -1, -1);
        m94935d(c, v0Var2, s0Var);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        String str8 = str;
        m94939h(c, C0966R.C0970id.blp, str, false, 0);
        NoMeasuredTextView noMeasuredTextView = (NoMeasuredTextView) c.findViewById(C0966R.C0970id.bll);
        noMeasuredTextView.setShouldEllipsize(true);
        noMeasuredTextView.mo153549i(0, mMActivityController.mo177096t().getResources().getDimension(C0966R.dimen.f3628l) * C76577a.m92165p(mMActivityController.mo177096t()));
        noMeasuredTextView.setTextColor(C76577a.m92154e(mMActivityController.mo177096t(), C0966R.color.a7f));
        long j2 = j;
        C48334c a0 = ((C78161w) C86312j.m106911c(C78161w.class)).mo71124a0(j);
        if (a0 == null || !a0.mo73037p2()) {
            C48353j jVar = ((C52573x) C86312j.m106911c(C52573x.class)).get(a0.field_bizChatServId);
            if (jVar != null) {
                str7 = jVar.field_userName;
                str6 = jVar.field_headImageUrl;
                str5 = jVar.field_brandUserName;
            } else {
                Log.m105928w("MicroMsg.MMConfirmDialog", "showDialogItem8 userInfo is null");
                return null;
            }
        } else {
            str7 = a0.field_chatName;
            str6 = a0.field_headImageUrl;
            str5 = a0.field_brandUserName;
        }
        if (str7 == null) {
            str7 = str2;
        }
        if (!Util.isNullOrNil(str7)) {
            noMeasuredTextView.setText((CharSequence) ((C76979h) C86312j.m106911c(cls)).yp0(mMActivityController.mo177096t(), str7, noMeasuredTextView.getTextSize()));
        } else {
            String str9 = str2;
            noMeasuredTextView.setText((CharSequence) ((C76979h) C86312j.m106911c(cls)).yp0(mMActivityController.mo177096t(), str2, noMeasuredTextView.getTextSize()));
        }
        m94939h(c, C0966R.C0970id.blh, str3, true, 8);
        Button button = (Button) c.findViewById(C0966R.C0970id.bl7);
        if (!Util.isNullOrNil(str4)) {
            button.setText(str4);
        }
        button.setOnClickListener(new C78580e(v0Var2, c, s0Var));
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C52556a.m58840a(str5);
        bVar.f59346b = true;
        bVar.f59363s = true;
        bVar.f59359o = C0966R.raw.default_avatar;
        C20937c a = bVar.mo32666a();
        if (!Util.isNullOrNil(str6)) {
            C20828a.m22825b().mo32519h(str6, (ImageView) c.findViewById(C0966R.C0970id.bln), a);
        }
        MMActivityController mMActivityController2 = mMActivityController;
        m94941j(mMActivityController, s0Var);
        return s0Var;
    }
}
