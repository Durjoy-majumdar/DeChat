package kj3;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C6809r;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74089l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74103m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74125n;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74200s;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74218t;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.voip.widget.MMCheckBox;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb0.C46664n;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import org.xwalk.core.XWalkEnvironment;
import qo3.C77390c0;
import qo3.C77407n;
import v90.C78373a;

/* renamed from: kj3.c */
public class C76581c extends C77390c0 {

    /* renamed from: d */
    public int f224144d;

    /* renamed from: e */
    public int f224145e;

    /* renamed from: f */
    public boolean f224146f;

    /* renamed from: g */
    public LinearLayout f224147g;

    /* renamed from: h */
    public ImageView f224148h;

    /* renamed from: i */
    public ImageView f224149i;

    /* renamed from: j */
    public Button f224150j;

    /* renamed from: n */
    public ViewGroup f224151n;

    /* renamed from: o */
    public TextView f224152o;

    /* renamed from: p */
    public TextView f224153p;

    /* renamed from: q */
    public TextView f224154q;

    /* renamed from: r */
    public TextView f224155r;

    /* renamed from: s */
    public TextView f224156s;

    /* renamed from: t */
    public List<C76586e> f224157t = new ArrayList();

    /* renamed from: u */
    public C76585d f224158u;

    /* renamed from: v */
    public View.OnClickListener f224159v = new C76582a();

    /* renamed from: w */
    public CompoundButton.OnCheckedChangeListener f224160w = new C76583b();

