package v91;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import e91.C116711b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import oj3.C62036a;
import p91.C100693b;

/* renamed from: v91.h */
public final class C65557h implements C100693b {

    /* renamed from: b */
    public static Field f188623b;

    /* renamed from: c */
    public static Field f188624c;

    /* renamed from: d */
    public static Method f188625d;

    /* renamed from: e */
    public static Method f188626e;

    /* renamed from: f */
    public static Method f188627f;

    /* renamed from: g */
    public static Method f188628g;

    /* renamed from: h */
    public static Field f188629h;

    /* renamed from: a */
    public WeakReference<RecyclerView> f188630a;

    public C65557h() {
        Log.m105928w("HABBYGE-MALI.TopicParamsCatcher", "TopicParamsCatcher");
        try {
            Field declaredField = WxRecyclerAdapter.class.getDeclaredField("data");
            f188623b = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = BaseFinderFeed.class.getDeclaredField("feedObject");
            f188624c = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Class<?> cls = Class.forName("com.tencent.mm.plugin.finder.storage.FinderItem");
            Method declaredMethod = cls.getDeclaredMethod("getId", new Class[0]);
            f188625d = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Method declaredMethod2 = cls.getDeclaredMethod("getUserName", new Class[0]);
            f188626e = declaredMethod2;
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            Method declaredMethod3 = cls.getDeclaredMethod("getNickName", new Class[0]);
            f188627f = declaredMethod3;
            if (declaredMethod3 != null) {
                declaredMethod3.setAccessible(true);
            }
            Method declaredMethod4 = cls.getDeclaredMethod("getFinderObject", new Class[0]);
            C87412m.m108593f(declaredMethod4, "FinderItem_Class.getDecl…FinderObject_Method_Name)");
            f188628g = declaredMethod4;
            declaredMethod4.setAccessible(true);
            Field declaredField3 = FinderObject.class.getDeclaredField("sessionBuffer");
            C87412m.m108593f(declaredField3, "FinderObject_Class.getDe…sessionBuffer_Field_Name)");
            f188629h = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Throwable th) {
            Log.printErrStackTrace("HABBYGE-MALI.TopicParamsCatcher", th, "reflect crash: %s", th.getMessage());
        }
    }

    /* renamed from: a */
    public String mo87288a(View view, int i) {
        RecyclerView.C16613e adapter;
        Object obj;
        WeakReference<RecyclerView> weakReference = this.f188630a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f188623b;
                        Object obj2 = field != null ? field.get(adapter) : null;
                        if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                            return null;
                        }
                        Field field2 = f188624c;
                        Object obj3 = field2 != null ? field2.get(obj) : null;
                        Method method = f188626e;
                        Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                        if (invoke instanceof String) {
                            return (String) invoke;
                        }
                        return null;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.TopicParamsCatcher", e, "getFeedUserName e1: " + e.getMessage(), new Object[0]);
                        return null;
                    }
                } else {
                    boolean z = adapter instanceof C62036a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo87289b(View view, PInt pInt, PInt pInt2, int i) {
    }

    /* renamed from: c */
    public boolean mo87290c(View view, int i) {
        return false;
    }

    /* renamed from: d */
    public String mo87291d(int i) {
        RecyclerView.C16613e adapter;
        Object obj;
        WeakReference<RecyclerView> weakReference = this.f188630a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || !(adapter instanceof WxRecyclerAdapter))) {
                try {
                    Field field = f188623b;
                    Object obj2 = field != null ? field.get(adapter) : null;
                    if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                        return null;
                    }
                    Field field2 = f188624c;
                    Object obj3 = field2 != null ? field2.get(obj) : null;
                    Method method = f188628g;
                    if (method != null) {
                        Object invoke = method.invoke(obj3, new Object[0]);
                        Field field3 = f188629h;
                        if (field3 != null) {
                            Object obj4 = field3.get(invoke);
                            if (obj4 instanceof String) {
                                return (String) obj4;
                            }
                            return null;
                        }
                        C87412m.m108603p("sessionBuffer_Field");
                        throw null;
                    }
                    C87412m.m108603p("getFinderObject_Method");
                    throw null;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo87292e(View view, int i) {
        RecyclerView.C16613e adapter;
        WeakReference<RecyclerView> weakReference = this.f188630a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f188623b;
                        Object obj = field != null ? field.get(adapter) : null;
                        if (obj == null) {
                            return null;
                        }
                        ArrayList arrayList = (ArrayList) obj;
                        if (!arrayList.isEmpty() && i > -1) {
                            if (i < arrayList.size()) {
                                Object obj2 = arrayList.get(i);
                                if (obj2 == null) {
                                    return null;
                                }
                                Field field2 = f188624c;
                                Object obj3 = field2 != null ? field2.get(obj2) : null;
                                Method method = f188625d;
                                Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                                C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Long");
                                return C116711b.m164593r(((Long) invoke).longValue());
                            }
                        }
                        return null;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.TopicParamsCatcher", e, "_getFeedId, e2, crash: " + e.getMessage(), new Object[0]);
                        return null;
                    }
                } else {
                    boolean z = adapter instanceof C62036a;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public String mo87293f(View view, int i) {
        RecyclerView.C16613e adapter;
        Object obj;
        WeakReference<RecyclerView> weakReference = this.f188630a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f188623b;
                        Object obj2 = field != null ? field.get(adapter) : null;
                        if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                            return null;
                        }
                        Field field2 = f188624c;
                        Object obj3 = field2 != null ? field2.get(obj) : null;
                        Method method = f188627f;
                        Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                        if (invoke instanceof String) {
                            return (String) invoke;
                        }
                        return null;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.TopicParamsCatcher", e, "getFeedNickName e1: " + e.getMessage(), new Object[0]);
                        return null;
                    }
                } else {
                    boolean z = adapter instanceof C62036a;
                }
            }
        }
        return null;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            WeakReference<RecyclerView> weakReference = this.f188630a;
            if (weakReference != null) {
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    return;
                }
            }
            this.f188630a = new WeakReference<>(recyclerView);
        }
    }
}
