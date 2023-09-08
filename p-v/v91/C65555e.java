package v91;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchUI;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e91.C116711b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import p91.C100693b;

/* renamed from: v91.e */
public final class C65555e implements C100693b {

    /* renamed from: a */
    public WeakReference<Object> f188605a;

    /* renamed from: b */
    public Field f188606b;

    /* renamed from: c */
    public Field f188607c;

    /* renamed from: d */
    public Method f188608d;

    /* renamed from: e */
    public Field f188609e;

    /* renamed from: f */
    public Field f188610f;

    /* renamed from: g */
    public Field f188611g;

    /* renamed from: h */
    public Field f188612h;

    /* renamed from: i */
    public WeakReference<RecyclerView> f188613i;

    public C65555e(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Class<FinderMixSearchUI> cls = FinderMixSearchUI.class;
        try {
            int i = FinderMixSearchUI.f16598v;
            Field declaredField = cls.getDeclaredField("presenter");
            declaredField.setAccessible(true);
            this.f188605a = new WeakReference<>(declaredField.get(activity));
            Field declaredField2 = FinderMixSearchPresenter.class.getDeclaredField("feedList");
            C87412m.m108593f(declaredField2, "FinderMixSearchPresenter…ield(feedList_Field_Name)");
            this.f188606b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = BaseFinderFeed.class.getDeclaredField("feedObject");
            C87412m.m108593f(declaredField3, "BaseFinderFeed_Class.get…ld(feedObject_Field_Name)");
            this.f188607c = declaredField3;
            declaredField3.setAccessible(true);
            Method declaredMethod = Class.forName("com.tencent.mm.plugin.finder.storage.FinderItem").getDeclaredMethod("getFinderObject", new Class[0]);
            C87412m.m108593f(declaredMethod, "FinderItem_Class.getDecl…hod(getFinderObject_Name)");
            this.f188608d = declaredMethod;
            declaredMethod.setAccessible(true);
            Class<FinderObject> cls2 = FinderObject.class;
            Field declaredField4 = cls2.getDeclaredField("id");
            C87412m.m108593f(declaredField4, "FinderObject_Class.getDeclaredField(id_Name)");
            this.f188609e = declaredField4;
            declaredField4.setAccessible(true);
            Field declaredField5 = cls2.getDeclaredField("nickname");
            C87412m.m108593f(declaredField5, "FinderObject_Class.getDeclaredField(nickname_Name)");
            this.f188610f = declaredField5;
            declaredField5.setAccessible(true);
            Field declaredField6 = cls2.getDeclaredField("username");
            C87412m.m108593f(declaredField6, "FinderObject_Class.getDeclaredField(username_Name)");
            this.f188611g = declaredField6;
            declaredField6.setAccessible(true);
            Field declaredField7 = cls2.getDeclaredField("sessionBuffer");
            C87412m.m108593f(declaredField7, "FinderObject_Class.getDe…Field(sessionBuffer_Name)");
            this.f188612h = declaredField7;
            declaredField7.setAccessible(true);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "init, reflect exception: " + e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: a */
    public String mo87288a(View view, int i) {
        Object g = mo89646g(i);
        if (g != null) {
            try {
                Field field = this.f188607c;
                if (field != null) {
                    Object obj = field.get(g);
                    Method method = this.f188608d;
                    if (method != null) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        Field field2 = this.f188611g;
                        if (field2 != null) {
                            Object obj2 = field2.get(invoke);
                            if (obj2 instanceof String) {
                                return (String) obj2;
                            }
                            return null;
                        }
                        C87412m.m108603p("username_Field");
                        throw null;
                    }
                    C87412m.m108603p("getFinderObject_Method");
                    throw null;
                }
                C87412m.m108603p("feedObject_Field");
                throw null;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "MixSearchParamsCatcher, getFeedUserName crash: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo87289b(View view, PInt pInt, PInt pInt2, int i) {
        if (pInt != null) {
            pInt.value = 0;
        }
        if (pInt2 != null) {
            pInt2.value = 0;
        }
    }

    /* renamed from: c */
    public boolean mo87290c(View view, int i) {
        return false;
    }

    /* renamed from: d */
    public String mo87291d(int i) {
        Object g = mo89646g(i);
        if (g != null) {
            try {
                Field field = this.f188607c;
                if (field != null) {
                    Object obj = field.get(g);
                    Method method = this.f188608d;
                    if (method != null) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        Field field2 = this.f188612h;
                        if (field2 != null) {
                            Object obj2 = field2.get(invoke);
                            if (obj2 instanceof String) {
                                return (String) obj2;
                            }
                            return null;
                        }
                        C87412m.m108603p("sessionBuffer_Field");
                        throw null;
                    }
                    C87412m.m108603p("getFinderObject_Method");
                    throw null;
                }
                C87412m.m108603p("feedObject_Field");
                throw null;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "MixSearchParamsCatcher, getSessionBuffer crash: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo87292e(View view, int i) {
        Object g = mo89646g(i);
        if (g != null) {
            try {
                Field field = this.f188607c;
                if (field != null) {
                    Object obj = field.get(g);
                    Method method = this.f188608d;
                    if (method != null) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        Field field2 = this.f188609e;
                        if (field2 != null) {
                            Object obj2 = field2.get(invoke);
                            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            return C116711b.m164593r(((Long) obj2).longValue());
                        }
                        C87412m.m108603p("id_Field");
                        throw null;
                    }
                    C87412m.m108603p("getFinderObject_Method");
                    throw null;
                }
                C87412m.m108603p("feedObject_Field");
                throw null;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "MixSearchParamsCatcher, getFeedId crash: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: f */
    public String mo87293f(View view, int i) {
        Object g = mo89646g(i);
        if (g != null) {
            try {
                Field field = this.f188607c;
                if (field != null) {
                    Object obj = field.get(g);
                    Method method = this.f188608d;
                    if (method != null) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        Field field2 = this.f188610f;
                        if (field2 != null) {
                            Object obj2 = field2.get(invoke);
                            if (obj2 instanceof String) {
                                return (String) obj2;
                            }
                            return null;
                        }
                        C87412m.m108603p("nickname_Field");
                        throw null;
                    }
                    C87412m.m108603p("getFinderObject_Method");
                    throw null;
                }
                C87412m.m108603p("feedObject_Field");
                throw null;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "MixSearchParamsCatcher, getFeedNickName crash: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: g */
    public final Object mo89646g(int i) {
        try {
            Field field = this.f188606b;
            if (field != null) {
                WeakReference<Object> weakReference = this.f188605a;
                if (weakReference != null) {
                    Object obj = field.get(weakReference.get());
                    if ((obj instanceof ArrayList) && (!((Collection) obj).isEmpty()) && i >= 0 && i < ((ArrayList) obj).size()) {
                        return ((ArrayList) obj).get(i);
                    }
                    return null;
                }
                C87412m.m108603p("presenterRef");
                throw null;
            }
            C87412m.m108603p("feedList_Field");
            throw null;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.MixSearchParamsCatcher", e, "getfeedItem, reflect exception: " + e.getMessage(), new Object[0]);
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            WeakReference<RecyclerView> weakReference = this.f188613i;
            if (weakReference != null) {
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    return;
                }
            }
            this.f188613i = new WeakReference<>(recyclerView);
        }
    }
}
