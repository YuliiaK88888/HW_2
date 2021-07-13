//public class Stars {
//
//         //first case
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//       // second case
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }                                    // Почему тут основной фор у меня закрывается
//                                                  // сразу и все работает, а втретьем
//                                                   // случае - в самом конце и тоже работает?
//
//        for (int k = 0; k < 7; k++) {
//            if (k > 0 && k < 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//        for (int p = 0; p < 7; p++) {
//            if (p > 0 && p < 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//        for (int d = 0; d < 7; d++) {
//            if (d > 0 && d < 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int q = 0; q < 7; q++) {
//            if (q > 0 && q < 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int v = 0; v < 7; v++) {
//            if (v > 0 && v < 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int r = 0; r < 7; r++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//
//       //  third case
//        public static void main(String[] args) {
//            for (int i = 0; i < 1; i++) {
//                for (int j = 0; j < 7; j++) {
//                    System.out.print("* ");
//                }
//
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0 && q != 5) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0 && q != 4) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0 && q != 3) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0 && q != 2) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0 && q != 1) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//
//                System.out.println();
//
//                for (int q = 0; q < 7; q++) {
//                    if (q > 0) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//
//       //  fourth case
//        public static void main(String[] args) {
//            for (int i = 0; i < 1; i++) {
//                for (int j = 0; j < 1; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//                for (int q = 0; q < 2; q++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//                for (int s = 0; s < 3; s++) {
//                    if (s == 1) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int p = 0; p < 4; p++) {
//                    if (p != 0 && p != 3) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int h = 0; h < 5; h++) {
//                    if (h != 0 && h != 4) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int f = 0; f < 6; f++) {
//                    if (f != 0 && f != 5) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//                System.out.println();
//
//                for (int m = 0; m < 7; m++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//
//        }
//
//         //fifth case
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 7; i++) {
//            if (i != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int k = 0; k < 7; k++) {
//            if (k < 5) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int s = 0; s < 7; s++) {
//            if (s != 4 && s != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int d = 0; d < 7; d++) {
//            if (d != 3 && d != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int g = 0; g < 7; g++) {
//            if (g != 2 && g != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int g = 0; g < 7; g++) {
//            if (g != 1 && g != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//
//        for (int r = 0; r < 7; r++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
//
//      //  sixth case
//       public static void main(String[] args) {
//           for (int i = 0; i < 7; i++) {
//               System.out.print("* ");
//           }
//           System.out.println();
//
//           for (int k = 0; k < 7; k++) {
//               if (k != 1 && k != 6) {
//                   System.out.print("  ");
//               } else {
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//
//           for (int k = 0; k < 7; k++) {
//               if (k != 2 && k != 6) {
//                   System.out.print("  ");
//               } else {
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//
//           for (int k = 0; k < 7; k++) {
//               if (k != 3 && k != 6) {
//                   System.out.print("  ");
//               } else {
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//
//           for (int k = 0; k < 7; k++) {
//               if (k != 4 && k != 6) {
//                   System.out.print("  ");
//               } else {
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//
//           for (int k = 0; k < 7; k++) {
//               if (k != 5 && k != 6) {
//                   System.out.print("  ");
//               } else {
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//
//           for (int x = 0; x < 7; x++) {
//               if (x == 6) {
//                   System.out.print("* ");
//               } else {
//                   System.out.print("  ");
//               }
//           }
//           System.out.println();
//       }
//
//       // seventh case
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 7; i++) {
//            if (i != 0 && i != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 7; i++) {
//            if (i != 1 && i != 5) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 7; i++) {
//            if (i != 2 && i != 4) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 7; i++) {
//            if (i != 3) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//        for (int i = 0; i < 7; i++) {
//            if (i != 2 && i != 4) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//
//        for (int i = 0; i < 7; i++) {
//            if (i != 1 && i != 5) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//        for (int i = 0; i < 7; i++) {
//            if (i != 0 && i != 6) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//    }
//
//        // eighth case
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 7; i++) {
//            System.out.print("* ");
//        }
//
//        System.out.println();
//
//        for (int q = 0; q < 7; q++) {
//            if (q != 1 && q != 5) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int q = 0; q < 7; q++) {
//            if (q != 2 && q != 4) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int q = 0; q < 7; q++) {
//            if (q != 3) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//
//    }
//
//        //ninth case
//
//    public static void main(String[] args) {
//        for (int q = 0; q < 7; q++) {
//            if (q != 3) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//        for (int q = 0; q < 7; q++) {
//            if (q != 2 && q != 4) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int q = 0; q < 7; q++) {
//            if (q != 1 && q != 5) {
//                System.out.print("  ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 7; i++) {
//            System.out.print("* ");
//        }
//
//        System.out.println();
//
//
//    }
//
//    }
//
