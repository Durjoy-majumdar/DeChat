package com.tencent.kinda.framework.animate;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.tencent.kinda.framework.widget.base.MMKView;
import com.tencent.kinda.gen.KView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm0.C86937f0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Deprecated
public class KindaAnimatorViewProxy implements InvocationHandler {
    private static final String TAG = "MicroMsg.Kinda.KindaAnimatorViewProxy";
    private static ArgbEvaluator defaultArgbEvaluator = new ArgbEvaluator();
    private static DoubleEvaluator defaultDoubleEvaluator = new DoubleEvaluator();
    private static LongEvaluator defaultLongEvaluator = new LongEvaluator();
    /* access modifiers changed from: private */
    public MMKView target = null;

    public static class DoubleEvaluator implements TypeEvaluator<Number> {
        public Number evaluate(float f, Number number, Number number2) {
            double doubleValue = number.doubleValue();
            return Double.valueOf(doubleValue + (((double) f) * (number2.doubleValue() - doubleValue)));
        }
    }

    public static class LongEvaluator implements TypeEvaluator<Number> {
        public Number evaluate(float f, Number number, Number number2) {
            long longValue = number.longValue();
            return Long.valueOf((long) (((float) longValue) + (f * ((float) (number2.longValue() - longValue)))));
        }
    }

    private ValueAnimator buildAnimator(final Method method, Method method2, Object obj) {
        if (obj.getClass().equals(Integer.class)) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((Integer) method2.invoke(this.target, new Object[0])).intValue(), ((Integer) obj).intValue()});
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    try {
                        method.invoke(KindaAnimatorViewProxy.this.target, new Object[]{Integer.valueOf(intValue)});
                    } catch (Exception unused) {
                    }
                }
            });
            ofInt.setDuration(KindaGlobalAnimator.animateDuration());
            return ofInt;
        } else if (obj.getClass().equals(Long.class)) {
            if (method.getName().equals(C86937f0.NAME)) {
                ValueAnimator.ofObject(defaultArgbEvaluator, new Object[]{Integer.valueOf((int) ((Long) method2.invoke(this.target, new Object[0])).longValue()), Integer.valueOf((int) ((Long) obj).longValue())}).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        try {
                            method.invoke(KindaAnimatorViewProxy.this.target, new Object[]{Long.valueOf((long) intValue)});
                        } catch (Exception unused) {
                        }
                    }
                });
                return null;
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(defaultLongEvaluator, new Object[]{(Long) method2.invoke(this.target, new Object[0]), (Long) obj});
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    long longValue = ((Long) valueAnimator.getAnimatedValue()).longValue();
                    try {
                        method.invoke(KindaAnimatorViewProxy.this.target, new Object[]{Long.valueOf(longValue)});
                    } catch (Exception unused) {
                    }
                }
            });
            ofObject.setDuration(KindaGlobalAnimator.animateDuration());
            return ofObject;
        } else if (obj.getClass().equals(Float.class)) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) method2.invoke(this.target, new Object[0])).floatValue(), ((Float) obj).floatValue()});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    try {
                        method.invoke(KindaAnimatorViewProxy.this.target, new Object[]{Float.valueOf(floatValue)});
                    } catch (Exception unused) {
                    }
                }
            });
            ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
            return ofFloat;
        } else if (!obj.getClass().equals(Double.class)) {
            return null;
        } else {
            ValueAnimator ofObject2 = ValueAnimator.ofObject(defaultDoubleEvaluator, new Object[]{(Double) method2.invoke(this.target, new Object[0]), (Double) obj});
            ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    double doubleValue = ((Double) valueAnimator.getAnimatedValue()).doubleValue();
                    try {
                        method.invoke(KindaAnimatorViewProxy.this.target, new Object[]{Double.valueOf(doubleValue)});
                    } catch (Exception unused) {
                    }
                }
            });
            ofObject2.setDuration(KindaGlobalAnimator.animateDuration());
            return ofObject2;
        }
    }

    private boolean checkHasPrimitiveTypeParams(Object[] objArr) {
        if (objArr != null && objArr.length > 0 && objArr.length == 1) {
            Object obj = objArr[0];
            return obj.getClass().isPrimitive() || obj.getClass().equals(Integer.class) || obj.getClass().equals(Long.class) || obj.getClass().equals(Float.class) || obj.getClass().equals(Double.class);
        }
    }

    private Method getterMethod(Class cls, String str) {
        for (Method method : cls.getMethods()) {
            if (method.getName().startsWith("get") && method.getName().toLowerCase().endsWith(str.toLowerCase())) {
                return method;
            }
        }
        return null;
    }

    private String propName(Method method) {
        if (method == null || !method.getName().startsWith("set")) {
            return null;
        }
        return method.getName().substring(3);
    }

    public static KView unWrapRealObj(Object obj) {
        if (obj instanceof Proxy) {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
                if (invocationHandler instanceof KindaAnimatorViewProxy) {
                    return ((KindaAnimatorViewProxy) invocationHandler).target;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "unWrapRealObj %s", e.getMessage());
            }
        }
        if (obj instanceof KView) {
            return (KView) obj;
        }
        return null;
    }

    public static Object unwrapProxyObject(Object obj) {
        if (!(obj instanceof Proxy)) {
            return obj;
        }
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof KindaAnimatorViewProxy ? ((KindaAnimatorViewProxy) invocationHandler).target : obj;
        } catch (Exception unused) {
            return obj;
        }
    }

    private Object[] unwrapProxyParams(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return objArr;
        }
        Object[] objArr2 = new Object[objArr.length];
        int i = 0;
        for (Object obj : objArr) {
            objArr2[i] = obj;
            if (obj instanceof Proxy) {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
                    if (invocationHandler instanceof KindaAnimatorViewProxy) {
                        objArr2[i] = ((KindaAnimatorViewProxy) invocationHandler).target;
                    }
                } catch (Exception unused) {
                    objArr2[i] = obj;
                }
            }
            i++;
        }
        return objArr2;
    }

    public MMKView getTarget() {
        return this.target;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        String propName;
        Method method2;
        ValueAnimator buildAnimator;
        try {
            if (!KindaGlobalAnimator.hasAnimate() || !method.getName().startsWith("set") || !checkHasPrimitiveTypeParams(objArr) || method.getReturnType() != Void.TYPE || (propName = propName(method)) == null || propName.length() <= 0 || (method2 = getterMethod(this.target.getClass(), propName)) == null || (buildAnimator = buildAnimator(method, method2, objArr[0])) == null) {
                return method.invoke(this.target, unwrapProxyParams(objArr));
            }
            KindaGlobalAnimator.addAnimator(buildAnimator);
            return null;
        } catch (InvocationTargetException e) {
            Log.printErrStackTrace(TAG, e, "invoke %s error: %s %s", method.getName(), e.getMessage(), this.target);
            return null;
        } catch (IllegalAccessException e2) {
            Log.printErrStackTrace(TAG, e2, "invoke %s error: %s %s", method.getName(), e2.getMessage(), this.target);
            return null;
        } catch (IllegalArgumentException e3) {
            Log.printErrStackTrace(TAG, e3, "invoke %s error: %s %s", method.getName(), e3.getMessage(), this.target);
            return null;
        }
    }

    public void setTarget(MMKView mMKView) {
        this.target = mMKView;
    }
}
