package com.tencent.tinker.loader;

import com.tencent.xweb.file.XVFSFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public final class TinkerClassLoader extends PathClassLoader {
    private final ClassLoader mOriginAppClassLoader;

    public class CompoundEnumeration<E> implements Enumeration<E> {
        private Enumeration<E>[] enums;
        private int index = 0;

        public CompoundEnumeration(Enumeration<E>[] enumerationArr) {
            this.enums = enumerationArr;
        }

        public boolean hasMoreElements() {
            while (true) {
                int i = this.index;
                Enumeration<E>[] enumerationArr = this.enums;
                if (i >= enumerationArr.length) {
                    return false;
                }
                Enumeration<E> enumeration = enumerationArr[i];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.index++;
            }
        }

        public E nextElement() {
            if (hasMoreElements()) {
                return this.enums[this.index].nextElement();
            }
            throw new NoSuchElementException();
        }
    }

    public TinkerClassLoader(String str, File file, String str2, ClassLoader classLoader) {
        super("", str2, ClassLoader.getSystemClassLoader());
        this.mOriginAppClassLoader = classLoader;
        injectDexPath(this, str, file);
    }

    private static void injectDexPath(ClassLoader classLoader, String str, File file) {
        try {
            ArrayList arrayList = new ArrayList(16);
            for (String str2 : str.split(XVFSFile.PATH_SEPARATOR)) {
                if (!str2.isEmpty()) {
                    arrayList.add(new File(str2));
                }
            }
            if (!arrayList.isEmpty()) {
                SystemClassLoaderAdder.injectDexesInternal(classLoader, arrayList, file);
            }
        } catch (Throwable th) {
            throw new TinkerRuntimeException("Fail to create TinkerClassLoader.", th);
        }
    }

    public Class<?> findClass(String str) {
        Class<?> cls;
        try {
            cls = super.findClass(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.mOriginAppClassLoader.loadClass(str);
    }

    public URL getResource(String str) {
        URL resource = Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        URL findResource = findResource(str);
        return findResource != null ? findResource : this.mOriginAppClassLoader.getResource(str);
    }

    public Enumeration<URL> getResources(String str) {
        return new CompoundEnumeration(new Enumeration[]{Object.class.getClassLoader().getResources(str), findResources(str), this.mOriginAppClassLoader.getResources(str)});
    }
}
