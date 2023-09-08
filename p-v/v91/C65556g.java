package v91;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e91.C116711b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p91.C100693b;

/* renamed from: v91.g */
public final class C65556g implements C100693b {

    /* renamed from: a */
    public Field f188614a;

    /* renamed from: b */
    public WeakReference<Object> f188615b;

    /* renamed from: c */
    public Field f188616c;

    /* renamed from: d */
    public Field f188617d;

    /* renamed from: e */
    public Field f188618e;

    /* renamed from: f */
    public Field f188619f;

    /* renamed from: g */
    public Field f188620g;

    /* renamed from: h */
    public Field f188621h;

    /* renamed from: i */
    public WeakReference<Activity> f188622i;

    public C65556g(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f188622i = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public String mo87288a(View view, int i) {
        Object g = mo89647g(i);
        if (g != null) {
            try {
                Field field = this.f188616c;
                if (field != null) {
                    Object obj = field.get(g);
                    Field field2 = this.f188617d;
                    if (field2 != null) {
                        Object obj2 = field2.get(obj);
                        Field field3 = this.f188620g;
                        if (field3 != null) {
                            Object obj3 = field3.get(obj2);
                            if (obj3 instanceof String) {
                                return (String) obj3;
                            }
                            return null;
                        }
                        C87412m.m108603p("username_field");
                        throw null;
                    }
                    C87412m.m108603p("feedObject_item_field");
                    throw null;
                }
                C87412m.m108603p("feedObject_field");
                throw null;
            } catch (Exception e) {
                Log.m105920e("HABBYGE-MALI.ProfileParamsCatcher", "ProfileParamsCatcher, getFeedUserName crash: " + e.getMessage());
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
        Object g = mo89647g(i);
        if (g != null) {
            try {
                Field field = this.f188616c;
                if (field != null) {
                    Object obj = field.get(g);
                    Field field2 = this.f188617d;
                    if (field2 != null) {
                        Object obj2 = field2.get(obj);
                        Field field3 = this.f188621h;
                        if (field3 != null) {
                            Object obj3 = field3.get(obj2);
                            if (obj3 instanceof String) {
                                return (String) obj3;
                            }
                            return null;
                        }
                        C87412m.m108603p("sessionBuffer_field");
                        throw null;
                    }
                    C87412m.m108603p("feedObject_item_field");
                    throw null;
                }
                C87412m.m108603p("feedObject_field");
                throw null;
            } catch (Exception e) {
                Log.m105920e("HABBYGE-MALI.ProfileParamsCatcher", "ProfileParamsCatcher, getSessionBuffer crash: " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo87292e(View view, int i) {
        Object g = mo89647g(i);
        if (g != null) {
            try {
                Field field = this.f188616c;
                if (field != null) {
                    Object obj = field.get(g);
                    Field field2 = this.f188617d;
                    if (field2 != null) {
                        Object obj2 = field2.get(obj);
                        Field field3 = this.f188618e;
                        if (field3 != null) {
                            Object obj3 = field3.get(obj2);
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            return C116711b.m164593r(((Long) obj3).longValue());
                        }
                        C87412m.m108603p("id_field");
                        throw null;
                    }
                    C87412m.m108603p("feedObject_item_field");
                    throw null;
                }
                C87412m.m108603p("feedObject_field");
                throw null;
            } catch (Exception e) {
                Log.m105920e("HABBYGE-MALI.ProfileParamsCatcher", "ProfileParamsCatcher, getFeedItem crash: " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: f */
    public String mo87293f(View view, int i) {
        Object g = mo89647g(i);
        if (g != null) {
            try {
                Field field = this.f188616c;
                if (field != null) {
                    Object obj = field.get(g);
                    Field field2 = this.f188617d;
                    if (field2 != null) {
                        Object obj2 = field2.get(obj);
                        Field field3 = this.f188619f;
                        if (field3 != null) {
                            Object obj3 = field3.get(obj2);
                            if (obj3 instanceof String) {
                                return (String) obj3;
                            }
                            return null;
                        }
                        C87412m.m108603p("nickname_field");
                        throw null;
                    }
                    C87412m.m108603p("feedObject_item_field");
                    throw null;
                }
                C87412m.m108603p("feedObject_field");
                throw null;
            } catch (Exception e) {
                Log.m105920e("HABBYGE-MALI.ProfileParamsCatcher", "ProfileParamsCatcher, getFeedNickName crash: " + e.getMessage());
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0141 A[SYNTHETIC, Splitter:B:24:0x0141] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89647g(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "feedObject"
            java.lang.String r1 = "mainUIC"
            java.lang.ref.WeakReference<java.lang.Object> r2 = r10.f188615b
            java.lang.String r3 = "HABBYGE-MALI.ProfileParamsCatcher"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x0015
        L_0x0012:
            r6 = 1
            goto L_0x013f
        L_0x0015:
            java.lang.ref.WeakReference<android.app.Activity> r2 = r10.f188622i
            r6 = 0
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 != 0) goto L_0x0024
            goto L_0x013f
        L_0x0024:
            java.lang.Class<com.tencent.mm.ui.component.UIComponentActivity> r2 = com.tencent.p014mm.p136ui.component.UIComponentActivity.class
            com.tencent.mm.ui.component.UIComponentActivity$a r7 = com.tencent.p014mm.p136ui.component.UIComponentActivity.Companion     // Catch:{ Exception -> 0x0126 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.ref.WeakReference<android.app.Activity> r7 = r10.f188622i     // Catch:{ Exception -> 0x0126 }
            if (r7 == 0) goto L_0x003a
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x0126 }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ Exception -> 0x0126 }
            goto L_0x003b
        L_0x003a:
            r7 = r5
        L_0x003b:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC> r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC.class
            java.lang.String r8 = "tabProvider"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0126 }
            r7.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider> r7 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider.class
            java.lang.String r8 = "fragments"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0126 }
            r7.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r7 = "null cannot be cast to non-null type java.util.LinkedList<*>"
            gy3.C87412m.m108592e(r2, r7)     // Catch:{ Exception -> 0x0126 }
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ Exception -> 0x0126 }
            java.lang.String r7 = "com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0126 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0126 }
        L_0x006f:
            boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x0126 }
            if (r8 == 0) goto L_0x0012
            java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x0126 }
            boolean r9 = r7.isInstance(r8)     // Catch:{ Exception -> 0x0126 }
            if (r9 == 0) goto L_0x006f
            java.lang.String r2 = "com.tencent.mm.ui.component.UIComponentFragment"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0126 }
            java.lang.reflect.Field r1 = r2.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC> r2 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class
            java.lang.String r7 = "getFeedLoader"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0126 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0126 }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0126 }
            java.lang.Object r1 = r2.invoke(r1, r7)     // Catch:{ Exception -> 0x0126 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0126 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0126 }
            r10.f188615b = r2     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.plugin.finder.feed.model.internal.DataStore> r1 = com.tencent.p014mm.plugin.finder.feed.model.internal.DataStore.class
            java.lang.String r2 = "dataList"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = "DataStore_Class.getDecla…ield(dataList_field_name)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0126 }
            r10.f188614a = r1     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = "BaseFinderFeed_Class.get…ld(feedObject_field_name)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0126 }
            r10.f188616c = r1     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "com.tencent.mm.plugin.finder.storage.FinderItem"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "finderItem_Class.getDecl…bject_field_name_of_item)"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0126 }
            r10.f188617d = r0     // Catch:{ Exception -> 0x0126 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.Class<com.tencent.mm.protocal.protobuf.FinderObject> r0 = com.tencent.p014mm.protocal.protobuf.FinderObject.class
            java.lang.String r1 = "id"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = "FinderObject_NAME.getDeclaredField(id_field_name)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0126 }
            r10.f188618e = r1     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "username"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = "FinderObject_NAME.getDec…ield(username_field_name)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0126 }
            r10.f188620g = r1     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "nickname"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = "FinderObject_NAME.getDec…ield(nickname_field_name)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0126 }
            r10.f188619f = r1     // Catch:{ Exception -> 0x0126 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "sessionBuffer"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "FinderObject_NAME.getDec…sessionBuffer_field_name)"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0126 }
            r10.f188621h = r0     // Catch:{ Exception -> 0x0126 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0126 }
            goto L_0x0012
        L_0x0126:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init, reflect exception: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x013f:
            if (r6 == 0) goto L_0x0192
            java.lang.reflect.Field r0 = r10.f188614a     // Catch:{ Exception -> 0x0179 }
            if (r0 == 0) goto L_0x0173
            java.lang.ref.WeakReference<java.lang.Object> r1 = r10.f188615b     // Catch:{ Exception -> 0x0179 }
            if (r1 == 0) goto L_0x014e
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0179 }
            goto L_0x014f
        L_0x014e:
            r1 = r5
        L_0x014f:
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0179 }
            boolean r1 = r0 instanceof java.util.ArrayList     // Catch:{ Exception -> 0x0179 }
            if (r1 == 0) goto L_0x0192
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0179 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0179 }
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0192
            if (r11 < 0) goto L_0x0192
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0179 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0179 }
            if (r11 >= r1) goto L_0x0192
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0179 }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x0179 }
            return r11
        L_0x0173:
            java.lang.String r11 = "dataList_field"
            gy3.C87412m.m108603p(r11)     // Catch:{ Exception -> 0x0179 }
            throw r5     // Catch:{ Exception -> 0x0179 }
        L_0x0179:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getfeedItem, reflect exception: "
            r0.append(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
        L_0x0192:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v91.C65556g.mo89647g(int):java.lang.Object");
    }

    public void setRecyclerView(RecyclerView recyclerView) {
    }
}
