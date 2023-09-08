package com.tencent.kinda.framework.widget.tools;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class KindaContext {
    private static final String TAG = "KindaContext";
    private static final Stack<WeakReference<Context>> sContextStack = new Stack<>();

    private static void clearNullContextOfStack() {
        Stack<WeakReference<Context>> stack = sContextStack;
        if (stack != null && stack.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<Context>> it = stack.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                if (((Context) next.get()) == null) {
                    arrayList.add(next);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                WeakReference weakReference = (WeakReference) it4.next();
                sContextStack.remove(weakReference);
                Log.m105924i(TAG, "clearNullContextOfStack sContextStack.remove:[" + weakReference.get() + "]");
            }
        }
    }

    public static Context get() {
        return getUsableContext();
    }

    public static Stack<WeakReference<Context>> getContextStack() {
        return sContextStack;
    }

    public static Activity getTopActivity() {
        Stack<WeakReference<Context>> stack = sContextStack;
        Activity activity = null;
        if (stack == null) {
            Log.m105920e(TAG, "KindaContext is null then return case3");
            return null;
        }
        clearNullContextOfStack();
        if (stack.size() == 0) {
            Log.m105920e(TAG, "KindaContext is stack is null then return case4");
            return null;
        }
        Stack stack2 = new Stack();
        stack2.addAll(stack);
        Context context = null;
        while (true) {
            if (stack2.empty()) {
                break;
            }
            WeakReference weakReference = (WeakReference) stack2.pop();
            if (weakReference != null) {
                context = (Context) weakReference.get();
            }
            if (context instanceof Activity) {
                Activity activity2 = (Activity) context;
                if (!activity2.isFinishing()) {
                    activity = activity2;
                    break;
                }
            }
        }
        Log.m105924i(TAG, "getTopActivity finally return [" + activity + "]");
        return activity;
    }

    public static Activity getTopOrUIPageFragmentActivity() {
        Stack<WeakReference<Context>> stack = sContextStack;
        Activity activity = null;
        if (stack == null) {
            Log.m105920e(TAG, "KindaContext is null then return case1");
            return null;
        }
        clearNullContextOfStack();
        if (stack.size() == 0) {
            Log.m105920e(TAG, "KindaContext is stack is null then return case2");
            return null;
        }
        Stack stack2 = new Stack();
        stack2.addAll(stack);
        Context context = null;
        Activity activity2 = null;
        while (true) {
            if (stack2.empty()) {
                break;
            }
            WeakReference weakReference = (WeakReference) stack2.pop();
            if (weakReference != null) {
                context = (Context) weakReference.get();
            }
            if (context instanceof Activity) {
                Activity activity3 = (Activity) context;
                if (!activity3.isFinishing()) {
                    if (activity2 == null) {
                        activity2 = activity3;
                    }
                    if (activity3 instanceof UIPageFragmentActivity) {
                        activity = (UIPageFragmentActivity) activity3;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (activity == null) {
            activity = activity2;
        }
        Log.m105924i(TAG, "getTopOrUIPageFragmentActivity finally return [" + activity + "]");
        return activity;
    }

    private static Context getUsableContext() {
        Stack<WeakReference<Context>> stack = sContextStack;
        Context context = null;
        if (stack == null) {
            Log.m105920e(TAG, "The sContextStack is null then getUsableContext return null! case1");
            return null;
        }
        clearNullContextOfStack();
        String printContextStack = printContextStack();
        if (stack.size() == 0) {
            Log.m105920e(TAG, "The sContextStack is empty, so that return null! case2");
            return null;
        }
        WeakReference peek = stack.peek();
        if (peek != null) {
            context = (Context) peek.get();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                stack.pop();
                Log.m105924i(TAG, "getUsableContext，sContextStack.pop:[" + activity + "]");
                context = getUsableContext();
            }
        }
        if (context == null) {
            Log.m105920e(TAG, "getUsableContext get null and the sContextStack before call：" + printContextStack);
        } else {
            Log.m105924i(TAG, "getUsableContext get value：" + context);
        }
        return context;
    }

    private static void init() {
        Log.m105924i(TAG, "KindaContext has finish init.");
    }

    public static void initStack() {
        init();
    }

    public static void popToContext(Context context) {
        Stack<WeakReference<Context>> stack;
        if (context != null) {
            Log.m105918d(TAG, "popToContext run");
            boolean z = false;
            Iterator<WeakReference<Context>> it = sContextStack.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() != null && context == next.get()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                do {
                    stack = sContextStack;
                    WeakReference peek = stack.peek();
                    if (peek == null || peek.get() != context) {
                        stack.pop();
                        String obj = (peek == null || peek.get() == null) ? "null" : peek.toString();
                        Log.m105924i(TAG, "popToContext pop context：" + obj);
                    } else {
                        Log.m105924i(TAG, "popToContext break");
                        return;
                    }
                } while (stack.size() > 0);
            }
        }
    }

    private static String printContextStack() {
        StringBuilder sb = new StringBuilder("\n\t");
        Iterator<WeakReference<Context>> it = sContextStack.iterator();
        while (it.hasNext()) {
            Context context = (Context) it.next().get();
            if (context != null) {
                sb.append(context.toString());
                sb.append("\n\t");
            } else {
                sb.append("null");
                sb.append("\n\t");
            }
        }
        return sb.toString();
    }
}
