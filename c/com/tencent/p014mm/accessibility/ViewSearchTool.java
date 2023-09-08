package com.tencent.p014mm.accessibility;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.accessibility.ViewSearchTool */
public class ViewSearchTool {
    private static final String GET_DEFAULT_IMPL = "getDefault";
    private static final String GET_GLOBAL_INSTANCE = "getInstance";
    private static final String TAG = "ViewSearchTool";
    private static final String VIEWS_FIELD = "mViews";
    private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
    private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
    private static final String WINDOW_PARAMS_FIELD = "mParams";

    /* renamed from: com.tencent.mm.accessibility.ViewSearchTool$Matcher */
    public interface Matcher {
        boolean match(View view);
    }

    private List<View> filter(View view, Matcher matcher) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, Collections.singletonList(view));
        int i = 0;
        while (true) {
            ArrayList arrayList2 = new ArrayList();
            for (View view2 : (List) arrayList.get(i)) {
                if (view2 instanceof ViewGroup) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        arrayList2.add(viewGroup.getChildAt(i2));
                        i2++;
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                break;
            }
            i++;
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (View view3 : (List) it.next()) {
                if (matcher.match(view3)) {
                    arrayList3.add(view3);
                }
            }
        }
        return arrayList3;
    }

    private List<View> findRoots() {
        Class<?> cls = Class.forName(WINDOW_MANAGER_GLOBAL_CLAZZ);
        Object invoke = cls.getMethod(GET_GLOBAL_INSTANCE, new Class[0]).invoke((Object) null, new Object[0]);
        Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
        declaredField.setAccessible(true);
        cls.getDeclaredField(WINDOW_PARAMS_FIELD).setAccessible(true);
        List<View> list = (List) declaredField.get(invoke);
        if (list.size() != 0) {
            return list;
        }
        throw new RuntimeException("something wrong");
    }

    @Deprecated
    public static String findText(View view) {
        if (view == null) {
            return null;
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            return contentDescription.toString();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (((childAt instanceof ViewGroup) || (childAt instanceof TextView)) && (contentDescription = findText(childAt)) != null)) {
                    break;
                }
            }
        } else if (view instanceof TextView) {
            contentDescription = ((TextView) view).getText();
        }
        if (contentDescription != null) {
            return contentDescription.toString();
        }
        return null;
    }

    @Deprecated
    public static String findViewDepth(View view, View view2, String str) {
        if (!(view == null || view2 == null)) {
            if (str == null) {
                str = "";
            }
            if (view.equals(view2)) {
                return str.startsWith("_") ? str.substring(1) : str;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    String findViewDepth = findViewDepth(childAt, view2, str + "_" + i);
                    if (findViewDepth != null && !findViewDepth.equals("")) {
                        return findViewDepth.startsWith("_") ? findViewDepth.substring(1) : findViewDepth;
                    }
                }
            }
        }
        return null;
    }

    public List<View> findView(Matcher matcher) {
        for (View filter : findRoots()) {
            List<View> filter2 = filter(filter, matcher);
            if (filter2 != null && filter2.size() > 0) {
                return filter2;
            }
        }
        return null;
    }
}
