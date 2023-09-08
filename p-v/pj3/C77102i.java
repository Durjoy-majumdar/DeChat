package pj3;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: pj3.i */
public class C77102i {

    /* renamed from: c */
    public static HashMap<String, Constructor<?>> f225204c = new HashMap<>();

    /* renamed from: d */
    public static final Class<?>[] f225205d = {Context.class, AttributeSet.class};

    /* renamed from: a */
    public final Context f225206a;

    /* renamed from: b */
    public final Object[] f225207b = new Object[2];

    public C77102i(Context context) {
        this.f225206a = context;
    }

    /* renamed from: a */
    public final Preference mo107421a(String str, String str2, AttributeSet attributeSet) {
        String str3;
        String str4;
        Constructor<?> constructor = f225204c.get(str);
        if (constructor == null) {
            try {
                Log.m105919d(APMidasPayAPI.ENV_TEST, "fuck test mContext:%s", this.f225206a.getResources().toString());
                ClassLoader classLoader = this.f225206a.getClassLoader();
                if (str2 != null) {
                    str4 = str2 + str;
                } else {
                    str4 = str;
                }
                constructor = classLoader.loadClass(str4).getConstructor(f225205d);
                f225204c.put(str, constructor);
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(attributeSet.getPositionDescription());
                sb.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb.append(str);
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            } catch (ClassNotFoundException e2) {
                throw e2;
            } catch (Exception e3) {
                if (attributeSet == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("(null): Error inflating class ");
                    sb4.append(constructor);
                    str3 = sb4.toString() != null ? constructor.getClass().getName() : "(null)";
                } else {
                    str3 = attributeSet.getPositionDescription();
                }
                InflateException inflateException2 = new InflateException(str3);
                inflateException2.initCause(e3);
                throw inflateException2;
            }
        }
        Object[] objArr = this.f225207b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    public final Preference mo107422b(XmlPullParser xmlPullParser, String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? mo107421a(str, "com.tencent.mm.ui.base.preference.", attributeSet) : mo107421a(str, (String) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: c */
    public void mo107423c(XmlPullParser xmlPullParser, C47511g gVar, boolean z) {
        synchronized (this.f225207b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f225207b[0] = this.f225206a;
            try {
                int next = xmlPullParser.next();
                while (next != 2 && next != 1) {
                    next = xmlPullParser.next();
                }
                if (next == 2) {
                    mo107422b(xmlPullParser, xmlPullParser.getName(), asAttributeSet);
                    mo107424d(xmlPullParser, gVar, asAttributeSet);
                } else {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
            } catch (InflateException e) {
                throw e;
            } catch (XmlPullParserException e2) {
                InflateException inflateException = new InflateException(e2.getMessage());
                inflateException.initCause(e2);
                throw inflateException;
            } catch (IOException e3) {
                InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                inflateException2.initCause(e3);
                throw inflateException2;
            }
        }
    }

    /* renamed from: d */
    public final void mo107424d(XmlPullParser xmlPullParser, C47511g gVar, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        int next = xmlPullParser.next();
        while (true) {
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next != 2) {
                next = xmlPullParser.next();
            } else {
                gVar.mo72524h(mo107422b(xmlPullParser, xmlPullParser.getName(), attributeSet), -1);
                next = xmlPullParser.next();
            }
        }
    }
}
