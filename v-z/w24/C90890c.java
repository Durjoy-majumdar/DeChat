package w24;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import u24.C90600i;

/* renamed from: w24.c */
public class C90890c implements Serializable {

    /* renamed from: d */
    public Throwable f260869d = null;

    public C90890c(C90889b bVar) {
        if (bVar instanceof Throwable) {
            this.f260869d = (Throwable) bVar;
            return;
        }
        throw new IllegalArgumentException("The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable");
    }

    /* renamed from: a */
    public void mo124984a(PrintWriter printWriter) {
        Throwable th = this.f260869d;
        if (!(C90888a.f260867c != null)) {
            ArrayList arrayList = new ArrayList();
            while (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter2 = new PrintWriter(stringWriter, true);
                if (th instanceof C90889b) {
                    ((C90889b) th).mo124982a(printWriter2);
                } else {
                    th.printStackTrace(printWriter2);
                }
                String stringBuffer = stringWriter.getBuffer().toString();
                Object obj = C90888a.f260865a;
                StringTokenizer stringTokenizer = new StringTokenizer(stringBuffer, C90600i.f260316b);
                ArrayList arrayList2 = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList2.add(stringTokenizer.nextToken());
                }
                arrayList.add((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                synchronized (C90888a.f260865a) {
                    th = C90888a.m114015b(th, C90888a.f260866b);
                }
            }
            int size = arrayList.size() - 1;
            while (size > 0) {
                String[] strArr = (String[]) arrayList.get(size);
                int i = size - 1;
                ArrayList arrayList3 = new ArrayList(Arrays.asList(strArr));
                ArrayList arrayList4 = new ArrayList(Arrays.asList((String[]) arrayList.get(i)));
                Object obj2 = C90888a.f260865a;
                int size2 = arrayList3.size() - 1;
                int size3 = arrayList4.size();
                while (true) {
                    size3--;
                    if (size2 < 0 || size3 < 0) {
                        int length = strArr.length - arrayList3.size();
                    } else {
                        if (((String) arrayList3.get(size2)).equals((String) arrayList4.get(size3))) {
                            arrayList3.remove(size2);
                        }
                        size2--;
                    }
                }
                int length2 = strArr.length - arrayList3.size();
                if (length2 > 0) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("\t... ");
                    stringBuffer2.append(length2);
                    stringBuffer2.append(" more");
                    arrayList3.add(stringBuffer2.toString());
                    arrayList.set(size, arrayList3.toArray(new String[arrayList3.size()]));
                }
                size = i;
            }
            synchronized (printWriter) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (String println : (String[]) it.next()) {
                        printWriter.println(println);
                    }
                    if (it.hasNext()) {
                        printWriter.print("Caused by: ");
                    }
                }
            }
        } else if (th instanceof C90889b) {
            ((C90889b) th).mo124982a(printWriter);
        } else {
            th.printStackTrace(printWriter);
        }
    }
}