    /* renamed from: kj3.c$a */
    public class C76582a implements View.OnClickListener {
        public C76582a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int id = view.getId();
            C76585d dVar = C76581c.this.f224158u;
            if (dVar != null) {
                if (id == C0966R.C0970id.b27) {
                    C74103m.C74107d.C74108a aVar = (C74103m.C74107d.C74108a) dVar;
                    aVar.f217511a.dismiss();
                    List<C76586e> list = aVar.f217511a.f224157t;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        C76586e eVar = (C76586e) it.next();
                        if (eVar.f224166c) {
                            sb.append(eVar.f224164a);
                            sb.append(XVFSFile.PATH_SEPARATOR);
                        }
                    }
                    if (sb.length() > 0) {
                        sb.setLength(sb.length() - 1);
                    }
                    C74103m mVar = C74103m.this;
                    String str = aVar.f217512b;
                    String str2 = aVar.f217513c;
                    String str3 = aVar.f217514d;
                    String str4 = aVar.f217515e;
                    String sb4 = sb.toString();
                    int i = aVar.f217516f;
                    C77407n nVar = new C77407n((Context) mVar.f217504w.mo91565f(), 1, true);
                    nVar.mo107559d(true);
                    Resources resources = mVar.f217504w.mo91565f().getResources();
                    View inflate = LayoutInflater.from(mVar.f217504w.mo91565f()).inflate(C0966R.C0971layout.f6829po, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
                    textView.setText(String.format(resources.getString(C0966R.string.b6i), new Object[]{str}));
                    textView.setTextSize(1, 14.0f);
                    nVar.mo107569n(inflate, true);
                    View inflate2 = LayoutInflater.from(mVar.f217504w.mo91565f()).inflate(C0966R.C0971layout.f6828pn, (ViewGroup) null);
                    inflate2.setOnClickListener(new C6809r(mVar, nVar));
                    nVar.mo107567l(inflate2);
                    nVar.f225771i = new C74200s(mVar);
                    nVar.f225782p = new C74089l(mVar, str2, i, str3, str4, sb4);
                    nVar.mo107573q();
                } else if (id == C0966R.C0970id.b1x || id == C0966R.C0970id.f357657b22) {
                    C74103m.C74107d.C74108a aVar2 = (C74103m.C74107d.C74108a) dVar;
                    aVar2.f217511a.dismiss();
                    C74103m mVar2 = C74103m.this;
                    View view2 = aVar2.f217517g;
                    String str5 = aVar2.f217513c;
                    String str6 = C74103m.f217496G;
                    mVar2.getClass();
                    C97625j3.m125815e().mo123455a(1198, new C74125n(mVar2, view2, str5));
                    C46664n nVar2 = new C46664n(aVar2.f217518h.getContent());
                    C74103m.this.f217505x = C76879j.m92723Q(aVar2.f217517g.getContext(), aVar2.f217517g.getResources().getString(C0966R.string.a3h), aVar2.f217517g.getResources().getString(C0966R.string.a4d), true, true, new C74218t(aVar2, nVar2));
                    C97625j3.m125815e().mo123460f(nVar2);
                    C74103m.this.mo103172p0(3, aVar2.f217513c, aVar2.f217514d, aVar2.f217515e, (String) null, C74103m.m88158o0(C74103m.this, aVar2.f217516f));
                } else if (id == C0966R.C0970id.b1y || id == C0966R.C0970id.f357658b23) {
                    C74103m.C74107d.C74108a aVar3 = (C74103m.C74107d.C74108a) dVar;
                    aVar3.f217511a.dismiss();
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101125kD(aVar3.f217518h.getMsgId());
                } else if (id == C0966R.C0970id.f357659b24) {
                    C74103m.C74107d.C74108a aVar4 = (C74103m.C74107d.C74108a) dVar;
                    aVar4.f217511a.dismiss();
                    C78373a a = C78373a.m94636a(aVar4.f217518h.getContent());
                    Log.m105925i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) name click", a.f229654d);
                    C88144b.m109791i(aVar4.f217517g.getContext(), XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeUI", new Intent().putExtra("key_username", a.f229654d), (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kj3.c$b */
    public class C76583b implements CompoundButton.OnCheckedChangeListener {
        public C76583b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((C76586e) compoundButton.getTag()).f224166c = z;
            if (z) {
                C76581c.this.f224145e++;
            } else {
                C76581c cVar = C76581c.this;
                cVar.f224145e--;
            }
            C76581c cVar2 = C76581c.this;
            Button button = cVar2.f224150j;
            if (button != null) {
                button.setText(Math.max(0, cVar2.f224145e) == 0 ? C0966R.string.b6t : C0966R.string.a3d);
            }
        }
    }

    /* renamed from: kj3.c$c */
    public class C76584c implements Runnable {
        public C76584c() {
        }

        public void run() {
            C76581c.this.dismiss();
        }
    }

    /* renamed from: kj3.c$d */
    public interface C76585d {
    }

    /* renamed from: kj3.c$e */
    public class C76586e {

        /* renamed from: a */
        public int f224164a;

        /* renamed from: b */
        public String f224165b;

        /* renamed from: c */
        public boolean f224166c;

        public C76586e(C76581c cVar, int i, String str, boolean z) {
            this.f224164a = i;
            this.f224165b = str;
            this.f224166c = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76581c(Context context, int i, String str) {
        super(context, C0966R.style.f8830zb);
        Class cls = C68585h1.class;
        this.f224144d = i;
        this.f224145e = 0;
        if (!Util.isNullOrNil(str)) {
            this.f224146f = ((C68585h1) C86312j.m106911c(cls)).mo94243l8(str, 0) || ((C68585h1) C86312j.m106911c(cls)).mo94243l8(str, 1) || ((C68585h1) C86312j.m106911c(cls)).mo94243l8(str, 2);
        }
        LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6830pp, (ViewGroup) null);
        this.f224147g = linearLayout;
        ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.b1w);
        this.f224148h = imageView;
        imageView.setColorFilter(context.getResources().getColor(C0966R.color.f2929c));
        ImageView imageView2 = (ImageView) this.f224147g.findViewById(C0966R.C0970id.b1v);
        this.f224149i = imageView2;
        imageView2.setColorFilter(context.getResources().getColor(C0966R.color.f2929c));
        setCanceledOnTouchOutside(true);
        if (this.f224144d == 0) {
            ((ViewStub) this.f224147g.findViewById(C0966R.C0970id.f357656b21)).inflate();
            this.f224150j = (Button) this.f224147g.findViewById(C0966R.C0970id.b27);
            this.f224151n = (ViewGroup) this.f224147g.findViewById(C0966R.C0970id.f357655b20);
            this.f224152o = (TextView) this.f224147g.findViewById(C0966R.C0970id.b1x);
            this.f224153p = (TextView) this.f224147g.findViewById(C0966R.C0970id.b1y);
            this.f224150j.setOnClickListener(this.f224159v);
            this.f224152o.setOnClickListener(this.f224159v);
            this.f224153p.setOnClickListener(this.f224159v);
            ArrayList arrayList = new ArrayList();
            Context context2 = this.f224147g.getContext();
            arrayList.add(new C76586e(this, 1, context2.getString(C0966R.string.b6o), false));
            arrayList.add(new C76586e(this, 2, context2.getString(C0966R.string.b6n), false));
            arrayList.add(new C76586e(this, 3, context2.getString(C0966R.string.b6p), false));
            if (arrayList.isEmpty()) {
                Log.m105924i("MicroMsg.AppBrandNoticeMoreDialog", "has no reason data");
                return;
            }
            ((ArrayList) this.f224157t).clear();
            ((ArrayList) this.f224157t).addAll(arrayList);
            Context context3 = this.f224147g.getContext();
            LinearLayout linearLayout2 = new LinearLayout(context3);
            int i2 = 0;
            while (i2 < arrayList.size() / 3) {
                linearLayout2.setOrientation(0);
                for (int i3 = 0; i3 < 3; i3++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(C0966R.dimen.f3924j4));
                    MMCheckBox c = mo106808c(context3, (C76586e) arrayList.get((i2 * 3) + i3));
                    if (i3 != 0) {
                        layoutParams.leftMargin = context3.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
                    }
                    linearLayout2.addView(c, layoutParams);
                }
                i2++;
            }
            this.f224151n.addView(linearLayout2);
            LinearLayout linearLayout3 = new LinearLayout(context3);
            int i4 = 0;
            while (true) {
                int i5 = i2 * 3;
                if (i4 < arrayList.size() - i5) {
                    linearLayout3.setOrientation(0);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(C0966R.dimen.f3924j4));
                    MMCheckBox c2 = mo106808c(context3, (C76586e) arrayList.get(i5 + i4));
                    if (i4 != 0) {
                        layoutParams2.leftMargin = context3.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
                    }
                    linearLayout3.addView(c2, layoutParams2);
                    i4++;
                } else {
                    this.f224151n.addView(linearLayout3);
                    return;
                }
            }
        } else {
            ((ViewStub) this.f224147g.findViewById(C0966R.C0970id.b25)).inflate();
            this.f224154q = (TextView) this.f224147g.findViewById(C0966R.C0970id.f357659b24);
            this.f224155r = (TextView) this.f224147g.findViewById(C0966R.C0970id.f357657b22);
            this.f224156s = (TextView) this.f224147g.findViewById(C0966R.C0970id.f357658b23);
            if (this.f224146f) {
                this.f224154q.setOnClickListener(this.f224159v);
            } else {
                this.f224154q.setVisibility(8);
            }
            this.f224155r.setOnClickListener(this.f224159v);
            this.f224156s.setOnClickListener(this.f224159v);
        }
    }

