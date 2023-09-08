package qw3;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: qw3.c */
public class C89855c {

    /* renamed from: c */
    public static final Class<?>[] f258290c = {Context.class, AttributeSet.class};

    /* renamed from: d */
    public static HashMap<String, Constructor<?>> f258291d = new HashMap<>();

    /* renamed from: a */
    public final Context f258292a;

    /* renamed from: b */
    public final Object[] f258293b = new Object[2];

    public C89855c(Context context) {
        this.f258292a = context;
    }

    /* renamed from: a */
    public final Preference mo124145a(String str, String str2, AttributeSet attributeSet) {
        String str3;
        String str4;
        Constructor<?> constructor = f258291d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f258292a.getClassLoader();
                if (str2 != null) {
                    str4 = str2 + str;
                } else {
                    str4 = str;
                }
                constructor = classLoader.loadClass(str4).getConstructor(f258290c);
                f258291d.put(str, constructor);
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
        Object[] objArr = this.f258293b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    public final Preference mo124146b(XmlPullParser xmlPullParser, String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? mo124145a(str, "android.preference.", attributeSet) : mo124145a(str, (String) null, attributeSet);
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
    public void mo124147c(XmlPullParser xmlPullParser, C89853a aVar, boolean z) {
        synchronized (this.f258293b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f258293b[0] = this.f258292a;
            try {
                int next = xmlPullParser.next();
                while (next != 2 && next != 1) {
                    next = xmlPullParser.next();
                }
                if (next == 2) {
                    mo124146b(xmlPullParser, xmlPullParser.getName(), asAttributeSet);
                    mo124148d(xmlPullParser, aVar, asAttributeSet);
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
    public final void mo124148d(XmlPullParser xmlPullParser, C89853a aVar, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        int next = xmlPullParser.next();
        while (true) {
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next != 2) {
                next = xmlPullParser.next();
            } else {
                C89854b bVar = (C89854b) aVar;
                bVar.mo124136a(mo124146b(xmlPullParser, xmlPullParser.getName(), attributeSet), -1);
                if (!bVar.f258287q) {
                    bVar.notifyDataSetChanged();
                }
                next = xmlPullParser.next();
            }
        }
    }
}
