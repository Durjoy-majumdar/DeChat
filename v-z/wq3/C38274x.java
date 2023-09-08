package wq3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import rx3.C13604l;
import sx3.C64175a0;
import sx3.C90364q0;
import zt3.C119157j;

/* renamed from: wq3.x */
public final class C38274x implements C111848i {

    /* renamed from: a */
    public static final C38274x f101047a = new C38274x();

    /* renamed from: b */
    public static final C32226l<C38276b, View> f101048b = C38278d.f101057d;

    /* renamed from: c */
    public static final Map<String, C38276b> f101049c = C90364q0.m113148g(new C13604l("com.tencent.mm.view.x2c.X2CView", new C38276b("com.tencent.mm.view.x2c.X2CView", (List) null, 20, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CTextView", new C38276b("com.tencent.mm.view.x2c.X2CTextView", (List) null, 80, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CImageView", new C38276b("com.tencent.mm.view.x2c.X2CImageView", (List) null, 40, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CButton", new C38276b("com.tencent.mm.view.x2c.X2CButton", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CImageButton", new C38276b("com.tencent.mm.view.x2c.X2CImageButton", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CLinearLayout", new C38276b("com.tencent.mm.view.x2c.X2CLinearLayout", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CRelativeLayout", new C38276b("com.tencent.mm.view.x2c.X2CRelativeLayout", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CFrameLayout", new C38276b("com.tencent.mm.view.x2c.X2CFrameLayout", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.view.x2c.X2CListView", new C38276b("com.tencent.mm.view.x2c.X2CListView", (List) null, 5, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.ui.widget.imageview.WeImageButton", new C38276b("com.tencent.mm.ui.widget.imageview.WeImageButton", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.ui.widget.imageview.WeImageView", new C38276b("com.tencent.mm.ui.widget.imageview.WeImageView", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.ui.base.NoMeasuredTextView", new C38276b("com.tencent.mm.ui.base.NoMeasuredTextView", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.ui.conversation.ConversationFolderItemView", new C38276b("com.tencent.mm.ui.conversation.ConversationFolderItemView", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl", new C38276b("com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl", (List) null, 10, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.kiss.widget.textview.PLSysTextView", new C38276b("com.tencent.mm.kiss.widget.textview.PLSysTextView", (List) null, 0, (C32226l) null, 14, (C8480h) null)), new C13604l("com.tencent.mm.plugin.sns.ui.SnsTranslateResultView", new C38276b("com.tencent.mm.plugin.sns.ui.SnsTranslateResultView", (List) null, 5, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.plugin.sns.ui.AsyncTextView", new C38276b("com.tencent.mm.plugin.sns.ui.AsyncTextView", (List) null, 5, (C32226l) null, 10, (C8480h) null)), new C13604l("com.tencent.mm.ui.base.EllipsizeTextView", new C38276b("com.tencent.mm.ui.base.EllipsizeTextView", (List) null, 5, (C32226l) null, 10, (C8480h) null)));

    /* renamed from: d */
    public static Field f101050d;

    /* renamed from: e */
    public static volatile boolean f101051e;

    /* renamed from: wq3.x$a */
    public static final class C38275a extends C38276b {
    }

    /* renamed from: wq3.x$b */
    public static class C38276b {

        /* renamed from: a */
        public final String f101052a;

        /* renamed from: b */
        public final List<View> f101053b;

        /* renamed from: c */
        public final int f101054c;

        /* renamed from: d */
        public final C32226l<C38276b, View> f101055d;

        public C38276b(String str, List<View> list, int i, C32226l<C38276b, View> lVar, int i2, C8480h hVar) {
            if ((i2 & 2) != 0) {
                list = Collections.synchronizedList(new LinkedList());
                C87412m.m108593f(list, "synchronizedList(LinkedList())");
            }
            i = (i2 & 4) != 0 ? 20 : i;
            lVar = (i2 & 8) != 0 ? C38274x.f101048b : lVar;
            C87412m.m108594g(str, "name");
            C87412m.m108594g(list, "cacheList");
            C87412m.m108594g(lVar, "creator");
            this.f101052a = str;
            this.f101053b = list;
            this.f101054c = i;
            this.f101055d = lVar;
        }
    }

    /* renamed from: wq3.x$c */
    public static final class C38277c implements Runnable {

        /* renamed from: d */
        public static final C38277c f101056d = new C38277c();

        public final void run() {
            C38274x.f101047a.getClass();
            if (!C38274x.f101051e) {
                C38274x.f101051e = true;
                C61926c.m72660E("X2C_VIEW_THREAD", false, C38279y.f101058d);
            }
        }
    }

    /* renamed from: wq3.x$d */
    public static final class C38278d extends C87413o implements C32226l<C38276b, View> {

        /* renamed from: d */
        public static final C38278d f101057d = new C38278d();

        public C38278d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C38276b bVar = (C38276b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            Constructor<?> constructor = Class.forName(bVar.f101052a).getConstructor(new Class[]{Context.class, AttributeSet.class});
            C111855q.f334885a.getClass();
            Object newInstance = constructor.newInstance(new Object[]{MMApplicationContext.getContext(), C111855q.f334888d});
            if (newInstance instanceof View) {
                return (View) newInstance;
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo61583a() {
        try {
            if (f101050d == null) {
                Field declaredField = View.class.getDeclaredField("mContext");
                f101050d = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.X2C.X2CViewCreator", e, "prepareReflect", new Object[0]);
        }
        if (f101050d != null) {
            ((C119157j) C119157j.f356862d).mo183872c(C38277c.f101056d, 0, 300000);
        }
    }

    /* renamed from: b */
    public View mo61584b(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "name");
        C38276b bVar = (C38276b) ((LinkedHashMap) f101049c).get(str);
        if (bVar != null) {
            C38274x xVar = f101047a;
            List<View> list = bVar.f101053b;
            int i = bVar.f101054c;
            xVar.getClass();
            Field field = f101050d;
            if (field != null) {
                if (!list.isEmpty()) {
                    View view = (View) C64175a0.m75513u(list);
                    field.set(view, context);
                    if (list.size() >= i / 2 || f101051e) {
                        return view;
                    }
                    f101051e = true;
                    C61926c.m72660E("X2C_VIEW_THREAD", false, C38279y.f101058d);
                    return view;
                } else if (!f101051e) {
                    f101051e = true;
                    C61926c.m72660E("X2C_VIEW_THREAD", false, C38279y.f101058d);
                }
            }
        }
        return null;
    }
}
