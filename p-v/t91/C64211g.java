package t91;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
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

/* renamed from: t91.g */
public final class C64211g implements C100693b {

    /* renamed from: b */
    public static Field f181983b;

    /* renamed from: c */
    public static Field f181984c;

    /* renamed from: d */
    public static Method f181985d;

    /* renamed from: e */
    public static Method f181986e;

    /* renamed from: f */
    public static Method f181987f;

    /* renamed from: g */
    public static Method f181988g;

    /* renamed from: h */
    public static Field f181989h;

    /* renamed from: a */
    public WeakReference<RecyclerView> f181990a;

    public C64211g() {
        try {
            Field declaredField = WxRecyclerAdapter.class.getDeclaredField("data");
            f181983b = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Class<FeedData> cls = FeedData.class;
            Method declaredMethod = cls.getDeclaredMethod("getId", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Method declaredMethod2 = cls.getDeclaredMethod("getUserName", new Class[0]);
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            Method declaredMethod3 = cls.getDeclaredMethod("getNickName", new Class[0]);
            if (declaredMethod3 != null) {
                declaredMethod3.setAccessible(true);
            }
            Method declaredMethod4 = cls.getDeclaredMethod("getSessionBuffer", new Class[0]);
            if (declaredMethod4 != null) {
                declaredMethod4.setAccessible(true);
            }
            Field declaredField2 = BaseFinderFeed.class.getDeclaredField("feedObject");
            f181984c = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Class<?> cls2 = Class.forName("com.tencent.mm.plugin.finder.storage.FinderItem");
            Method declaredMethod5 = cls2.getDeclaredMethod("getId", new Class[0]);
            f181985d = declaredMethod5;
            if (declaredMethod5 != null) {
                declaredMethod5.setAccessible(true);
            }
            Method declaredMethod6 = cls2.getDeclaredMethod("getUserName", new Class[0]);
            f181986e = declaredMethod6;
            if (declaredMethod6 != null) {
                declaredMethod6.setAccessible(true);
            }
            Method declaredMethod7 = cls2.getDeclaredMethod("getNickName", new Class[0]);
            f181987f = declaredMethod7;
            if (declaredMethod7 != null) {
                declaredMethod7.setAccessible(true);
            }
            Method declaredMethod8 = cls2.getDeclaredMethod("getFinderObject", new Class[0]);
            C87412m.m108593f(declaredMethod8, "FinderItem_Class.getDecl…FinderObject_Method_Name)");
            f181988g = declaredMethod8;
            declaredMethod8.setAccessible(true);
            Field declaredField3 = FinderObject.class.getDeclaredField("sessionBuffer");
            C87412m.m108593f(declaredField3, "FinderObject_Class.getDe…sessionBuffer_Field_Name)");
            f181989h = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Throwable unused) {
            Log.m105920e("HABBYGE-MALI.LbsParamsCatcher", "reflect crash");
        }
    }

    /* renamed from: a */
    public String mo87288a(View view, int i) {
        RecyclerView.C16613e adapter;
        Object obj;
        WeakReference<RecyclerView> weakReference = this.f181990a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f181983b;
                        Object obj2 = field != null ? field.get(adapter) : null;
                        if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                            return null;
                        }
                        Field field2 = f181984c;
                        Object obj3 = field2 != null ? field2.get(obj) : null;
                        Method method = f181986e;
                        Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                        C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.String");
                        return (String) invoke;
                    } catch (Exception unused) {
                        Log.m105920e("HABBYGE-MALI.LbsParamsCatcher", "getFeedUserName, e1, crash");
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
        WeakReference<RecyclerView> weakReference = this.f181990a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f181983b;
                        Object obj2 = field != null ? field.get(adapter) : null;
                        if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                            return null;
                        }
                        Field field2 = f181984c;
                        Object obj3 = field2 != null ? field2.get(obj) : null;
                        Method method = f181988g;
                        if (method != null) {
                            Object invoke = method.invoke(obj3, new Object[0]);
                            Field field3 = f181989h;
                            if (field3 != null) {
                                Object obj4 = field3.get(invoke);
                                C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.String");
                                return (String) obj4;
                            }
                            C87412m.m108603p("sessionBuffer_Field");
                            throw null;
                        }
                        C87412m.m108603p("getFinderObject_Method");
                        throw null;
                    } catch (Exception unused) {
                        Log.m105920e("HABBYGE-MALI.LbsParamsCatcher", "getFinderObject_Method, e1, crash");
                        return null;
                    }
                } else {
                    boolean z = adapter instanceof C62036a;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo87292e(View view, int i) {
        RecyclerView.C16613e adapter;
        WeakReference<RecyclerView> weakReference = this.f181990a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f181983b;
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
                                Field field2 = f181984c;
                                Object obj3 = field2 != null ? field2.get(obj2) : null;
                                Method method = f181985d;
                                Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                                C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Long");
                                return C116711b.m164593r(((Long) invoke).longValue());
                            }
                        }
                        return null;
                    } catch (Exception unused) {
                        Log.m105920e("HABBYGE-MALI.LbsParamsCatcher", "_getFeedId, e2, crash");
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
        WeakReference<RecyclerView> weakReference = this.f181990a;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                if (adapter instanceof WxRecyclerAdapter) {
                    try {
                        Field field = f181983b;
                        Object obj2 = field != null ? field.get(adapter) : null;
                        if (obj2 == null || !(obj2 instanceof ArrayList) || !(!((Collection) obj2).isEmpty()) || i < 0 || i >= ((ArrayList) obj2).size() || (obj = ((ArrayList) obj2).get(i)) == null) {
                            return null;
                        }
                        Field field2 = f181984c;
                        Object obj3 = field2 != null ? field2.get(obj) : null;
                        Method method = f181987f;
                        Object invoke = method != null ? method.invoke(obj3, new Object[0]) : null;
                        C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.String");
                        return (String) invoke;
                    } catch (Exception unused) {
                        Log.m105920e("HABBYGE-MALI.LbsParamsCatcher", "getFeedNickName, e1, crash");
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
            WeakReference<RecyclerView> weakReference = this.f181990a;
            if (weakReference != null) {
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    return;
                }
            }
            this.f181990a = new WeakReference<>(recyclerView);
        }
    }
}