    /* renamed from: c */
    public final MMCheckBox mo106808c(Context context, C76586e eVar) {
        MMCheckBox mMCheckBox = new MMCheckBox(new ContextThemeWrapper(context, C0966R.style.f8224u), (AttributeSet) null, C0966R.style.f8224u);
        mMCheckBox.setText(eVar.f224165b);
        mMCheckBox.setTag(eVar);
        mMCheckBox.setTextSize(0, (float) C76577a.m92157h(context, C0966R.dimen.f3957lf));
        mMCheckBox.setOnCheckedChangeListener(this.f224160w);
        return mMCheckBox;
    }

    /* renamed from: d */
    public void mo106809d(View view) {
        int i;
        Context context = view.getContext();
        Point h = C85875k4.m106184h(context);
        if (this.f224144d == 0) {
            i = C76577a.m92155f(context, C0966R.dimen.f4256xs) + C76577a.m92155f(context, C0966R.dimen.f4252xo) + C76577a.m92155f(context, C0966R.dimen.f4251xn);
        } else {
            i = C76577a.m92155f(context, C0966R.dimen.f4259xv) + C76577a.m92155f(context, C0966R.dimen.f4252xo) + C76577a.m92155f(context, C0966R.dimen.f4251xn);
            if (!this.f224146f) {
                i -= C76577a.m92155f(context, C0966R.dimen.f4261xx);
            }
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388661;
            attributes.verticalMargin = 0.0f;
            attributes.horizontalMargin = 0.0f;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            attributes.x = (((h.x - iArr[0]) - (view.getMeasuredWidth() / 2)) - C76577a.m92155f(context, C0966R.dimen.f4250xm)) - (C76577a.m92155f(context, C0966R.dimen.f4252xo) / 2);
            int p = C85875k4.m106200p(context);
            int f = C76577a.m92155f(context, C0966R.dimen.f4258xu);
            int f2 = C76577a.m92155f(context, C0966R.dimen.f4253xp);
            if ((((iArr[1] + view.getMeasuredHeight()) + i) + f) - f2 > h.y - C85875k4.m106188j(context)) {
                attributes.y = (((iArr[1] - p) - i) - f) + f2;
                this.f224148h.setVisibility(8);
                this.f224149i.setVisibility(0);
            } else {
                attributes.y = (((iArr[1] - p) + view.getMeasuredHeight()) + f) - f2;
                this.f224148h.setVisibility(0);
                this.f224149i.setVisibility(8);
            }
            window.setAttributes(attributes);
        }
        try {
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNoticeMoreDialog", e, "", new Object[0]);
        }
    }

    public void dismiss() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            MMHandlerThread.postToMainThread(new C76584c());
            Log.m105920e("MicroMsg.AppBrandNoticeMoreDialog", Util.getStack().toString());
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandNoticeMoreDialog", "dismiss exception, e = " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f224147g);
    }
}
