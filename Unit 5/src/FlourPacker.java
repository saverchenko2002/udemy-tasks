public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < bigCount; i++) {
            sum += 5;
            if (sum > goal) {
                sum -= 5;
                break;
            } else if (sum == goal) {
                return true;
            }
        }

        for (int i = 0; i < smallCount; i++) {
            if (sum == goal) {
                return true;
            }
            sum+=1;
        }
        return sum==goal;
    }
}
