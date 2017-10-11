package fr.inria.targets;

@TransformSingleton
public class SingletonTarget {
    static int instances = 0;

    public SingletonTarget() {
        instances++;
    }

    public static int getNbInstances() {
        return instances;
    }
}
